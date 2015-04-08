package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by Dima on 03.03.2015.
 */
public class Form extends PageObject {

    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;



    // Обратная связь
    @FindBy(xpath= "//*[@id='callme-button']")
    private WebElement clickCallBack;
    @FindBy(id  = "callback-name")
    private WebElement addName;
    @FindBy(id = "callback-phone")
    private WebElement addPhone;

    @FindBy(id = "callback-submit")
    private WebElement clickButton1;

    // Контакты
    @FindBy(linkText= "Контакты")
    private WebElement clickContact;
    @FindBy(id  = "input-name")
    private WebElement addN;
    @FindBy(id = "input-email")
    private WebElement addM;
    @FindBy(id = "input-enquiry")
    private WebElement addMsg;

    @FindBy(xpath = "//*[@id='main-contact-form']/div/div/div/button")
    private WebElement click;

    //Assert
    @FindBy(className = "modal-content")
    private WebElement clickAssert;
    @FindBy(xpath = "html/body/div[5]/div/div/div[2]/button")
    private WebElement OK;



    public Form (WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void SetClick1() {
        clickOn(clickCallBack);
    }
    public void SetName1() {
        enter("Alexander(test name)").into(addName);
    }
    public void SetPhone1() {
        enter("+38 093-966-12-89").into(addPhone);
    }

    public void SetButton1() {
        clickOn(clickButton1);
        assertTrue(element(clickButton1).isPresent());

    }





    public void SetContact() {
        clickOn(clickContact);
    }
    public void SetN() {
        enter("Alexander(test name)").into(addN);
    }
    public void SetM() {
        enter("test@mail.ru").into(addM);
    }
    public void SetMsg() {
        enter("Test case massage").into(addMsg);
    }

    public void SetClickContact() {
        clickOn(click);
        assertTrue(element(clickAssert).isPresent());
        clickOn(OK);

    }





}
