package launchBrowser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		
		
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\panka\\Selenium_dec\\1st_Selenium\\drivers\\chromedriver.exe");	
		// object creation of WebDriver. what kind of browser you use?
		WebDriver driver = new ChromeDriver();// object variable
		// go to web site
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();// to maximize the window
		//Stop execution, use thread for milliseconds
		Thread.sleep(3000);
		// close the browser
		driver.close();
	
	
	}
	

}
