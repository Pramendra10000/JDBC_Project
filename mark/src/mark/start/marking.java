package mark.start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class marking {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306";
		String name= "root";
		String pass="password";
		String qry= "CREATE TABLE Emp.finished (\n"
				+ "			    id int NOT NULL AUTO_INCREMENT,\n"
				+ "			    LastName varchar(255) NOT NULL,\n"
				+ "			    FirstName varchar(255),\n"
				+ "			    Age int,\n"
				+ "			    PRIMARY KEY (id)\n"
				+ "			);";
		
		String qry2="insert into Emp.finished (id,LastName,FirstName,Age) values(111,'Bean','Stack',20)";
	 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection(url, name, pass);
			PreparedStatement pstmt = con.prepareStatement(qry2);
			pstmt.executeUpdate();
			
			System.out.println("Data  inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
