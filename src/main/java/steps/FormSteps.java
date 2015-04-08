package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Form;


public class FormSteps extends ScenarioSteps {
    Form callBackPage;

    public FormSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        Form loginPage = getPages().get(Form.class);
        loginPage.open();
    }

    @Step("Кликнул Сделать заказ онлайн")
    public void addClick1() {
        callBackPage.SetClick1();
    }
    @Step("Введите 'Имя'")
    public void addName() {
        callBackPage.SetName1();
    }
    @Step("Введите 'Телефон'")
    public void addPhone() {
        callBackPage.SetPhone1();
    }
    @Step("Кликнул 'Отправить'")
    public void addButton() {
        callBackPage.SetButton1();
    }

/////////////////////////////////////////////////
    @Step("Кликнул Контакты")
    public void addContact() {
        callBackPage.SetContact();
    }
    @Step("Введите 'Имя'")
    public void addN() {
        callBackPage.SetN();
    }
    @Step("Введите 'майл'")
    public void addM() {
        callBackPage.SetM();
    }
    @Step("Введите 'вопрос'")
    public void addMsg() {
        callBackPage.SetMsg();
    }
    @Step("Кликнул 'Отправить'")
    public void addClickContact() {
        callBackPage.SetClickContact();
    }

}


