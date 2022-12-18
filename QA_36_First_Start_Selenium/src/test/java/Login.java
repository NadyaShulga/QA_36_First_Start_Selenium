import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Login {
    WebDriver wd;
    @BeforeMethod
    public void preCondition(){
        //open browser
        wd = new ChromeDriver();
        //open site
        wd.navigate().to("https://telranedu.web.app/");
    }

    @Test
    public void findElementsOnPage(){
        //by tagName
        WebElement element = wd.findElement(By.tagName("div"));
        List<WebElement> divs = wd.findElements(By.tagName("div"));

        //By id
        WebElement el1 = wd.findElement(By.id("root"));
        
        //By class
        WebElement el2 = wd.findElement(By.className("container"));

        //By name
        wd.findElement(By.name("name"));

        //By link text a href
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("HO"));
    }
    @Test
    public void loginSuccess(){
        //open form
        //wd find item + click
        WebElement itemLogin = wd.findElement(By.linkText("LOGIN"));
        itemLogin.click(); //selenium does click button login

        //fill form
        //find email + click + clear + type
         WebElement email = wd.findElement(By.name("email"));
         email.click();
         email.clear();
         email.sendKeys("teddy1@gmail.com");

        //find email + click + clear + type
        WebElement password = wd.findElement(By.name("password"));
        password.click();
        password.clear();
        password.sendKeys("Teddy1206$");

        //submit form (click "login")
        //find button login + click
        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement buttonLogin = buttons.get(0);
        buttonLogin.click();
        
        Assert.assertEquals("", "");
        //ac == exp
    }

    //homework
    @Test
    public void registrationSuccess(){
        WebElement login=wd.findElement(By.linkText("LOGIN"));
        login.click();
        WebElement email = wd.findElement(By.name("email"));
        email.click();
        email.clear();
        email.sendKeys("teddy1@gmail.com");

        WebElement password = wd.findElement(By.name("password"));
        password.click();
        password.clear();
        password.sendKeys("Teddy1206$");

        List<WebElement> buttons = wd.findElements (By.tagName("button"));
        WebElement buttonRegistration = buttons.get(1);
        buttonRegistration.click();
    }

    @AfterMethod
    public void postCondition(){
        //close browser
       // wd.quit();
    }
}

