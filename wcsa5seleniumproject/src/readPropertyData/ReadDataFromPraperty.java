package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPraperty {

	public static void main(String[] args) throws IOException {
	// Read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");

		// Create a object of properties class
		  Properties prop = new Properties();
		// Make a file ready for read
		  prop.load(fis);
		// Read the particular property from file
          String	data = prop.getProperty("Password");
          System.out.println(data);
		
		
		
	}

	
}
