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
        wd.manage().window().maximize();
    }
    @Test
    public void itemsTests(){
        // find Item1 & click() ===> assert that "div-alert" contains message  "Clicked by Item 1"
        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
        item1.click();
        WebElement alert = wd.findElement(By.cssSelector("#alert"));
        String text = alert.getText();
        Assert.assertTrue(text.contains("Clicked by Item 1"));

        // find Item3 & click() ===> assert that "div-alert" contains message  "Clicked by Item 3"
        WebElement item3 = wd.findElement(By.cssSelector("a[href='#item3']"));
        item3.click();
        WebElement alert1= wd.findElement(By.cssSelector("#alert"));
        String text1 = alert1.getText();
        Assert.assertTrue(text1.contains("Clicked by Item 3"));
    }
    @Test
    public void formTests(){
        WebElement name = wd.findElement(By.cssSelector("input[name='name']"));
        name.click();
        name.clear();
        name.sendKeys("Nadya");
        // fill name & fill surename & click send
        WebElement surname = wd.findElement(By.cssSelector("input[placeholder='Type your surename']"));
        surname.click();
        surname.clear();
        surname.sendKeys("Shulga");
        // Assert that "div-alert" contains text with name + surename
        WebElement button = wd.findElement(By.cssSelector("button[class='btn']"));
        button.click();
        WebElement alert3= wd.findElement(By.cssSelector("#alert"));
        String text3 = alert3.getText();
        Assert.assertTrue(text3.contains("Nadya Shulga"));

        //HAPPY END!!!! :)))))

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