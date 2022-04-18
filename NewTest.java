package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAIBABA\\OneDrive\\Desktop\\selenium\\chromedriver(1).exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://aspireapp.odoo.com/");
	  
	  driver.findElement(By.id("login")).sendKeys("user@aspireapp.com");
	  driver.findElement(By.id("password")).sendKeys("@sp1r3app");
	  driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div/div/form/div[3]/button")).click();
	  
	  //driver.findElement(By.xpath("//a[@href ='#menu_id=79&action_id=115']")).click();	
	  driver.findElement(By.xpath("//*[@id=\"result_app_1\"]/div[1]")).click();
	  driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/button/span")).click();
	  driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/div/a[1]")).click();
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/button[2]")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[4]")).click();
	  driver.findElement(By.name("inventory_quantity")).sendKeys("10");
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/button[1]")).click();
	  
	  driver.findElement(By.xpath("/html/body/header/nav/a[1]")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"result_app_2\"]")).click();
	  	  
	  
  }
}
