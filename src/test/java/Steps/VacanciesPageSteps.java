package Steps;

import net.thucydides.core.annotations.Step;
import pages.VacanciesPage;

public class VacanciesPageSteps {
    VacanciesPage vacanciesPage;

    @Step
    public void openVacanciesPage() {vacanciesPage.open();}

    @Step
    public boolean isPageOpened() {
        return vacanciesPage.getDriver().getCurrentUrl().contains("https://www.work.ua/ru/jobs-odesa-qa+engineer/");
    }

    @Step
    public void clickonVacancyOfInterest() {vacanciesPage.VacancyOfInterest.click();
    }
}
