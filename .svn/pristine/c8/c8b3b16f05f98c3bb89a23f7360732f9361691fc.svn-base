package com.find.conn;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	public class jdbc{
	public boolean main(String user,String pwd){
		try {
			//1.                     jar   
			//2.                  
			Class.forName("com.mysql.jdbc.Driver");
			
			//3.               
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/find?characterEncoding=UTF-8","root","root");
			
			//4.      SQL                  
			Statement stat=conn.createStatement();
			
			//5.      SQL      
			ResultSet rs=stat.executeQuery("select * from usertable where username='"+user+"' and password='"+pwd+"'");
			
			//6.               
			while(rs.next()){
			return true;
			
			}

			//7.            
			conn.close();
		
		
		} catch (Exception e) {
			// TODO uto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	}

