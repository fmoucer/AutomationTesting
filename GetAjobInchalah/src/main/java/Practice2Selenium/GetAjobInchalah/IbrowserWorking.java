package Practice2Selenium.GetAjobInchalah;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IbrowserWorking {
	// steap 1 call webdriver interface
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//i) How to open the browser
// step 2 give path of webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ferha\\eclipse-workspace\\GetAjobInchalah\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");	
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
// each browser has a unique id in selenium called window handle . its changes every time we open the browser
		String t=driver.getWindowHandle();
		System.out.println(t);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
	Thread.sleep(3000);
	driver.close();
		
	}
	}
