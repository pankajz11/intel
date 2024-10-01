package Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelExecution1
{
      @Parameters("browser")
      @Test
      public void test(String browser) throws InterruptedException
      {
    	  WebDriver driver;
    	  WebDriverManager.chromedriver().setup();
    	  WebDriverManager.firefoxdriver().setup();
    	  
    	  if (browser.equals("chrome"))
    	  {
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(3000);
    	  }
    	 if (browser.equals("firefox"))
    	  {
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
    	  }
   }
}