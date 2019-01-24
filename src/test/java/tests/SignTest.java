package tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignTest {

	
    @Test
    public void testefazerLogin(){
    	System.setProperty("webdriver.chrome.driver", "/Users/charles/chromedriver");

    	WebDriver navegador = new ChromeDriver();
    	navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	navegador.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
    	
    	navegador.findElement(By.id("email_container")).findElement(By.name("email")).sendKeys("charlesdccti@hmail.com");
    	navegador.findElement(By.id("loginform")).findElement(By.name("pass")).sendKeys("**********");
    	
    	navegador.findElement(By.name("login")).click();
    	

    	
        assertEquals(1, 1);
    }



}
