package com.psl.pip.FileUtility;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CreateProperties {

	public static void create(String[] args) throws IOException {

      Properties properties = new Properties();
      properties.setProperty("url", "jdbc:oracle:thin:@10.51.227.104:1521:orcl");
      properties.setProperty("username", "DV_WARE_STUDY_56");
      properties.setProperty("password", "DV_WARE_STUDY_56");
      FileWriter writer = new FileWriter("db.properties");
      System.out.println("properties file created");
      properties.store(writer,"DB Propeties");
      writer.close();
	}
}
