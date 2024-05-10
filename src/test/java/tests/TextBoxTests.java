package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTests extends TestBase {

    TextBoxPage textBox = new TextBoxPage();

    @Test
    void fillFormTest() {
        textBox.openPage()
                .setFullName("Artur")
                .setEmail("king@yandex.ru")
                .setCurrentAddress("Castle Camelot")
                .setPermanentAddress("Castle Camelot 2")
                .submitClick()
                .checkResult("name","Artur")
                .checkResult("email","king@yandex.ru")
                .checkResult("currentAddress","Castle Camelot")
                .checkResult("permanentAddress","Castle Camelot 2");
    }
}