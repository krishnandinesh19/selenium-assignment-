package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Justrecharge {

	public static void main(String[] args) throws Exception {

    WebDriver Driver;
    
    //open edge browser
    Driver= new EdgeDriver();
    
     //Type the url
     Driver.get("https://www.justrechargeit.com/SignUp.aspx");
     
   //wait statement
   		Thread.sleep(3000);
      
   //type invalid data intoall fields
    Driver.findElement(By.id("signup_name")).sendKeys("dinesh");
    Driver.findElement(By.id("signup_mobileno")).sendKeys("123456774");
    Driver.findElement(By.id("signup_email")).sendKeys("dinesh@mail.com");
    Driver.findElement(By.id("signup_password")).sendKeys("qwerhfk");
    
  //check boxes
    Driver.findElement(By.id("checkbox1")).click();
    Driver.findElement(By.id("checkbox")).click();
    
  //wait statement
  		Thread.sleep(3000); 
  		
    //use hyperlink
    Driver.findElement(By.linkText("terms & conditions")).click();
    
    //submit button
    Driver.findElement(By.id("imgbtnSubmit")).click();
    
      

	}

}
