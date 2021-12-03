package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

public class FileDownloadPage extends BasePage {

    public static final By FILES_LIST = By.xpath("//div[@class='example']/a");

    public FileDownloadPage(WebDriver driver) {
        super(driver);
    }


    public void downloadFile() {


        List<WebElement> files = driver.findElements(FILES_LIST);
        WebElement file = files.get(1);
        file.click();
    }

    public boolean isFileDownloaded(String downloadPath, String fileName) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (File dirContent : dirContents) {
            if (dirContent.getName().equals(fileName)) {
                dirContent.delete();
                return true;
            }
        }
        return false;
    }

}
