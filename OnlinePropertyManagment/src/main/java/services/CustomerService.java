package services;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Customer;
import utils.DBConnect;

public class CustomerService {
	
	public boolean regCustomer(Customer cus) {
		
		try {
			
           String query = "insert into customer values('"+cus.getEmail()+"','"+cus.getFirst_name()+"','"+cus.getLast_name()+"','"+cus.getUsername()+"','"+cus.getPassword()+"','"+cus.getRe_Enter_password()+"')";
					Statement statement = DBConnect.getConnection().createStatement();
			 		statement.executeUpdate(query);
			 		
					
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean validate(Customer cus) {
		String email= "";
		try {
			String query="select * from customer where Email = '"+ cus.getEmail()+"' and password = '"+cus.getPassword()+"'";
			Statement stat = DBConnect.getConnection().createStatement();
			ResultSet rs = stat.executeQuery(query);
			if(rs.next()) {
				email = rs.getString("email");
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
   public ArrayList<String> selectCustomer(Customer cus) {
	   ArrayList<String> values = new ArrayList<>();
	   String email = null;
	   String username = null;
	   String password = null;
	   String reenterpassword = null;
	   String firstname = null;
	   String lastname = null;
		try {
			
		String query="select * from customer where Email = '"+ cus.getEmail()+"' and password = '"+cus.getPassword()+"'";
           Statement stat = DBConnect.getConnection().createStatement();
           ResultSet rs = stat.executeQuery(query);
           if(rs.next()) {
				email = rs.getString("email");
				username = rs.getString("username");
				password = rs.getString("password");
				reenterpassword = rs.getString("reenterpassword");
				firstname = rs.getString("firstname");
				lastname = rs.getString("lastname");
				values.add(email);
				values.add(username);
				values.add(password);
				values.add(reenterpassword);
				values.add(firstname);
				values.add(lastname);
				System.out.println(values+"ArrayList");
				return values;
			}
					
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return values;
	}

   public void updateCustomer(Customer cus) {
		
		try {
			
          String query = "UPDATE customer SET firstname='"+cus.getFirst_name()+"',lastname='"+cus.getLast_name()+"',username='"+cus.getUsername()+"',password='"+cus.getPassword()+"',reenterpassword='"+cus.getRe_Enter_password()+"' WHERE email = '"+cus.getEmail()+"'";
        
          Statement statement = DBConnect.getConnection().createStatement();
			 		statement.executeUpdate(query);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   
   public boolean deleteCustomer(Customer cus) {
		
		try {
			
         String query = "DELETE FROM customer WHERE email = '"+cus.getEmail()+"'";
       
         Statement statement = DBConnect.getConnection().createStatement();
			 		statement.executeUpdate(query);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
   
   public ArrayList<Customer>getAllCustomer(){
	   try {
		   System.out.println("INSIDE getAllCustomer()");
		   ArrayList<Customer> listCus = new  ArrayList<Customer>();
		   
		   String query = "select * from customer";
		   
		   Statement statement = DBConnect.getConnection().createStatement();
		   ResultSet rs = statement.executeQuery(query);
		   
		   while(rs.next()) {
			   Customer cus = new Customer();
			   cus.setFirst_name(rs.getString("firstname"));
			   cus.setLast_name(rs.getString("lastname"));
			   cus.setUsername(rs.getString("username"));
			   cus.setEmail(rs.getString("email"));
			   cus.setPassword(rs.getString("password"));
			   cus.setRe_Enter_password(rs.getString("reenterpassword"));
			   System.out.println(cus);
			   listCus.add(cus);
		   }
		   return listCus;
	} catch (Exception e) {
		   e.printStackTrace();
		   return null;
	}
   }
}
