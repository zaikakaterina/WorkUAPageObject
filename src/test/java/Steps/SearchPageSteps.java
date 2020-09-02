package Steps;

import net.thucydides.core.annotations.Step;
import pages.SearchPage;

import java.security.PublicKey;

public class SearchPageSteps {
    SearchPage searchPage;

    @Step
    public void openSearchPage() {searchPage.open(); }

    @Step
    public void fillInSearchBlock() {searchPage.SearchBlock.sendKeys("QA Engineer");}

    @Step
    public void clickOnCityBox() {searchPage.CityBox.click();}

    @Step
    public void clearCityBox() {searchPage.CityBoxClear.click();}

    @Step
    public void fillInCityBox() {searchPage.CityBox.sendKeys("Одесса");}

    @Step
    public void clickOnsearchButton() {searchPage.searchButton.click();}
}
