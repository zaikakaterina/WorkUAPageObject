package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class VacancyDescriptionPage extends workuaPageObject {
    @FindBy(xpath = "//b[text()='30 000 – 40 000 грн']")
    WebElement salary;

    @FindBy(linkText = "Откликнуться")
    WebElement ApplyButton;

    public void scrolltoApplyButton() {
        scrollDown(ApplyButton);
    }

    public void clickOnApplyButton() { ApplyButton.click();
    }

}
