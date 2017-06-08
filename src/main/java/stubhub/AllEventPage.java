package main.java.stubhub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Roman on 31.03.2017.
 */
public class AllEventPage {

    private WebDriver driver;

    public AllEventPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToArsenalEvent(){
        WebElement el = driver.findElement(By.xpath(".//div[@class=\"event event-9605870\"]//a[@href][@data-eventid =\"9605870\"]"));
        el.click();
        this.waitMilliseconds(10000);
    }

    public String getMessegeNoTicket() {
        WebElement el = driver.findElement(By.xpath(".//div[@id=\"eventContainer\"]//div[@id=\"upcoming-events\"]/h3[@class=\"no-tickets-head\"]"));
        String text = el.getText();
        System.out.println(text);
        return text;
    }
    public void openAllEventPage(){
        driver.get("https://www.stubhub.co.uk/tottenham-hotspur-tickets/performer/164987/");
        this.waitMilliseconds(10000);
//        driver.get("https://www.google.com");
    }

    public String getTicketsNumber(){
        WebElement el = driver.findElement(By.xpath(".//div[@class=\"event event-9605870\"]/div[@class = \"event-price\"]/div[@class=\"tickets-left\"]"));
        String text = el.getText();
        System.out.println(text);
        return text;
    }

    public void waitMilliseconds(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
