// 1st Program for jdbc

import java.sql.*;
import java.uitl.*;
class FirstJDBC
{
	public static void main(String[] args)
	{
		try
		{
			//load the Driver
			Class.forname("com.mysql.jdbc.Driver");
			
			//Create the Connection
			//String url="jdbc:mysql://localhost:3306/hello";
			//String username="root";
			//String password="________"
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hello","root","138746");
			if(con.isClosed())
			{
				system.out.println("Connection is Closed");
			}else
			{
				system.out.println("Connected Successfully");
			}
			
		}catch(Exception e)
		{
			system.out.println(e);
		}
		
	}
}