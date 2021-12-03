package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest{

    @Test
    public void fileUploadTest(){
        fileUploadPage.open("upload");
        fileUploadPage.uploadFile();
        fileUploadPage.clickUploadButton();
        assertEquals(fileUploadPage.getUploadedFileText(),"qa-2-min (1).png","Text is different");
    }
}
