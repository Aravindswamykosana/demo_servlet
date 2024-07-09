package demo_servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import demo_servlet.dto.User;

public class UserCrud {
	public Connection table() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_servlet?createDatabaseIfNotExist=true", "root", "root");
		Statement s = con.createStatement();
		s.execute("create table If Not Exists emp(id int primary key,name varchar(45),email varchar(45),pwd varchar(45),sal double)");	
		return con;	
	}
	public User save(User emp1) throws ClassNotFoundException, SQLException {
		Connection con=table();
		PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?,?)");
		ps.setInt(1,emp1.getId());
		ps.setString(2,emp1.getName());
		ps.setString(3,emp1.getEmail());
		ps.setString(4,emp1.getPwd());
		ps.setDouble(5, emp1.getSal());
		ps.execute();
		return emp1;		
	}
}
