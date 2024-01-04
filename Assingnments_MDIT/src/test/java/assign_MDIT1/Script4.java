package assign_MDIT1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script4 {
	WebDriver driver;
	String url="https://www.ironspider.ca/forms/checkradio.htm";
	
@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
}

@Test
public void test() throws InterruptedException {
	
	List<WebElement> lo=driver.findElements(By.name("browser"));
	int lp=lo.size();
	System.out.println(lp);
	System.out.println(lo.get(1));
	boolean sel=lo.get(0).isSelected();
	
	if(!sel) {
		lo.get(0).click();
		System.out.println("this one is selected");
	}else {
		lo.get(1).click();
	}
	
	

	Thread.sleep(5000);
 	
}
@AfterTest()
public void at() throws InterruptedException {
	Thread.sleep(7000);
	driver.close();
}
}
