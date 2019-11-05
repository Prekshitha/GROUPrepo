package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Users;

public class UsersDao {
	public boolean checkLogin(Users users){
		boolean result=false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection  con= DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"hr",
					"hr");
			PreparedStatement smt =  con.prepareStatement("select * from empusers where empid=? and password=?");
			smt.setString(1, users.getUserid());
			smt.setString(2, users.getPassword());
			ResultSet rs=smt.executeQuery();
			if(rs.next()){
				result=true;
				con.close();
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	
	
	public boolean registerUser(Users users){
		boolean result=false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection  con= DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"hr",
					"hr");
			PreparedStatement smt =  con.prepareStatement("insert into empusers values(?,?,?,?,?,?)");
			smt.setString(1, users.getUserid());
			smt.setString(2, users.getName());
			smt.setString(3, users.getPassword());
			smt.setString(4, users.getContactno());
			smt.setString(5, users.getEmailid());
			smt.setString(6, users.getGender());
			int rs=smt.executeUpdate();
			con.close();
			if(rs>0)
				result=true;
		
			
		}
		catch(Exception e){
			System.out.println(e);
		}
				
		return result ;
	}
	
	
	public Users getAllInfo(String userid){
	
		Users users=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection  con= DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"hr",
					"hr");
			PreparedStatement smt =  con.prepareStatement("select * from empusers where empid=?");
			smt.setString(1, userid);
			ResultSet rs=smt.executeQuery();
			
			if(rs.next()){
			 users=new Users(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			  
			}
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return users ;
		
	}

}
