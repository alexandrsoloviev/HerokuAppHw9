package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FileDownloadTest extends BaseTest {

    @Test
    public void downloadFile() throws InterruptedException {
        fileDownloadPage.open("download");
        fileDownloadPage.downloadFile();
        Thread.sleep(500);
        assertTrue(fileDownloadPage.isFileDownloaded("/home/alex/Загрузки", "txt.txt"));
    }
}
