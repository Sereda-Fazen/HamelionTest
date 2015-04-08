package page;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class Compare extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 200;





    @FindBy(xpath = "//*[@id='contentRow']/div[1]/div/div[4]/div[1]/div[5]/label/span")
    private WebElement select_1;
    @FindBy(xpath = "//*[@id='contentRow']/div[2]/div/div[4]/div[1]/div[5]/label/span")
    private WebElement select_2;
    @FindBy(xpath = "//*[@id='contentRow']/div[3]/div/div[4]/div[1]/div[5]/label/span")
    private WebElement select_3;
    @FindBy(xpath = "//*[@id='contentRow']/div[4]/div/div[4]/div[1]/div[5]/label/span")
    private WebElement select_4;
    @FindBy(xpath = "//*[@id='contentRow']/div[5]/div/div[4]/div[1]/div[5]/label/span")
    private WebElement select_5;
    // Filter

    @FindBy(xpath = "//*[@id='left-begun']")
    private WebElement priceMin;
    @FindBy(xpath = "//*[@id='right-begun']")
    private WebElement priceMax;
    @FindBy(xpath = "//*[@id='filter-button']/span")
    private WebElement button;
// Compare
    @FindBy(xpath = "//*[@id='column-left']/div/ul/li[2]/a")
    private WebElement CompareGoods;
    //false
    @FindBy(xpath = "//*[@id='wrapper']/div[2]/div/div")
    private WebElement buttonError;
    //CompareAssert
    @FindBy (xpath = "//*[@id='CompareLayoutOw']/ul/li[1]/button")
    private WebElement CompareTrue;

    @FindBy (xpath = "//*[@id='content']/div")
    private WebElement CompareFalse;


    public void SetFilterPriceMin() {

        Actions min = new Actions(getDriver());
        min.dragAndDropBy(priceMin, 0, 0).perform();

    }
    public void SetFilterPriceMax ()  {

        Actions max = new Actions(getDriver());
        max.dragAndDropBy(priceMax, -150, 0).perform();
    }
    public void SetButton () {

        clickOn(button);
        assertTrue(element(button).isPresent());
    }
        public void SetCompareGoods() {

            clickOn(CompareGoods);
            if (CompareGoods == null){
                assertEquals(false, element(CompareFalse).isPresent());

            } else {
                assertEquals(true, element(CompareTrue).isPresent());

            }
        }

    public void SetSelect() {
        clickOn(select_1);
        clickOn(select_2);
        clickOn(select_3);
        clickOn(select_4);
        clickOn(select_5);


    }
    public Compare(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }
}
/*


    public void clickToCompare(int number) throws InterruptedException {
        // блок первый где есть селект
        List<WebElement> results = this.getListByXpath("//*[@id='contentRow']/div[1]/div");
        for (WebElement element : results)
        {
            // первый селек в таблице на который кликаем
            element.findElement(By.xpath("//*[@id='contentRow']/div[1]/div/div[4]/div[1]/div[5]/label/span")).click();
            Thread.sleep(500);
        }
    }

    protected List<WebElement> getListByXpath(String xpath) {
        WebElement definitionList = getDriver().findElement(By.xpath("//*[@id='content']"));
        List<WebElement> results = definitionList.findElements(By.xpath(xpath));
        return results;
    }
   */
