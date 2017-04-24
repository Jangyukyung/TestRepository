package ch15.exam05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop=new Properties();
		String path=PropertiesExample.class.getResource("database.properties").getPath();
				//현재 이 클래스가 위치한 곳에서 , 이름이database인 파일의 위치를 찾는다
		prop.load(new FileReader(path));
	
		String driver=prop.getProperty("driver");
		System.out.println(driver);
		
		String manager=prop.getProperty("manager");
		System.out.println(manager);
	}

}
