package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Dataprovider {
	Properties p;
    public Dataprovider() throws IOException {
		File f=new File("C:\\Users\\USER\\eclipse-workspace\\TectngP"
				+ "\\src\\main\\java\\com\\propertyfile\\Magneto.properties");
		FileInputStream fis =new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getPropertyUrl() {
		String url = p.getProperty("url");
		return url;

	}
	public String gerPropertyUsername() {
		String username = p.getProperty("username");
		return username;

	}
	public String getPropertyPassword() {
		String password = p.getProperty("password");
		return password;

	}
}
