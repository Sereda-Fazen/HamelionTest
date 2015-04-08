package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;


/**
 * Created by Dima on 12.03.2015.
 */
public class QuicklyOrder extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;


    /*Search product 1*/

    @FindBy(xpath = "//*[@id='wrapper']/div/header/div/nav/ul/li[2]/a")
    private WebElement clickQuickly;

    @FindBy(className = "promotags")
    private WebElement quicklyOrderClick;

    @FindBy(id = "fast-order-phone")
    private WebElement SendPhone;

    @FindBy(id = "fast-order-submit")
    private WebElement QuicklyResult;

    @FindBy(xpath = "html/body/div[7]/div/div/div[2]/button")
    private WebElement Okey;

     /*Quick View*/

    @FindBy(xpath = "//*[@id='wrapper']/div[4]/div/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/a[2]")
    private WebElement clickView;



    /*Assert*/

    @FindBy(className = "bootbox-body")
    private WebElement QuicklyTrue;

    @FindBy(className = "toast-message")
    private WebElement QuicklyFalse;

    public QuicklyOrder(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void setClickQuicklyOrder() {
        clickOn(quicklyOrderClick);
    }

    public void setPhoneQuickly() {
        enter("93663107").into(SendPhone);
    }

    public void setQuickly() throws InterruptedException{
        clickOn(QuicklyResult);
        assertFalse("Нет товара в наличии", element(QuicklyFalse).isPresent());
        assertTrue(element(QuicklyTrue).isPresent());


    }

    public void setView() {
        clickOn(clickView);
    }


}
