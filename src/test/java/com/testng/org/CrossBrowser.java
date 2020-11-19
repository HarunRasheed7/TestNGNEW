package com.testng.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	 WebDriver driver =null;
@Parameters({"browsername"})
@Test
public void login (String name) {
	if (name.equals("chrome")) {
	  WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("http://facebook.com");
	}else if (name.equals("ff")) {
		WebDriverManager.firefoxdriver().setup();
	    driver =new FirefoxDriver();
	    driver.get("http://flipkart.com");
}

		

}

}
