/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Form;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author zartaj.jamil
 */
public class Valid_Login {
     public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://training.ntp.gov.pk/");
        driver.manage().window().maximize();
        //Login Form
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        //Enter An Email
        driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Address']")).sendKeys("NTPLMS@yopmail.com");
        //Enter An Password
        driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")).sendKeys("PurplE 97");
        //Login Button
        driver.findElement(By.name("submit")).click();  
         
    
    
}
    
}
