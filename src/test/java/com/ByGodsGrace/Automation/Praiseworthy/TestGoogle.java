package com.ByGodsGrace.Automation.Praiseworthy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class TestGoogle {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./Drivers/windows-64/chrome v2.33/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		Thread.sleep(3000);
		driver.close();
	}
}
