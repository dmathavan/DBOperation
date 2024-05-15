package dboperationpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		// TODO Auto-generated method stub
        //connect with DB
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_user");
		//jdbc:mysql://localhost:3306/selenium_user","root"."root"
	     Statement sta = connect.createStatement();
	     ResultSet   result   = sta.executeQuery("select * From My_Tablename");
	     Thread.sleep(2000);	
	     while(result.next()){
	    	 System.out.println("Name:"+result.getString(1));
	    	 
	     }
	 
	}

}
