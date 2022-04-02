package readPropertiesfiled;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * String propertyFilePath = System.getProperty("user.dir") +
		 * "\\src\\test\\resources\\configuration.properties";
		 * 
		 * System.out.println("file path is:" + propertyFilePath);
		 * 
		 * FileInputStream file = new FileInputStream(propertyFilePath);
		 * 
		 * Properties prop = new Properties();
		 * 
		 * prop.load(file);
		 * 
		 * String appurl = prop.getProperty("AppURL").toString();
		 * 
		 * System.out.println("App URL is :" + appurl);
		 * 
		 * System.out.println("Browser is: " + prop.getProperty("browser"));
		 */

	}

	public String getConfigProperty(String key) throws IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\configuration.properties";

		System.out.println("file path is:" + propertyFilePath);

		FileInputStream file = new FileInputStream(propertyFilePath);

		Properties prop = new Properties();

		prop.load(file);

		String KeyValue = prop.getProperty(key).toString();
		
		return KeyValue;		

	}

}
