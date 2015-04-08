package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Dima on 12.03.2015.
 */
public class Order extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 10000;

    /*Search product 1*/

    @FindBy(xpath = "//*[@id='wrapper']/div/header/div/nav/ul/li[2]/a")
    private WebElement click;

    @FindBy(xpath = "//*[@id='contentRow']/div[2]/div")
    private WebElement clickProd;

    @FindBy(id = "button-cart")
    private WebElement buy;

    @FindBy(linkText = "Оформление заказа")
    private WebElement orderBuy;

    @FindBy(id = "payment_address_firstname")
    private WebElement name;

    @FindBy(id = "payment_address_email")
    private WebElement mail;

    @FindBy(id = "payment_address_telephone")
    private WebElement phone;

    @FindBy(id = "payment_address_city")
    private WebElement city;

    @FindBy(id = "payment_address_address_1")
    private WebElement address;


    @FindBy(id = "confirm_order")
    private WebElement order;



    /*true*/
    @FindBy(xpath = "//*[@id='wrapper']/div[2]/div/div/div/h1")
    private WebElement OrderResult;
    @FindBy(className = "InStock")
    private WebElement inStock;
    @FindBy(className = "LeftStock")
    private WebElement leftStock;


    //false
    @FindBy (xpath = "//*[@id='toast-container']")
    private WebElement ErrorFalse;
    @FindBy (xpath = "//*[@id='product']/div[2]/div[1]/div[2]/span")
    private WebElement textOfStock;

//////////


    @FindBy (id = "fast-order-submit")
    private WebElement noOrder;



    public Order(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void setClick() {
        clickOn(click);
    }
    public void setClickProd() throws InterruptedException{
        clickOn(clickProd);

    }
    public void  setBuy() {

        clickOn(textOfStock);
        assertEquals("нет в наличии", is(textOfStock));

    }






    public void setOrderBuy() {
        clickOn(orderBuy);
    }

    public void setName() {
        enter("Саша").into(name);
    }
    public void setMail() {
        enter("fazen7@mail.ru").into(mail);
    }
    public void setPhone() {
        enter("093-663-1070").into(phone);
    }
    public void setCity() {
        enter("Харьков").into(city);
    }
    public void setAddress() {
        enter("Ул. Кибальчича 47").into(address);
    }

    public void setOrder() {
        clickOn(order);
        assertFalse("Покупка не была совершена", element(ErrorFalse).isPresent());
        assertTrue(element(OrderResult).isPresent());

    }






}
