package test.java.stubhub;

import main.java.stubhub.AllEventPage;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Roman on 31.03.2017.
 */
public class TestStubHub {
    private WebDriver driver;

    @BeforeTest
    public void openBrowser(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roman\\IdeaProjects\\CalcTestProject\\chromedriver.exe");
//        driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //    @Test()
//    public void test(){
//        AllEventPage allPage = new AllEventPage(driver);
//        allPage.openAllEventPage();
//        String actual = allPage.getTicketsNumber();
//        Assert.assertEquals(actual, "0 tickets left", "Tickets are available!");
//    }
    @Test
    public  void test() {
        AllEventPage allPage = new AllEventPage(driver);
        allPage.openAllEventPage();
        allPage.getMessegeNoTicket();
//    String actual = allPage.getMessegeNoTicket();
//    Assert.assertSame(actual, "That's a pain.", "Tickets are available");
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.close();
        }
    }

}
