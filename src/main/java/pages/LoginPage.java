package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.id("email1");
	By password = By.id("password1");
	//By loginBtn = By.xpath("//button[@type='submit']");
	By loginBtn = By.xpath("//button[@type='submit']");

	public void loginToApp(String userName1, String password1) {
		driver.findElement(userName).sendKeys(userName1);
		driver.findElement(password).sendKeys(password1);
		driver.findElement(loginBtn).click();
	}

}
