package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	
	public ReadConfig(){
		
		 try {
				FileInputStream fis= new FileInputStream("src/test/java/config/config.properties");
				prop= new Properties();
				prop.load(fis);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception is: "+ e.getMessage());
			}
	}
	
	
	public String getUsername() {
		return prop.getProperty("username");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	public String getAppUrl() {
	return prop.getProperty("appUrl");
	}
	
	public String getBrowser() {
	return prop.getProperty("browser");
	}
	
}
