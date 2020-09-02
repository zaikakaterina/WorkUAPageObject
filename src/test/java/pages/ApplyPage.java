package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplyPage extends workuaPageObject {
    @FindBy(name = "user_name")
    WebElement namefield;

    @FindBy(id = "email")
    WebElement emailfield;

    @FindBy(xpath = "//*[@id=\"fselbtn\"]/div/a")
    WebElement browseFileButton;

    @FindBy(xpath = "//label[@for='addtextswtch']")
    WebElement addLettercheckbox;

    @FindBy(id = "addtext")
    WebElement addletterfield;

    @FindBy(id = "submitbtn")
    WebElement submitbutton;

    public void fillInUseName() {namefield.sendKeys("Екатерина Заика");}

    public void fillInEmailField() {emailfield.sendKeys("zaikakaterina@yahoo.com");}

    public void clickOnBrowseResumeButton() {browseFileButton.click();}

    public void browseResume() {browseFileButton.sendKeys("C:\\Users\\User\\Documents\\Hillel\\Заика_Екатерина.doc");}

    public void clickOnaddLettercheckbox() {addLettercheckbox.click();}

    public void addLetterText() {addletterfield.sendKeys("Добрый день. Меня зовут Заика Екатерина. На данный момент прохожу курс обучения QA manual. На сайте work.ua увидела Ваше объявление и решила обратиться с вопросом о возможном трудоустройстве в Вашей компании. Контакты указаны в резюме. Надеюсь на сотрудничество.");}

    public void clickOnsubmitbutton() {submitbutton.click();}


}
