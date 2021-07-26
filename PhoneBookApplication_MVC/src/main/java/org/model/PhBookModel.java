package org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.bean.ContactDetails;
import org.util.DbConnectionUtil;

public class PhBookModel {

	
	public int saveContact(ContactDetails details) {
		int count = 0;
		String query = "insert into phbook values(0,?,?,?,?)";
		
		try {
			Connection con = DbConnectionUtil.openConnection();
			
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, details.getFname());
			stmt.setString(2, details.getLname());
			stmt.setString(3, details.getEmail());
			stmt.setString(4, details.getContact());
			
			count = stmt.executeUpdate();
			
			DbConnectionUtil.closeConnection(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public List<ContactDetails> getAll(){
		
		List<ContactDetails> contactList = new ArrayList<ContactDetails>();
		
		try {
			Connection con = DbConnectionUtil.openConnection();
			
			PreparedStatement stmt = con.prepareStatement("select * from phbook");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				ContactDetails contact = new ContactDetails();
				
				contact.setId(rs.getInt("id"));
				contact.setFname(rs.getString("fname"));
				contact.setLname(rs.getString("lname"));
				contact.setEmail(rs.getString("email"));
				contact.setContact(rs.getString("contact"));
				
				contactList.add(contact);
			}
			
			
			DbConnectionUtil.closeConnection(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return contactList;
	}
	
	
	
	public ContactDetails getById(int id){
		ContactDetails contact = new ContactDetails();
		try {
			Connection con = DbConnectionUtil.openConnection();
			PreparedStatement stmt = con.prepareStatement("select * from phbook where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				contact.setId(rs.getInt("id"));
				contact.setFname(rs.getString("fname"));
				contact.setLname(rs.getString("lname"));
				contact.setEmail(rs.getString("email"));
				contact.setContact(rs.getString("contact"));
			}
			DbConnectionUtil.closeConnection(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return contact;
	}
	
	
	public int update(ContactDetails details) {
		int result = 0;
		String query ="update phbook set fname=?,lname=?,contact=?,email=? where id=?";
		try {
			Connection con = DbConnectionUtil.openConnection();
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, details.getFname());
			stmt.setString(2, details.getLname());
			stmt.setString(3, details.getContact());
			stmt.setString(4, details.getEmail());
			stmt.setInt(5, details.getId());
			result = stmt.executeUpdate();
			DbConnectionUtil.closeConnection(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}










