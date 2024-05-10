package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private final SelenideElement
            userFullNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submit = $("#submit"),
            resulTable = $("#output");

    public TextBoxPage openPage() {
        open("/text-box");
        DropBanner.dropBanner();
        return this;
    }

    public TextBoxPage setFullName(String userName) {
        userFullNameInput.setValue(userName);
        return this;
    }

    public TextBoxPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public TextBoxPage setCurrentAddress(String address) {
        currentAddressInput.setValue(address);
        return this;
    }

    public TextBoxPage setPermanentAddress(String address) {
        permanentAddressInput.setValue(address);
        return this;
    }

    public TextBoxPage submitClick() {
        submit.click();
        return this;
    }

    public TextBoxPage checkResult(String id, String text) {
        resulTable.$(byId(id)).parent()
                .shouldHave(text(text));
        return this;
    }
}
