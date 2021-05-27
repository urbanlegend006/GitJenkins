package DriverInit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class properties {
	
	private static Properties prop;
	private static InputStream fis;
	
	public static synchronized Properties getPropInstnace() {
		prop = new Properties();
		try {
			fis = new FileInputStream("src/main/resources/config.properties");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
	
	
	
}
