package Logintestsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class logintestusingparam {
  

	WebDriver driver;
    
    @DataProvider(name = "data-set")
    public static Object[][] DataSet(){
        
    	//read data
        Object[][] obj = {
                {"valid", "standard_user", "secret_sauce"},              
                {"invalid", "locked_out_user", "secret_sauce"},
                {"valid", "problem_user", "secret_sauce"},
                {"valid", "performance_glitch_user", "secret_sauce"},
                {"invalid", " "," "},
                {"invalid", "!@#$%^&*()", "secret_sauce"},
                {"invalid", "standard_user", " "},
                {"invalid", "Standard_use", "secret_sauce"},
                {"invalid", " ", "secret_sauc"},
                {"invalid", "1234567890", "1234567890"},
                
                };
           return obj;
               }
     
    @Test(dataProvider = "data-set")
    public void Logintosaucedemowebsite(String type, String username, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Webdriver\\\\Chromedriver_win32\\\\chromedriver.exe");
        System.out.println(type + " " + username + " " + password);
        driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/");
          
       driver.findElement(By.id("user-name")).sendKeys(username);
       driver.findElement(By.id("password")).sendKeys(password);
       Thread.sleep(3000);
       driver.findElement(By.id("login-button")).click();
        

        if(type.equals("valid")){
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("[class='title']")));
            Thread.sleep(5000);
            List <WebElement> listings = driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div//img"));
            Random r = new Random();
            int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
            listings.get(randomValue).click(); //Clicking on the random item in the list.
            Thread.sleep(3000);
            driver.findElement(By.id("back-to-products")).click();
           
        
        {
            Thread.sleep(5000);
            List <WebElement> listings1 = driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div//img"));
            Random r1 = new Random();
            int randomValue1 = r.nextInt(listings1.size()); //Getting a random value that is between 0 and (list's size)-1
            listings1.get(randomValue1).click(); //Clicking on the random item in the list.
            Thread.sleep(3000);    
            driver.findElement(By.id("back-to-products")).click();  
       
            {
            	Thread.sleep(5000);
                List <WebElement> listings2 = driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div//img"));
                Random r2 = new Random();
                int randomValue2 = r.nextInt(listings2.size()); //Getting a random value that is between 0 and (list's size)-1
                listings2.get(randomValue2).click(); //Clicking on the random item in the list.
                Thread.sleep(3000);    
                driver.findElement(By.id("back-to-products")).click();
                driver.findElement(By.id("react-burger-menu-btn")).click();
                Thread.sleep(3000);
                driver.findElement(By.id("logout_sidebar_link")).click(); 
        
        }  
        }
        }
        
        else
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("[data-test='error']")));
        	Thread.sleep(2000);
        	{

    driver.quit();
}
}
}