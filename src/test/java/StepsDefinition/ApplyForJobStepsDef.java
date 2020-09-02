package StepsDefinition;

import Steps.SearchPageSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import Steps.VacanciesPageSteps;
import pages.ApplyPage;
import pages.VacanciesPage;
import Steps.VacancyDescriptionPageSteps;
import pages.VacancyDescriptionPage;
import pages.workuaPageObject;

public class ApplyForJobStepsDef extends workuaPageObject {

    @Steps
    VacanciesPageSteps vacanciesPageSteps;
    
    @Steps
    SearchPageSteps searchPageSteps;

    @Steps
    VacancyDescriptionPageSteps vacancyDescriptionPageSteps;

    @Steps
    VacancyDescriptionPage vacancyDescriptionPage;

    @Steps
    ApplyPage applyPage;

    @Steps
    VacanciesPage vacanciesPage;

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String arg0) throws Throwable {
        searchPageSteps.openSearchPage();
    }

    @When("^I fill in search fields$")
    public void iFillInSearchFields() {
        searchPageSteps.fillInSearchBlock();
        searchPageSteps.clickOnCityBox();
        searchPageSteps.clearCityBox();
        searchPageSteps.fillInCityBox();
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0) throws Throwable {
        searchPageSteps.clickOnsearchButton();
    }

    @Then("^I scroll down to the vacancy of choice$")
    public void iScrollDownToTheVacancyOfChoice() {
        scrollDown("1600");
    }

    @And("^I click on a vacancy in the list$")
    public void iClickOnAVacancyInTheList() {
        vacanciesPageSteps.clickonVacancyOfInterest();
    }

    @Then("^Page with the vacancy description is opened$")
    public void pageWithTheVacancyDescriptionIsOpened() {
        Assert.assertTrue(vacancyDescriptionPageSteps.isVacancyPageOpen());

    }

    @And("^I click on apply button$")
    public void iClickOnApplyButton() {
        vacancyDescriptionPage.clickOnApplyButton();
    }

    @And("^I fill in required data$")
    public void iFillInRequiredData() {
        applyPage.fillInUseName();
        applyPage.fillInEmailField();

    }

    @And("^I browse a resume file$")
    public void iBrowseAResumeFile() {
        applyPage.browseResume();

    }
    
    @When("^I add a letter$")
    public void iAddALetter() {
        applyPage.clickOnaddLettercheckbox();
        applyPage.addLetterText(); 
    }
    
    @Then("^I click on submit button$")
    public void iClickOnSubmitButton() {
        applyPage.clickOnsubmitbutton();
        
    }

}
