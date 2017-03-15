package dao;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

import util.MongoDBConnector;

public class InfoMongoDAO {

	public boolean insert(String name,String mail,String info) throws UnknownHostException{


		boolean result = false;

		/*
		 *  時間の取得
		 */

		Calendar cal = Calendar.getInstance();
		TimeZone tz = TimeZone.getTimeZone("Asia/Tokyo");
		cal.setTimeZone(tz);
		SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd HH/mm");
		String dt = sdf.format(cal.getTime());

		/*
		 * Mongoに接続
		 */

		MongoDBConnector con = new MongoDBConnector();
		DB db = con.getConnection();

		/*
		 * コレクション名
		 */

		DBCollection coll = db.getCollection("info");
		BasicDBObject input = new BasicDBObject();

			/*
			 *  insert
			 */

			input.put("name", name);
			input.put("mail", mail);
			input.put("info",info);
			input.put("registration_date", dt);

			coll.insert(input);

			result = true;

			return result;


	}

}
