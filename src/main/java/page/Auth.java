package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class Auth extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    @FindBy(linkText = "Войти")
    private WebElement addClickAuth;

    @FindBy(id = "input-email")
    private WebElement addEmail;

    @FindBy(id = "input-password")
    private WebElement addP;

    @FindBy(xpath = "//*[@id='ajax2login']/button")
    private WebElement addEn;


    @FindBy(className = "toast-message")
    private WebElement errorName;
    @FindBy(linkText = "Середа Саша")
    private WebElement trueName;


    public Auth(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);

    }

    public void setAuthOrder() {
        clickOn(addClickAuth);
        enter("cud@mail.ru").into(addEmail);
        enter("12345").into(addP);
        clickOn(addEn);
        assertFalse("Неправильный логин или пароль", element(errorName).isPresent());
        assertEquals(true, element(trueName).isPresent());
    }


    public void setClick() {
        clickOn(addClickAuth);
    }

    public void setEmail(String mail) {
        enter(mail).into(addEmail);
    }

    public void setP(String pass) {
        enter(pass).into(addP);
    }

    public void setEn() {
        clickOn(addEn);
        assertFalse("Неправильный логин или пароль", element(errorName).isPresent());
        assertEquals(true, element(trueName).isPresent());



    }




}
