package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    public static final By HOT_SPOT = By.id("hot-spot");

    Actions actions = new Actions(driver);

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void contextClick() {
        actions.contextClick(driver.findElement(HOT_SPOT)).build().perform();
    }

    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.dismiss();
        return alertText;
    }


}
