package runnerclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
Properties p;
	
	
	public ConfigurationReader() throws Throwable{
		
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\DineshAdactin\\src\\main\\java\\com\\prop\\adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		p.load(fis);
		
	}
	
	public  String getBrowser(){
		
	String browser= 	p.getProperty("browser");
	return browser;
		
	}
	
public 	String getUrl(){
	
String Url = 	p.getProperty("Url");
return Url;
		
	}
	
}
