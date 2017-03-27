package dao;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.opensymphony.xwork2.ActionSupport;

import dto.AdminInfoDTO;
import util.MongoDBConnector;


/**
 * AdminInfoDAO お問い合わせ管理画面の検索・削除用クラス
 * @author YONEJIMA AI
 * @since 2017/03/16
 * @version 1.1
 */
public class AdminInfoDAO extends ActionSupport{


    /**
     * select
     * Listの作成
     */

    public List<AdminInfoDTO> infoList = new ArrayList<>();

    /**
     * カテゴリからお問い合わせ情報を取得するメソッド
     * @param title 件名
     * @param name お名前
     * @param mail メールアドレス
     * @param info お問い合わせ内容
     * @param date registration_date お問い合わせ日時
     * @throws UnknownHostException
     */

    public List<AdminInfoDTO> select() throws UnknownHostException {

        /**
         * Mongoに接続
         */
        MongoDBConnector con = new MongoDBConnector();
        DB db = con.getConnection();

        /**
         * コレクション名
         */
        DBCollection coll = db.getCollection("info");

        /**
         * select カーソルリストの検索
         */

        DBCursor cursor = coll.find();

        try{

                while(cursor.hasNext()){

                    /**
                     * 検索結果をAdminInfoDTOに格納
                     * @param infoList 検索情報のリスト化
                     */

                    AdminInfoDTO dto = new AdminInfoDTO();
                    DBObject dbs = cursor.next();
                    dto.setTitle((String) dbs.get("title"));
                    dto.setName((String) dbs.get("name"));
                    dto.setMail((String) dbs.get("mail"));
                    dto.setInfo((String) dbs.get("info"));
                    dto.setDate((String) dbs.get("registration_date"));
                    infoList.add(dto);
                }

        }finally{

            cursor.close();

            /**
             * Mongo切断
             */

            if(con != null) con.closeConnection();

        }

        return infoList;

    }

    /**
     * delete
     */

    public boolean delete(String mail,String date) throws UnknownHostException{

        boolean result = false;

        /**
         * 選択された情報の削除を行うメソッド
         * @param mail メールアドレス
         * @param date [mongo:registration_date] お問い合わせ日時
         * （paramで照合）
         */

        MongoDBConnector con = new MongoDBConnector();
        DB db = con.getConnection();

        /*
         * コレクション名
         */
        DBCollection coll = db.getCollection("info");

        /*
         * delete
         */

        try{

            BasicDBObject doc = new BasicDBObject("mail",mail).append("registration_date",date);
            DBCursor cursor = coll.find(doc);
            coll.remove(coll.findOne(doc));

            result = true;

            try{
                while(cursor.hasNext()){

                }

            }finally{
                cursor.close();
            }

        }finally{

            /*
             * Mongo切断
             */

            if(con != null) con.closeConnection();
        }

        return result;

    }

}