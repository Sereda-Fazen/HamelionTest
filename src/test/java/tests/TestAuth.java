package tests;


import jdk.nashorn.internal.ir.annotations.Ignore;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Application;


@Story(Application.TestAuth.Compare.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
public class TestAuth extends BeforeClass {
    @ManagedPages(defaultUrl = "http://hameleon.test-lemon.com")
    public Pages pages;

    @WithTag("Регистрация")
 //@Test
    public void OneTestRegistration() throws InterruptedException {

        Thread.sleep(1000);
        compare.addClick();
        firstName.addName("Alexander");
        mail.addMail();
        phone.addPhone();
        adres.addAdress();
        city.addCity();
        pass1.addPass1();
        pass2.addPass2();
        select.addSelect();
        button.addButton();

        Thread.sleep(3000);
    }

    @WithTag("Авторизация")
//@Test
    public void TwoTestAuth() throws InterruptedException {

        compare1.addClickAuth();
        email.addEmail("cud@mail.ru");
        pass.addP("12345");
        enter.addEn();
        Thread.sleep(3000);

    }

    @WithTag("Поиск")
//@Test
    public void ThreeTestSearch() throws InterruptedException {

        input.addInput();
        submit.addSearch();
        Thread.sleep(3000);

    }

    @WithTag("Сравнение")
 //@Test
    public void ForeTestSearch() throws InterruptedException {


        click.addClick();
        selectClick.addSelect();
        filterMin.addFilterMin();
        filterMax.addFilterMax();
        buttonFilter.addButton();
        compareGoods.addCompare();
        Thread.sleep(5000);
    }

    @WithTag("Заказ")
  //  @Test
    public void FourTestOrder() throws InterruptedException {


        click.addClick();
        clickProd.addClickProd();
        buy.addBuy();
        orderBuy.addOrderBuy();
        nameOrder.addName();
        emailOrder.addEmail();
        phoneOrder.addPhone();
        cityOrder.addCity();
        addressOrder.addAddress();
        order.addOrder();
        Thread.sleep(500);
    }
    @WithTag("Заказ авторизованым пользователем")
    @Test
    public void TestAuthOrder() throws InterruptedException {


        fullAuth.addAllAuth();
        click.addClick();
        clickProd.addClickProd();
        buy.addBuy();
        orderBuy.addOrderBuy();
        order.addOrder();
        Thread.sleep(500);
    }
    @WithTag("Быстрый Заказ")
  //  @Pending
 // @Test
    public void FiveTestQuicklyOrder() throws InterruptedException {

        clickQuickly.addClickQuickly();
        sendPhone.addSendPhone();
        clickOrderQuickly.addSendClick();
        Thread.sleep(500);

    }
    @WithTag("Быстрый просмотр с покупкой в один клик")
  //  @Pending
  //@Test
    public void SixTestQuickView() throws InterruptedException {


        view.addView();
        sendPhone.addSendPhone();
        clickOrderQuickly.addSendClick();
        Thread.sleep(500);

    }
    @WithTag("Быстрый просмотр с покупкой оформления закзаза")
//@Test
    public void SevenTestQuickView() throws InterruptedException {

        fullAuth.addAllAuth();
        view.addView();
        buy.addBuy();
        orderBuy.addOrderBuy();
        order.addOrder();
        Thread.sleep(500);

    }
    @WithTag("Обратнтый звонок")

 //@Test
    public void EightTestCallBack() throws InterruptedException {

        callBack.addClick1();
        name1.addName();
        phone1.addPhone();
        button1.addButton();
        Thread.sleep(3000);

    }
    @WithTag("Контакты")
 //@Test
    public void NineTestCallBack() throws InterruptedException {

        contact.addContact();
        n.addN();
        m.addM();
        msg.addMsg();
        clickContact.addClickContact();
        Thread.sleep(3000);

    }




}



