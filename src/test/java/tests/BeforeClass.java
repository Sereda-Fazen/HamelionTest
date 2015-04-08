

package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import steps.*;


import javax.validation.constraints.Size;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;


/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    /**
     *
     */
    @Managed(uniqueSession = true, driver = "chrome")



    public WebDriver driver;

    public String IEPath = "C:\\Test\\Automation testing(art-lemon)\\DriverBrowsers\\IEDriverServer.exe";
    public String ChromePath = "c:\\Test\\Automation testing(art-lemon)\\DriverBrowsers\\chromedriver.exe";

         /*Регистрация*/

    @Steps
    public RegistrationSteps compare;
    @Steps
    public RegistrationSteps firstName;
    @Steps
    public RegistrationSteps mail;
    @Steps
    public RegistrationSteps phone;
    @Steps
    public RegistrationSteps adres;
    @Steps
    public RegistrationSteps city;
    @Steps
    public RegistrationSteps pass1;
    @Steps
    public RegistrationSteps pass2;
    @Steps
    public RegistrationSteps select;
    @Steps
    public RegistrationSteps button;

    /*Авторизация*/


    @Steps
    public AuthSteps fullAuth;

    @Steps
    public AuthSteps compare1;
    @Steps
    public AuthSteps email;
    @Steps
    public AuthSteps pass;
    @Steps
    public AuthSteps enter;

    /*Поиск*/

    @Steps
    public SearchSteps input;
    @Steps
    public SearchSteps submit;
    @Steps
    public SearchSteps input1;
    @Steps
    public SearchSteps submit1;

    /* Сравнение*/

    @Steps
    public CompareSteps filterMin;
    @Steps
    public CompareSteps filterMax;
    @Steps
    public CompareSteps buttonFilter;
    @Steps
    public CompareSteps compareGoods;
    @Steps
    public CompareSteps selectClick;

    /* Заказ */


    @Steps
    public OrderSteps click;
    @Steps
    public OrderSteps clickProd;
    @Steps
    public OrderSteps buy;
    @Steps
    public OrderSteps orderBuy;
    @Steps
    public OrderSteps nameOrder;
    @Steps
    public OrderSteps emailOrder;
    @Steps
    public OrderSteps phoneOrder;
    @Steps
    public OrderSteps cityOrder;
    @Steps
    public OrderSteps addressOrder;
    @Steps
    public OrderSteps order;


    /*Быстрый заказ */
    @Steps
    public QuicklyOrderSteps clickQuickly;
    @Steps
    public QuicklyOrderSteps sendPhone;
    @Steps
    public QuicklyOrderSteps clickOrderQuickly;

    @Steps
    public QuicklyOrderSteps view;


    /*Обратный звонок*/

    @Steps
    public FormSteps callBack;
    @Steps
    public FormSteps name1;
    @Steps
    public FormSteps phone1;
    @Steps
    public FormSteps button1;

    /*Контакты*/

    @Steps
    public FormSteps contact;
    @Steps
    public FormSteps n;
    @Steps
    public FormSteps m;
    @Steps
    public FormSteps msg;
    @Steps
    public FormSteps clickContact;


    @Before
    public void myTest() throws Exception {
        System.setProperty("webdriver.ie.driver", IEPath );
        System.setProperty("webdriver.chrome.driver", ChromePath);
        compare.start_browser();
        driver.manage().window().maximize();


    }

    @After
    public void close() throws IOException {
        driver.close();
    }




    }



