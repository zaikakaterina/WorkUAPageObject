package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VacanciesPage extends workuaPageObject{
    @FindBy(xpath = "//a[@href='/ru/jobs/3961905/']")
    public WebElement VacancyOfInterest;

public void scrollToVacancyOfInterest(){
    scrollDown(VacancyOfInterest);
}


}
