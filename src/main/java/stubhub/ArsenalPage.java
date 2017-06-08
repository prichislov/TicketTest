package main.java.stubhub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Roman on 31.03.2017.
 */
public class ArsenalPage {
    private WebDriver driver;

    public ArsenalPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessegeNoTicket(){
        WebElement el = driver.findElement(By.xpath(".//div[@id=\"eventContainer\"]//div[@id=\"upcoming-events\"]/h3[@class=\"no-tickets-head\"]"));
        String text = el.getText();
        System.out.println(text);
        return text;
    }
    public void openArsenalPage() {
       // driver.get;
        this.waitMilliseconds(10000);
    }
    public void waitMilliseconds(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    @Test()
//    public  void arsenalPageTest(){
//        AllEventPage allPage = new AllEventPage(driver);
//        allPage.openAllEventPage();
//        allPage.goToArsenalEvent();
//        allPage.getMessegeNoTicket();
//
//    }
}