/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor_NTP.lms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author zartaj.jamil
 */
public class Doctor_Invalide {
    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("http://training.ntp.gov.pk/");
        driver.manage().window().maximize();
        //Registration Form Button
        driver.findElement(By.xpath("//a[@class='btn-primary bgclr-wit textclr-green border2']")).click();
//Registration Form        
//First Name
        driver.findElement(By.name("firstname")).sendKeys("firstname");
//LastName
        driver.findElement(By.name("lastname")).sendKeys("lastname");
//Email
        driver.findElement(By.name("email")).sendKeys("test5@yopmail.com");
//Phone Number
        driver.findElement(By.name("mobile_no")).sendKeys("72352365887878787123561");
                driver.findElement(By.name("alternate_contact_no")).sendKeys("766565676776786876767");
//CNIC
        driver.findElement(By.name("cnic")).sendKeys("42424-24242787842-4");
//Province
        driver.findElement(By.name("province")).click();
        Select a;
        a = new Select(driver.findElement(By.name("province")));
        Thread.sleep(2000);
        a.selectByIndex(1);
//District
        driver.findElement(By.name("district")).click();
        a = new Select(driver.findElement(By.name("district")));
        Thread.sleep(2000);
        a.selectByIndex(3);
        Thread.sleep(2000);
//Basic Qualificaion
         driver.findElement(By.xpath("//div[@class='doctor']//div[1]//a[1]//span[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-main']//ul//li[@data-value='post_graduation']")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-main']//ul//li[@data-value='phd']")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-main']//ul//li[@data-value='other']")).click();
//Other
        driver.findElement(By.xpath("//form[@id='doctor_form']//input[@placeholder='Other']")).sendKeys("Abc Education");
        Thread.sleep(2000);
//WorkPlace Type
        driver.findElement(By.xpath("//div[@class='doctor']//form[1]//div[7]//div[1]//a[1]//span[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-main']//ul//li[@data-value='government']")).click();
//Address Of Government Hospital
        driver.findElement(By.name("address_government_hospital")).sendKeys("lastname");
//Work Experience
        driver.findElement(By.name("work_experience")).click();
       Select c = new Select(driver.findElement(By.name("work_experience")));
        Thread.sleep(2000);
        c.selectByIndex(3);
        Thread.sleep(2000);
//PMDC Card Number
        driver.findElement(By.name("pmdc_registration_number")).sendKeys("668767887877803-J");
        Thread.sleep(2000);
//Password
         driver.findElement(By.name("password")).sendKeys("P88788urplE 97");
         Thread.sleep(2000);
//Confirmation Password         
         driver.findElement(By.name("password_confirmation")).sendKeys("Purp878787lE 97");
//Submit Button
         driver.findElement(By.name("submit")).click();   
    }
    
}

    

