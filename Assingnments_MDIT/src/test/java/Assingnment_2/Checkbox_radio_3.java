package Assingnment_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_radio_3 {

	WebDriver driver;
	String url="https://jqueryui.com/checkboxradio/";

@BeforeTest()
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
}

@Test
public void test1() {
	
	WebDriverWait wa=new WebDriverWait(driver, 20);
	driver.switchTo().frame(0);
	List<WebElement> lo=driver.findElements(By.xpath("//*[@class='ui-checkboxradio-label ui-corner-all ui-button ui-widget ui-checkboxradio-radio-label']"));
	int g=lo.size();
	System.out.println(g);
	System.out.println("the radio buttons are:");
	for (WebElement browser : lo) {
		String labelText = browser.getText().trim();
        System.out.println(labelText);
	   
	}
	
	 
	
	
	
	
	
	
}
@Test
public void test2() {
	
	WebDriverWait wa=new WebDriverWait(driver, 20);
	//driver.switchTo().frame(1);
	List<WebElement> log=driver.findElements(By.xpath("//*[@class='ui-checkboxradio-label ui-corner-all ui-button ui-widget']"));
	int gr=log.size();
	System.out.println(gr);
	System.out.println("the checkboxes are:");
	for (WebElement browser : log) {
		String labelText = browser.getText().trim();
        System.out.println(labelText);
	   
	}
		
	
	
}
@AfterTest()
public void at() throws InterruptedException {
	Thread.sleep(7000);
	driver.close();
}

}
