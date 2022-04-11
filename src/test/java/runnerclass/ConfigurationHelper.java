package runnerclass;

public class ConfigurationHelper {

	
public static 	ConfigurationReader getInstanceCr() throws Throwable{
	
	ConfigurationReader r = new ConfigurationReader();
	return r;
	
		
		
		
	}

public static ConfigurationHelper getInstance(){
	
	ConfigurationHelper h = new ConfigurationHelper();
	return h;
	
}
}
