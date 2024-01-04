package Assingnment_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_4 {
	WebDriver driver;
	String url="https://practice.automationtesting.in/my-account/";

@BeforeTest()
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
}
@Test
public void test3() {
	WebDriverWait w=new WebDriverWait(driver, 10);
	driver.findElement(By.id("username")).sendKeys("srsrinath85@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Practice!.@123");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement er=driver.findElement(By.name("rememberme"));
	boolean se=er.isSelected();
	if(!se) {
		er.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}else {
		System.out.println("the checkbox is selected");
	}

	driver.findElement(By.name("login")).click();
	
	

	
}

@AfterTest()
public void at() throws InterruptedException {
	Thread.sleep(7000);
	driver.close();
}

}
