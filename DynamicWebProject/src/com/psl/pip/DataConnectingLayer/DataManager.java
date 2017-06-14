package com.psl.pip.DataConnectingLayer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.psl.pip.FileUtility.CreateProperties;

public class DataManager {

	private static Connection conn;

	public Connection getConnection() throws IOException
	{
		
		
		String url, username , password;
		
		
//		try(FileReader reader = new FileReader("db.properties")) {
//			Properties credentials = new Properties();
//			credentials.load(reader);
//			 url = credentials.getProperty("url");
//			 username = credentials.getProperty("username");
//			 password = credentials.getProperty("password");
//			 
//		}

	url = "jdbc:oracle:thin:@10.51.227.104:1521:orcl";
	username = "DV_WARE_STUDY_56";
		password = "DV_WARE_STUDY_56";

	if (conn != null)
		return conn;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println(" Driver Successfully Loadedhh");

			conn = DriverManager.getConnection(url, username, password);

			System.out.println("Connection Estabilished" + conn);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

//	public void Close(Connection toBeClosed) {
//		if (toBeClosed == null)
//			return;
//		try {
//			toBeClosed.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
