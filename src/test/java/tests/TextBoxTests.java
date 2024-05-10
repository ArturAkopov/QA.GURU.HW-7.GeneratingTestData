package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import utils.TestData;

public class TextBoxTests extends TestBase {

    TextBoxPage textBox = new TextBoxPage();
    TestData testData = new TestData();

    @Test
    void fillFormTest() {
        textBox.openPage()
                .setFullName(testData.firstName)
                .setEmail(testData.email)
                .setCurrentAddress(testData.currentAddress)
                .setPermanentAddress(testData.permanentAddress)
                .submitClick()
                .checkResult("name",testData.firstName)
                .checkResult("email",testData.email)
                .checkResult("currentAddress",testData.currentAddress)
                .checkResult("permanentAddress",testData.permanentAddress);
    }
}