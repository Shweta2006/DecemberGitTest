package browserTechfios;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTechfios {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\panka\\Selenium_dec\\1st_Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//go to the website
				driver.get("https://techfios.com/billing/?ng=admin/");
				// maximize window
				driver.manage().window().maximize();
				//identify user name element & data insertion
				driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
				// identify password element and data insertion
				driver.findElement(By.id("password")).sendKeys("abc123");
				//identify signin element & click
				driver.findElement(By.name("login")).click();
				
				
				driver.findElement(By.partialLinkText("Bank & Cash")).click();
				driver.findElement(By.partialLinkText("New Account")).click();
				
				driver.findElement(By.id("account")).sendKeys("Checking2");
				driver.findElement(By.id("description")).sendKeys("Personal");
				driver.findElement(By.id("balance")).sendKeys("$100,000.00");
				driver.findElement(By.id("account_number")).sendKeys("0009244");
				driver.findElement(By.id("contact_person")).sendKeys("Billy Simon");
				driver.findElement(By.id("contact_phone")).sendKeys("7765653301");
				driver.findElement(By.id("contact_person")).submit();
				driver.close();				
	}
		
	
	}

