package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dima on 03.03.2015.
 */
public class Search extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;

    /*Search product 1*/

    @FindBy(name = "search")
    private WebElement input;

    @FindBy(xpath = "//*[@id='livesearch_search_results']/li[2]/a")
    private WebElement search;



     /*Search product 2*/

    @FindBy(name = "search")
    private WebElement input1;

    @FindBy(xpath = "//*[@id='livesearch_search_results']/li[1]")
    private WebElement search1;

    /*Error*/
    @FindBy(linkText = "Толстовка с вышитой деталью")
    private WebElement searchResult;
    @FindBy(linkText = "Спортивная толстовка женская")
    private WebElement searchResult1;


    public Search(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void setInput() {
        enter("Куртка").into(input);
    }
    public void setSearch() {
        clickOn(search);
    }
    public void setInput1() {
        enter("Толстовка").into(input1);
    }
    public void setSearch1() {
        clickOn(search1);
    }



    public String getTextFromSearch() {
        return $(searchResult).getText();
    }
    public String getTextFromSearch1() {
        return $(searchResult1).getText();
    }


}


