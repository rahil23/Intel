import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Database{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/";
		Connection con= null;
		Statement stmt= null;
		 String driver= "com.mysql.jdbc.Driver";
		 String username= "root";
		 String password= "root";
		 String dbname= "rahul";
		 
		 
		 Class.forName(driver).newInstance();
		 con= (Connection)DriverManager.getConnection(url+dbname, username, password);
		 stmt= (Statement)con.createStatement();
		 ResultSet rs= ((java.sql.Statement) stmt).executeQuery("select * from rahul");
		 while(rs.next()){
			 System.out.println(rs.getString(1)+" "+rs.getString(2));
		 }
		 
		 
		 

	}

}
