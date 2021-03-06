package util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoDBConnector {

	private MongoClient mongo = null;

	@SuppressWarnings("deprecation")


	public DB getConnection() throws UnknownHostException{

		DB db = null;

		// Mongodbに接続

		mongo = new MongoClient("localhost" , 27017);

		// dbに値を飛ばす

		db = mongo.getDB("gochikag");

		return db;
	}


	// Mongodbを閉じる。

	public void closeConnection(){
		mongo.close();
	}

}
