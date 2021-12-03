package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenu() {
        contextMenuPage.open("context_menu");
        contextMenuPage.contextClick();
        assertEquals(contextMenuPage.getAlertText(),"You selected a context menu","The text of the alert does not meet the requirements");
    }
}
