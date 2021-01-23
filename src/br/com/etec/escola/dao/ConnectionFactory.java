package br.com.etec.escola.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		try{
			return DriverManager.getConnection
					("jdbc:mysql://localhost/jdbc", "root", "123456");
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
