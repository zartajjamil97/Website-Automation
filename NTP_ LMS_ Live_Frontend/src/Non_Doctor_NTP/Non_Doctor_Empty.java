/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Non_Doctor_NTP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author zartaj.jamil
 */
public class Non_Doctor_Empty {
    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://training.ntp.gov.pk/");
        driver.manage().window().maximize();
        //Registration Form Button
        driver.findElement(By.xpath("//a[@class='btn-primary bgclr-wit textclr-green border2']")).click();
//Registration Form 
//NO Checkbox
        driver.findElement(By.xpath("//div[@class='radio-wrp full-width flex ']//div[2]//input[@id='are_you_doctor_no']")).click();
Thread.sleep(2000);
//First Name
        driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[contains(@placeholder,'Enter Your First Name')]")).sendKeys("");
//LastName
        driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[contains(@placeholder,'Enter Your Last Name')]")).sendKeys("");
//Email
        driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[contains(@placeholder,'abc@yourmail.com')]")).sendKeys("");
//Phone Number
        driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[contains(@placeholder,'3433068720')]")).sendKeys("");
        driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[contains(@name,'alternate_contact_no')]")).sendKeys("");
//CNIC
        driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[contains(@name,'cnic')]")).sendKeys("");
         Thread.sleep(3000);
//Province
        driver.findElement(By.xpath("//form[@id='non_doctor_form']//label[@class='flex'][contains(text(),'Province')]")).click();
        Select a = new Select(driver.findElement(By.xpath("//form[@id='non_doctor_form']//select[@name='province']")));
        Thread.sleep(3000);
        a.selectByIndex(1);
//District
        driver.findElement(By.xpath("//form[@id='non_doctor_form']//label[@class='flex'][contains(text(),'District')]")).click();
        Select b = new Select(driver.findElement(By.xpath("//form[@id='non_doctor_form']//select[@name='district']")));
        Thread.sleep(2000);
        b.selectByIndex(3);
        Thread.sleep(2000);
//Basic Qualificaion
        driver.findElement(By.xpath("//div[@class='none-doctor']//form[1]//div[5]//div[1]//a[1]//span[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@class='none-doctor']//form[1]//div[5]//div[1]//div[1]//ul//li[@data-value='graduation']")).click();
        driver.findElement(By.xpath("//div[@class='none-doctor']//form[1]//div[5]//div[1]//div[1]//ul//li[@data-value='phdaster_degree']")).click();
        //driver.findElement(By.xpath("//div[@class='none-doctor']//form[1]//div[5]//div[1]//div[1]//ul//li[@data-value='other']")).click();
//Other
        //driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[@placeholder='Other']")).sendKeys("ABc Education");
//Password
         driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[contains(@placeholder,'Must be at least 8 characters')]")).sendKeys("");
         Thread.sleep(2000);
//Confirmation Password         
         driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[@name='password_confirmation']")).sendKeys("");    
    
//Submit
        driver.findElement(By.xpath("//form[@id='non_doctor_form']//input[@name='submit']")).click();
}
    
}

    
