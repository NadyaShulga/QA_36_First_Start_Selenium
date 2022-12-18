import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void myTest() {
        //open browser
        wd = new ChromeDriver();
        //open link - first method without history
        //wd.get("https://telranedu.web.app/");
        //open link - second method with history
        wd.navigate().to("https://telranedu.web.app/");
        //wd.navigate().back();
        //wd.navigate().forward();
        //wd.navigate().refresh();

        //close browser 1 tab
        // wd.close();
        //close all tabs and browser
        wd.quit();

    }

    @Test
    public void secondTest(){

    }
}
