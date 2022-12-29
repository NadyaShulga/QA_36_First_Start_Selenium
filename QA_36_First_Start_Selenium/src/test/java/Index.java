import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeMethod
    public void start() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/shulg/Downloads/index.html");
        wd.manage().window();
    }

    @Test
    public void tableTest(){
          //check in table are 4 rows
        List<WebElement> rows = wd.findElements(By.cssSelector("tr")); //actual result
                    wd.findElement(By.xpath("//tr")); //xpath
        Assert.assertEquals(rows.size(),4);

          //last row contains "Mexico"
        WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));
                     wd.findElement(By.xpath("//tr[last()]")); //xpath
        String text = lastRow.getText();
        System.out.println(text);

          //Poland Chine Mexico contains "Mexico"
        Assert.assertTrue(text.contains("Mexico"));

          //last cell consists "Mexico"
        WebElement lastCell = wd.findElement(By.cssSelector("tr:last-child td:last-child"));
                                       wd.findElement(By.xpath("//tr[last()]//td[last()]")); //xpath
        //WebElement lastCell = wd.findElement(By.cssSelector("tr:last-child:last-child"));
        String str = lastCell.getText();
        //boolean res =str.contains("Mexico");
        Assert.assertTrue(str.contains("Mexico"));
       // Assert.assertTrue(res);

        //print Maria Anders
        System.out.println(wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)")));
                            wd.findElement(By.xpath("//tr[2]//td[2]")); //xpath
                            wd.findElement(By.xpath("//td[text() = 'Maria Anderson']")); //xpath
    }
}