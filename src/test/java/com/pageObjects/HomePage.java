package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public WebDriver wd;
	
	//Constructor
	public HomePage(WebDriver wd) {
		this.wd=wd;	
	}
	
	//Locators
	By close_btn = By.xpath("//span[@class='commonModal__close']");
	By roundTrip_btn = By.xpath("//li[@data-cy='roundTrip']");
	By from = By.xpath("//input[@id='fromCity']");
	By enterSCity = By.xpath("//input[@aria-autocomplete='list']");
	By to = By.xpath("//input[@id='toCity']");
	By enterDCity = By.xpath("//input[@aria-autocomplete='list']");
	By search_btn = By.xpath("//a[normalize-space()='Search']");
	
	//Action Methods
	public void Close() throws InterruptedException {
		wd.findElement(close_btn).click();
	}
	public void RoundTrip() throws InterruptedException {
		wd.findElement(roundTrip_btn).click();
	}
	public void SCity(String fcity) throws Exception {
		wd.findElement(from).click();
		wd.findElement(enterSCity).sendKeys(fcity);
		wd.findElement(By.xpath("//p[text()='"+fcity+"']")).click();
	}
	public void DCity(String tcity) {
		wd.findElement(to).click();
		wd.findElement(enterDCity).sendKeys(tcity);
		wd.findElement(By.xpath("//p[text()='"+tcity+"']")).click();
	}
	public void DDate() {
		wd.findElement(By.xpath("//div[@aria-label='Tue Jun 24 2025']")).click();
		wd.findElement(By.xpath("//div[@aria-label='Sat Jun 28 2025']")).click();
	}
	
	public void Search() {
		wd.findElement(search_btn).click();
	}

}
