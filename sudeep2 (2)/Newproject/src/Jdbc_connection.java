import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc_connection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost:3306/";
		String driver= "com.mysql.jdbc.Driver";
		Connection con=  null;
		Statement stmt= null;
		String dbname= "test";
		String username = "root";
		String password= "root";
		try{
		Class.forName(driver).newInstance();
		con= DriverManager.getConnection(url+dbname, username, password);
		
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from rahul");
            
            while(rs.next()){
            	System.out.println(rs.getString(1));
            }
		}catch(Exception e){
			e.printStackTrace();
		}
            
	}

}
