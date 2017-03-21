package util;

/*
 * DBConnector  Javaからmysqlに接続する
 * @author Kayoko Ueki
 * @since 3/7
 * @version 1.1
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * データベースと接続するためのクラス
 * @author Kayoko Ueki
 * @since 3/7
 * @version 1.1
 */

public class DBConnector {

//ドライバー名
private static String driverName ="com.mysql.jdbc.Driver";
//接続先のアドレス
private static String url="jdbc:mysql://localhost/gochikag";
//接続先の管理者名
private static String user="root";
//接続先のパスワード
private static String password="KKznzn92";
//DBConnectorのコンストラクタ（引数なし）
public DBConnector(){}
//DBConnectorのコンストラクタ（引数あり）
public DBConnector(String url){
	this.url = "jdbc:mysql://localhost/" + url;
}

//内部処理
public Connection getConnection(){
	Connection con = null;
	try{
		//JavaとMysqlを接続
		//引数にはドライバー名を入れる
		Class.forName(driverName);
		//JavaからMysqlのある特定のアドレスまでの経路をつくる
		con=(Connection)DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	//JavaからMysqlのある特定のアドレスまでの経路
	return con;
	}
}
