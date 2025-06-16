package com.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pageObjects.HomePage;

public class TC_001 {
	
	public WebDriver wd;
	
	@BeforeClass
	public void setup() {
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.makemytrip.com/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	}
	
	@Test
	public void BookTicket() throws Exception {
		HomePage hp = new HomePage(wd);
		hp.Close();
		hp.RoundTrip();
		hp.SCity("Pune, India");
		hp.DCity("Hyderabad, India");
		hp.DDate();
		Thread.sleep(2000);
		hp.Search();
	}
	
	@AfterClass
	public void teardown() throws Exception {
		Thread.sleep(2000);
		wd.close();
	}

}
