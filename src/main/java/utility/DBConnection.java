package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
public static Connection getConnection() {
	Connection con=null;
	try {Class.forName("com.mysql.cj.jdbc.Driver");}
    catch(ClassNotFoundException ex){ex.printStackTrace();}
    try {con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");}
    catch(SQLException ex) {ex.printStackTrace();}
    return con;
}
}
