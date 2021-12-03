package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControlsTest() {
        dynamicControlsPage.open("dynamic_controls");
        assertTrue(driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed(), "Checkbox not found");
        dynamicControlsPage.clickRemoveButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        dynamicControlsPage.elementsNotFound("//input[@type='checkbox']");
        assertNotNull(driver.findElement(By.xpath("//input[@type='text']")).getAttribute("disabled"), "Input is enabled");
        dynamicControlsPage.clickEnabledButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        assertTrue(driver.findElement(By.xpath("//input[@type='text']")).isEnabled(), "Input is disabled");

    }
}
