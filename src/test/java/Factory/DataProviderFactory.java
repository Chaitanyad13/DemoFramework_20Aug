package Factory;

import java.io.IOException;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;

public class DataProviderFactory {

	public static ConfigDataProvider getConfig(){
		
		ConfigDataProvider config = new ConfigDataProvider();
		
		return config;
		
	}
	
	public static ExcelDataProvider getExcel() throws IOException{
		
		ExcelDataProvider Excel = new ExcelDataProvider();
		
		return Excel;
	}
	
}
