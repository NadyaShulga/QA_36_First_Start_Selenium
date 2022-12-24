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
//    @Test
//    public void registrationSuccess(){
//        WebElement login=wd.findElement(By.linkText("LOGIN"));
//        login.click();
//        WebElement email = wd.findElement(By.name("email"));
//        email.click();
//        email.clear();
//        email.sendKeys("teddy1@gmail.com");
//
//        WebElement password = wd.findElement(By.name("password"));
//        password.click();
//        password.clear();
//        password.sendKeys("Teddy1206$");
//
//        List<WebElement> buttons = wd.findElements (By.tagName("button"));
//        WebElement buttonRegistration = buttons.get(1);
//        buttonRegistration.click();
//    }

    @Test
    public void ccslocatrstest() {

        wd.findElement(By.linkText("LOGIN")).click();
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement headName = wd.findElement(By.tagName("h1"));
        WebElement form = wd.findElement(By.tagName("form"));

        WebElement root = wd.findElement(By.cssSelector("#root")); //id
        WebElement container = wd.findElement(By.cssSelector(".container")); //class
        WebElement el = wd.findElement(By.cssSelector("div#root.container"));
        WebElement el1 = wd.findElement(By.cssSelector(".active")); //class

        WebElement el3 = wd.findElement(By.cssSelector("[placeholder ^='Pass']")); //starts
        WebElement el4 = wd.findElement(By.cssSelector("[placeholder *='ass']")); //contains
        WebElement el5 = wd.findElement(By.cssSelector("[placeholder $='ord']")); //ends

        WebElement el6 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement el7 = wd.findElement(By.cssSelector("[class='container']"));
        WebElement head3 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement el8 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement el9 = wd.findElement(By.cssSelector("[name='login']"));

       // WebElement el10 = wd.findElement(By.cssSelector("[name='registration']"));
        //el10.click();

       // WebElement button_reg = wd.findElement(By.cssSelector("form :last-child"));
       // button_reg.click();

        WebElement email = wd.findElement(By.cssSelector("form :first-child"));
        email.click();
        email.clear();
        email.sendKeys("teddy1@gmail.com");

         WebElement el12 = wd.findElement(By.cssSelector("form :nth-child(2)"));
         el12.click();
         el12.clear();
         el12.sendKeys("Teddy1206$");

        WebElement button_log = wd.findElement(By.cssSelector("form :nth-child(4)"));
        button_log.click();






      //  @AfterMethod
      //  public void postCondition () {
            //close browser
            // wd.quit();
        }
    }

