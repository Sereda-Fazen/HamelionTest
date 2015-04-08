package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.validation.constraints.AssertFalse;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by Dima on 03.03.2015.
 */
public class Registration extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;

    @FindBy(linkText = "Зарегистрироваться")
    private WebElement clickRegistr;
    @FindBy(name = "firstname")
    private WebElement addName;
    @FindBy(name = "email")
    private WebElement addMail;
    @FindBy(name = "telephone")
    private WebElement addPhone;
    @FindBy(name = "address_1")
    private WebElement addAdress;
    @FindBy(name = "city")
    private WebElement addCity;
    @FindBy(name = "password")
    private WebElement addPass1;
    @FindBy(name = "confirm")
    private WebElement addPass2;
    @FindBy(xpath = "//*[@id='content']/form/div[5]/span/button")
    private WebElement addSelect;
    @FindBy(xpath = "//*[@id='content']/form/div[5]/div/button")
    private WebElement clickButton;

    // Error

    @FindBy(xpath = "//*[@id='toast-container']/div")
    private WebElement notCorrect;

    @FindBy(xpath = "//*[@id='wrapper']/div[2]/div/div/div")
    private WebElement good;


    public Registration(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void SetClick() {
        clickOn(clickRegistr);
    }

    public void SetName(String name) {
        $(addName).sendKeys(name);
    }

    public void SetMail() {
        enter("Fazen@mail.ru").into(addMail);
    }

    public void SetPhone() {
        enter("+38 093-663-1070").into(addPhone);
    }

    public void SetAdress() {
        enter("Kibalchicha 47").into(addAdress);
    }

    public void SetCity() {
        enter("Kharkov").into(addCity);
    }

    public void SetPass1() {
        enter("12345").into(addPass1);
    }

    public void SetPass2() {
        enter("12345").into(addPass2);
    }


    public void SetSelect() {
        clickOn(addSelect);
    }

    public void SetButton() {
        clickOn(clickButton);
        assertFalse("Некоректный майл", element(notCorrect).isPresent());
        assertTrue (element(good).isPresent());

    }

}
