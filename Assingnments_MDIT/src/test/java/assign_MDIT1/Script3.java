package assign_MDIT1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script3 {

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
public void test() throws InterruptedException, IOException {
	
	driver.findElement(By.xpath("//*[@type='checkbox']")).click();
	driver.findElement(By.xpath("//*[@value='green']")).click();
	driver.findElement(By.xpath("//*[@value='orange']")).click();
	Thread.sleep(6000);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
    File SourceFile=scrShot.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(SourceFile, new File("C:\\Users\\Admin\\Desktop\\screen.png"));
    System.out.println("Screenshot is captured");
	
}
	
@AfterTest()
public void at() throws InterruptedException {
	Thread.sleep(7000);
	driver.close();
}	
	
}
