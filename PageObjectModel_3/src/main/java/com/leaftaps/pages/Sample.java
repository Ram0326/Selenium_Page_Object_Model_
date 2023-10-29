package com.leaftaps.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Sample {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties property = new Properties();
	property.load(new FileInputStream("./objectRepo/English.properties"));
	String value = property.getProperty("loginpage.username.id");
	System.out.println(value);
}
}
