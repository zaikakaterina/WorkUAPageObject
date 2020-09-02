package Steps;

import net.thucydides.core.annotations.Step;
import pages.VacancyDescriptionPage;

public class VacancyDescriptionPageSteps {
    VacancyDescriptionPage vacancyDescriptionPage;

    @Step
    public void openVacancyDescriptionPage() {vacancyDescriptionPage.open();}

    @Step
    public boolean isVacancyPageOpen() {
        return vacancyDescriptionPage.getDriver().getCurrentUrl().contains("/jobs/3961905/");}

}
