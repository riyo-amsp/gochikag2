package com.internousdev.gochikag.dao;
 
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.internousdev.gochikag.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
 
/**
 * InfoMongoDAO お問い合わせ画面インサート用クラス
 * @author YONESHIMA AI
 * @since 2017/03/16
 * @version 1.1
 */
public class InfoMongoDAO {
 
    /**
     * お問い合わせ画面から情報をmongodbにインサートするメソッド
     * @param title 件名
     * @param name お名前
     * @param mail メールアドレス
     * @param info お問い合わせ内容
     * @param date registration_date お問い合わせ日時
     * @throws UnknownHostException
     */
    public boolean insert(String title,String name,String mail,String info) throws UnknownHostException{
 
 
        boolean result = false;
 
        /*
         *  時間の取得
         */
 
        Calendar cal = Calendar.getInstance();
        TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
        cal.setTimeZone(tz);
        SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd HH:mm");
        String dt = sdf.format(cal.getTime());
 
        //System.out.println("dt"+dt);
 
        /*
         * Mongoに接続
         */
 
        MongoDBConnector con = new MongoDBConnector();
        DB db = con.getConnection();
 
        //System.out.println("cc");
 
        /*
         * コレクション名
         */
 
        DBCollection coll = db.getCollection("info");
 
        /*
         *  insert
         */
        BasicDBObject input = new BasicDBObject();
 
            input.put("title", title);
            input.put("name", name);
            input.put("mail", mail);
            input.put("info",info);
            input.put("registration_date", dt);
 
            coll.insert(input);
 
            /*
             * MongoDB内の件数が１００件超えた場合、最初の行を削除する
             */
 
            long count = coll.getCount();
 
            if( count == 101){
                DBObject del = coll.findOne();
                coll.remove(del);
            }
 
            result = true;
 
            if(con != null) con.closeConnection();
 
            return result;
    }
}