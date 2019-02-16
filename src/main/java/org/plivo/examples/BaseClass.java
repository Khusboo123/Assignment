package org.plivo.examples;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    WebDriver driver ;
	
	public void setDriver() throws InterruptedException {
		
		//System.getProperty("webdriver.chrome.driver","C://Users//Plivo//Desktop//chromedriver.exe");
		//System.getProperty("user.dir");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("http://quickfuseapps.com/");
		String title=driver.getTitle();
		String expectedTitle="Login :: Plum Fuse";
		assertEquals(title,expectedTitle);
		WebElement element=driver.findElement(By.xpath("//a[text()='Create an App']"));
		element.click();
		String title1=driver.getTitle();
		String expectedTitle1="Untitled App :: Plum Fuse";
		assertEquals(title1,expectedTitle1);
		element=driver.findElement(By.xpath("//button[@type='button']"));
		element.click();
		
		element=driver.findElement(By.xpath("//a[@id='add-page']/span"));
		element.click();
		
		element=driver.findElement(By.xpath("//form[@class='unsubmittable']/p/input"));
		element.sendKeys("Khusboo");
		
		/*element=driver.findElement(
				By.xpath("//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/button[text()='Create'][@class='ui-corner-all ui-button ui-state-default']"));*/
		//button[@class='ui-corner-all ui-button ui-state-default'][text()='Create']
		
		//element=driver.findElement(By.xpath("//button[@class='ui-corner-all ui-button ui-state-default'][text()='Create']"));
		//element.click();
		
		List<WebElement> lt=driver.findElements(By.xpath("//button[text()='Create']"));
		
			lt.get(1).click();
		
			
			
	    lt=driver.findElements(By.xpath("//div[@id='accordion']/h3/a"));
	    lt.get(3).click();
	    Actions act=new Actions(driver);
		WebElement elementSMS=driver.findElement(
				By.xpath("//li[text()='Send an SMS']")
				);
		WebElement elementSMStab=driver.findElement(
				By.xpath("//div[@id='tabs-2']")
				);		
		Thread.sleep(3000L);
		act.dragAndDrop(elementSMS,elementSMStab).build().perform();
		Thread.sleep(3000L);
		
		List<WebElement> element3=driver.findElements(
				By.xpath("//div[@class='mod-rail mod-south']/div")
				);
		
		List<WebElement> element4=driver.findElements(
				By.xpath("//div[@class='mod-rail mod-north']/div")
				);	
		
		act.dragAndDrop(element3.get(0),element4.get(0)).build().perform();
		Thread.sleep(3000L);
		
		
		
		WebElement elementEmail=driver.findElement(
				By.xpath("//li[text()='Send an Email']")
				);
		WebElement elementtab=driver.findElement(
				By.xpath("//div[@id='tabs-2']")
				);		
		Thread.sleep(3000L);
		act.dragAndDrop(elementEmail,elementtab).build().perform();
		element=driver.findElement(By.xpath("//div[text()='Send an Email']"));
		act.moveToElement(element,100,20).build().perform();
		Thread.sleep(3000L);
		
		
		WebElement elementfeed=driver.findElement(
				By.xpath("//li[text()='Fetch Twitter Feed']")
				);
		WebElement elementfeedtab=driver.findElement(
				By.xpath("//div[@id='tabs-2']")
				);		
		Thread.sleep(3000L);
		act.dragAndDrop(elementfeed,elementfeedtab).build().perform();
		Thread.sleep(3000L);
		driver.close();
	}
	
	

}
