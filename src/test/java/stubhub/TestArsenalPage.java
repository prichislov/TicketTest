package test.java.stubhub;

import main.java.stubhub.AllEventPage;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Roman on 03.04.2017.
 */
public class TestArsenalPage {
    private WebDriver driver;

    @BeforeTest
    public void openBrowser(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roman\\IdeaProjects\\CalcTestProject\\chromedriver.exe");
//        driver = new ChromeDriver();
        driver = new FirefoxDriver();
    }

    @Test
    public  void arsenalPageTest(){
        AllEventPage allPage = new AllEventPage(driver);
        allPage.openAllEventPage();
        allPage.goToArsenalEvent();
//        String actual = allPage.getMessegeNoTicket();
//        Assert.assertSame(actual,"That's a pain.","Tickets are available");

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
