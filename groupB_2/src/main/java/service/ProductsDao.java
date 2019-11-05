package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductsDao {
	public boolean registerProduct(Product product){
		boolean result=false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection  con= DriverManager.getConnection(                                     
					"jdbc:oracle:thin:@localhost:1521:xe",
					"hr",
					"hr");
			PreparedStatement smt =  con.prepareStatement("insert into product values(?,?,?,?,?)");
			smt.setString(1, product.getPid());
			smt.setString(2, product.getPname());
			smt.setString(3, product.getUnitprice());
			smt.setString(4, product.getStock());
			smt.setString(5, product.getCategory());
			
			int rs=smt.executeUpdate();
			con.close();
			if(rs>0)
				result=true;
		
			
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
		return result;
		
	}
	
	
	public List<Product> getAllProduct(){
		List<Product> productlist=new ArrayList();
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection  con= DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"hr",
					"hr");
			PreparedStatement smt =  con.prepareStatement("select * from product");
			ResultSet rs=smt.executeQuery();
			while(rs.next()){
				Product p=new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			   productlist.add(p);
			}
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return productlist ;
		
	}

}
