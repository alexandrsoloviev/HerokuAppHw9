package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;

    public static final String URL = "https://the-internet.herokuapp.com/";

    public void open(String path){
        driver.get(URL + path);
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
