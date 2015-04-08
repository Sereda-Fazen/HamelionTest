package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Compare;

public class CompareSteps extends ScenarioSteps {
    Compare comparePage;

    public CompareSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void start_browser() {
        Compare loginPage = getPages().get(Compare.class);
        loginPage.open();
    }

    @Step("Фильтр от ")
    public void addFilterMin()  {
        comparePage.SetFilterPriceMin();
    }
    @Step("Фильтр до ")
    public void addFilterMax () {
        comparePage.SetFilterPriceMax();
    }
    @Step ("Кликнул")
    public void addButton() {
        comparePage.SetButton();

    }
    @Step ("Кликнул сравнение товаров")
    public void addCompare () {
        comparePage.SetCompareGoods();
    }


    @Step("Селекты")
    public void addSelect() {
        comparePage.SetSelect();
    }
}














