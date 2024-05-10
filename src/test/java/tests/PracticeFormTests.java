package tests;


import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;


public class PracticeFormTests extends TestBase {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void fullFillFormTest() {
        practiceFormPage.openPage()
                .setFirstName("Artur")
                .setLastName("King")
                .setEmail("king@yandex.ru")
                .setGender("Male")
                .setUserNumber("9611111111")
                .setDateOfBirth("30", "November", "1992")
                .setSubject("Comp")
                .setHobby("Sports")
                .uploadFile("Example.jpg")
                .setCurrentAddress("Castle Camelot")
                .setState("NCR")
                .setCity("Delhi")
                .submitClick()
                .checkResult("Student Name", "Artur King")
                .checkResult("Student Email", "king@yandex.ru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "9611111111")
                .checkResult("Date of Birth", "30 November,1992")
                .checkResult("Subjects", "Computer Science")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "Example.jpg")
                .checkResult("Address", "Castle Camelot")
                .checkResult("State and City", "NCR Delhi");
    }

    @Test
    void shortFillFormTest() {
        practiceFormPage.openPage()
                .setFirstName("Artur")
                .setLastName("King")
                .setGender("Male")
                .setUserNumber("9611111111")
                .setDateOfBirth("30", "November", "1992")
                .submitClick()
                .checkResult("Student Name", "Artur King")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "9611111111")
                .checkResult("Date of Birth", "30 November,1992");
    }

    @Test
    void incorrectFillFormTest() {
        practiceFormPage.openPage()
                .setFirstName("Artur")
                .setLastName("King")
                .setGender("Male")
                .setDateOfBirth("30", "November", "1992")
                .submitClick()
                .checkAbsenceFormResult();
    }
}
