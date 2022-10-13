package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader implements FrameWorkConstants {
    
	public static String readDataFromProperty(String Key) throws IOException {
		
		FileInputStream fis=new FileInputStream(PropertyPath);
		
		Properties properties=new Properties();
		properties.load(fis);
		
	    String value=properties.getProperty(Key); 
		return value;
		
		
	}
	
}
