package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest{

    @Test
    public void frameTest(){
        framePage.open("iframe");
        assertEquals(framePage.getFrameText(),"Your content goes here.","Text is different");
    }
}
