package flower_shop.DB;

import java.sql.Connection;
import java.sql.DriverManager;



public class connectDB {
	public connectDB(){
		super();
}
public static Connection creatConnection() {
	Connection conn = null ;
	String url="jdbc:mysql://localhost:3306/db_flower_shop";
	String username = "root";
	String password= "12345";

	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password);
		System.out.println("Successful connection!!!");
	} catch (Exception er) {
		er.printStackTrace();
	}
	return conn;
}
public static void main(String[] args) {
	System.out.println(creatConnection());
}
}