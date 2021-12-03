package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploadPage extends BasePage{

    public static final By SELECT_FILE_BUTTON = By.id("file-upload");
    public static final By UPLOAD_BUTTON = By.id("file-submit");
    public static final By UPLOADED_FILE_TEXT = By.xpath("//div[@id='uploaded-files']");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }



    public void uploadFile(){
        File file = new File("src/test/resources/qa-2-min (1).png");
        driver.findElement(SELECT_FILE_BUTTON).sendKeys(file.getAbsolutePath());
    }

    public void clickUploadButton(){
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String getUploadedFileText(){
        return driver.findElement(UPLOADED_FILE_TEXT).getText();
    }

}
