package org.gmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.ConnectionFailedException;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath = System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://accounts.google.com/signin");
		// maximize the browser
		driver.manage().window().maximize();
		//enter mail id
		driver.findElement(By.name("identifier")).sendKeys("ammulatha94@gmail.com");
		//click on next button
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.name("password")).sendKeys("ammumani");
		driver.findElement(By.id("sign-in-form_submit-btn")).click();
		driver.findElement(By.name("homepage-basic_sign_in_submit-btn")).click();
	}}
