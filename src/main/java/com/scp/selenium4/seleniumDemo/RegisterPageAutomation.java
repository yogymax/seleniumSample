package com.scp.selenium4.seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterPageAutomation {
	
	@Test
	public void method2() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryreservation.php");
		driver.manage().window().maximize();
		WebElement registerMenu =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		registerMenu.click();
		
		WebElement paragraph= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font"));
		System.out.println(paragraph.getText());
		
		//Assert.assertEquals(paragraph.getText(), "To create your account, we'll need some basic information about you. This information will be used to send reservation confirmation emails, mail tickets when needed and contact you if your travel arrangements change. Please fill in the form completely.");
		
		System.out.println("####################");
		
		WebElement firstNameInput =driver.findElement(By.name("firstName"));
		firstNameInput.sendKeys("Abcdas");
		
		WebElement lastNameInput= driver.findElement(By.name("lastName"));
		lastNameInput.sendKeys("qweuiadak");
		
		WebElement phoneNo =driver.findElement(By.name("phone"));
		phoneNo.sendKeys("1231231231");
		
		WebElement email= driver.findElement(By.id("userName"));
		email.sendKeys("adaksqpfhiw");
		
		
		
		
		
	}

	@Test
	public void method1(){
		 WebDriver driver = new FirefoxDriver();
		  driver.get("http://toolsqa.com/automation-practice-form/");
		  driver.manage().window().maximize();
		  
		 PracticeForm practiceForm = PageFactory.initElements(driver,PracticeForm.class);
		 practiceForm.fillPracticeForm("Abcd", "Pqrs","Male");
		 practiceForm.FillDetails("5","12/03/2017","Auto","QTP","Africa","Wait Commands","Browser Commands");
	}
	
	
}
