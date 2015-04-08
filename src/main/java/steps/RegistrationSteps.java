package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import page.Registration;


public class RegistrationSteps extends ScenarioSteps {
    Registration registerPage;

    public RegistrationSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        Registration loginPage = getPages().get(Registration.class);
        loginPage.open();
    }

    @Step("Кликнул Зарегистрироваться")
    public void addClick() {
        registerPage.SetClick();
    }

    @Step("Введите -")
    public void addName(String name) {
        registerPage.SetName(name);
    }


    @Step("Введите 'Майл'")
    public void addMail() {
        registerPage.SetMail();
    }

    @Step("Введите 'Телефон'")
    public void addPhone() {
        registerPage.SetPhone();
    }

    @Step("Введите 'Адрес'")
    public void addAdress() {
        registerPage.SetAdress();
    }

    @Step("Введите 'Город'")
    public void addCity() {
        registerPage.SetCity();
    }

    @Step("Введите 'Пароль'")
    public void addPass1() {
        registerPage.SetPass1();
    }

    @Step("Введите 'Подтверждение пароля'")
    public void addPass2() {
        registerPage.SetPass2();
    }

    @Step("Кликнул 'Я прочитал Политику безопасности и согласен с условиями' ")
    public void addSelect() {
        registerPage.SetSelect();
    }

    @Step("Кликнул 'Регистрация'")
    public void addButton() {
        registerPage.SetButton();
    }

}


