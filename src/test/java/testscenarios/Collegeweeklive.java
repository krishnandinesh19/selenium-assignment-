package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Collegeweeklive {

	public static void main(String[] args) throws Exception {
		WebDriver Driver;
		
		//open Firefox browser
		//Driver = new FirefoxDriver();
		
		//open edge browser
		Driver =new EdgeDriver();
		
		//open url
		Driver.get("https://collegeweeklive.com/go/homelive");
		
		//wait statement
		Thread.sleep(3000);
		
		//type invaid data 
		Driver.findElement(By.id("firstName")).sendKeys("dinesh");
		Driver.findElement(By.id("lastName")).sendKeys("krishnan");
		Driver.findElement(By.id("emailAddress")).sendKeys("dinesh@gmail.com");
		Driver.findElement(By.id("phoneNumber")).sendKeys("1234556665");
		Driver.findElement(By.id("password")).sendKeys("agdfsgsg");
		Driver.findElement(By.id("ConfirmPassword")).sendKeys("agdfsgds");
		
		//checkboxes
		Driver.findElement(By.id("questions[q_135]")).click();
		Driver.findElement(By.id("questions[q_136]")).click();
		Driver.findElement(By.id("questions[q_137]")).click();
		
		//click on the submit button 
		Driver.findElement(By.id("submit")).click();
		
		
		

	}

}
