package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class jrl_login {

	public static void main(String[] args) {
   
	WebDriver Driver;
	
	//open edge browser
	Driver= new EdgeDriver();
	
	//Type the url
	Driver.get("https://www.justrechargeit.com/SignIn.aspx");
		
	//type invalid data intoall fields (email,password,captcha..)
	Driver.findElement(By.id("txtUserName")).sendKeys("dinesh@gmail.com");
	Driver.findElement(By.id("txtPasswd")).sendKeys("qwert");
	Driver.findElement(By.id("txtCaptcha")).sendKeys("qwefrgt");
	
	//click on the login button 
		Driver.findElement(By.name("imgbtnSignin")).click();
     	
    
	
	}
	
}
