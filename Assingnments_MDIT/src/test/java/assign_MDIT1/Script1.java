package assign_MDIT1;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {
WebDriver driver;
String url="https://jqueryui.com/selectmenu/";

@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
}
@Test
public void test() throws InterruptedException {

	    driver.switchTo().frame(0);
	    driver.findElement(By.id("speed-button")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.id("ui-id-4")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.cssSelector("#salutation-button > .ui-selectmenu-text")).click();
	    driver.findElement(By.id("ui-id-7")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.cssSelector("#number-button > .ui-selectmenu-text")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.id("ui-id-16")).click();
	
		
}
@AfterTest()
public void at() throws InterruptedException {
	Thread.sleep(7000);
	driver.close();
}
}
