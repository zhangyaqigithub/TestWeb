package conn;

import com.mysql.jdbc.Connection;

public class Conn {
	private String driver="com.mysql.jdbc.Driver";
	private String url="mysql:jdbc//localhost:8080/we";
	private String username="root";
	private String password="root";
	private Connection conn ;
	public Connection getConn() {
		
		return conn;
	}
}
