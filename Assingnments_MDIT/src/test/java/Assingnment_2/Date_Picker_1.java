package Assingnment_2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker_1 {
	WebDriver driver;
	String url="https://jqueryui.com/datepicker/#buttonbar";
	
@BeforeTest()
	public void bt() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

@Test
public void test1() {
    driver.switchTo().frame(0);
	driver.findElement(By.id("datepicker")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
    // this will find all matching nodes in calendar		
	List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	int re=allDates.size();
	System.out.println(re);
    // now we will iterate all values and will capture the text. We will select when date is 28
	for(WebElement ele:allDates)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String date=ele.getText();
		System.out.println(date);
            // once date is 10 then click and break
			if(date.equalsIgnoreCase("14"))
			{
				ele.click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				break;
			}

	}

}
@AfterTest()
public void at() throws InterruptedException {
	Thread.sleep(7000);
	driver.close();
}
}



	


