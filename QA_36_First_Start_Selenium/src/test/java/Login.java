import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    public void loginSuccess(){
        //open form
        //wd find button + click
        //fill form
        //find email + click + type
        //find email + click + type
        //submit form (click "login")
        //find button login + click

        Assert.assertEquals("", "");
        //ac == exp
    }
    @AfterMethod
    public void postCondition(){
        //close browser
        wd.quit();
    }
}

