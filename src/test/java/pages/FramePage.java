package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage extends BasePage{

    public static final By FRAME_ID = By.id("mce_0_ifr");
    public static final By FRAME_TEXT = By.xpath("//p[text()='Your content goes here.']");

    public FramePage(WebDriver driver) {
        super(driver);
    }



    public String getFrameText(){
        WebDriver frame = driver.switchTo().frame(driver.findElement(FRAME_ID));
        return frame.findElement(FRAME_TEXT).getText();
    }
}
