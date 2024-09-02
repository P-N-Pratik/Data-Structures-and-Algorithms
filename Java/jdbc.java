import java.sql.*;
import java.util.*;
import java.lang.String.*;
class CreateJDBC
{
	public static void main(String[] args)
	{
		try
		{
			//load the Driver
			//('com.mysql.cj.jdbc.Driver')
			//("com.mysql.jdbc.Driver")
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create the Connection
			//String url="jdbc:mysql://localhost:3306/hello";
			//String username="root";
			//String password="________"
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hello","root","138746");
			String q="CREATE TABLE EMPLOYEE(Emp_id int(20) PRIMARY KEY auto_increment,Emp_Name varchar(20) NOT NULL,Emp_salary int(20) NOT NULL)";
			Statement stmt= con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table Created Successfully ");
			con.close();
			
			if(con.isClosed())
			{
				System.out.println("Connection is Closed");
			}else
			{
				System.out.println("Connected Successfully");
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}