package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.QuicklyOrder;

/**
 * Created by Dima on 12.03.2015.
 */
public class QuicklyOrderSteps extends ScenarioSteps {
    QuicklyOrder QuicklyOrderPage;

    public QuicklyOrderSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        QuicklyOrder loginPage = getPages().get( QuicklyOrder.class);
        loginPage.open();
    }
    @Step("Кликнул меню ")
    public void addClickQuickly() {
        QuicklyOrderPage.setClickQuicklyOrder();
    }
    @Step("Ввел номер телефона")
    public void addSendPhone() {
        QuicklyOrderPage.setPhoneQuickly();
    }
    @Step("Кликнул Купить в один клик")
    public void addSendClick() throws InterruptedException{
        QuicklyOrderPage.setQuickly();
    }
    @Step("Кликнул быстрый просмотр")
    public void addView() {
        QuicklyOrderPage.setView();
    }







}