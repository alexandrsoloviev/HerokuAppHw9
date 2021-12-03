package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {

    public static final By REMOVE_BUTTON = By.xpath("//button[text()='Remove']");
    public static final By ENABLED_BUTTON = By.xpath("//button[text()='Enable']");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void clickRemoveButton() {
        driver.findElement(REMOVE_BUTTON).click();
    }


    public void clickEnabledButton() {
        driver.findElement(ENABLED_BUTTON).click();
    }

    public void elementsNotFound(String locator) {
        driver.findElements(By.xpath(locator));
    }
}
