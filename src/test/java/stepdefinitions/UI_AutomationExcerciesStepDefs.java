package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AutomationLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class UI_AutomationExcerciesStepDefs {

    AutomationLoginPage loginPage = new AutomationLoginPage();

    @Given("Kullanici {string} URL'sine gider")
    public void kullanici_url_sine_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("automationexcercies_url"));
    }
    @Then("Kullanici Ana sayfanın basarıyla gorundugunu dogrular")
    public void kullanici_ana_sayfanın_basarıyla_gorundugunu_dogrular() {
        Assert.assertTrue(loginPage.anasayfaDogrula.isDisplayed());
    }

    @Then("Kullanici Signup_Login butonuna tiklar")
    public void kullanici_signup_login_butonuna_tiklar() {
        loginPage.SignuploginButton.click();
    }

    @Then("Kullanici Email Address text box'na valid bir deger girer")
    public void kullanici_email_address_text_box_na_valid_bir_deger_girer() {
        loginPage.emaillTextBox.sendKeys("ozlmm7769@gmail.com");
    }

    @Then("Kullanici Password text box'ina valid bir deger girer")
    public void kullanici_password_text_box_ina_valid_bir_deger_girer() {
        loginPage.passwordTextBox.sendKeys("AutomationE2E");
    }

    @Then("Kullanici Login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        loginPage.loginButton.click();
    }



    @Then("Kullanici Products butonuna tiklar")
    public void kullanici_products_butonuna_tiklar() {
        ReusableMethods.clickWithJS(loginPage.productsButton);
    }

    @Then("Kullanici products sayfasından bir urun secer")
    public void kullanici_products_sayfasından_bir_urun_secer() {
        ReusableMethods.clickWithJS(loginPage.urunViewProductButton);
        loginPage.urunViewProductButton.sendKeys(Keys.ENTER);

        ReusableMethods.clickWithJS(loginPage.urunAddButton);
        loginPage.urunAddButton.sendKeys(Keys.ENTER);

//        CEREZ CIKIYORSA, CEREZI OKEYLEYELIM
        try {
            loginPage.popUpAccept.click();
        }catch (Exception e){
        }
    }

    @Then("Kullanici acılan pencereden View Cart butonuna tiklar")
    public void kullanici_acılan_pencereden_view_cart_butonuna_tiklar() {
       ReusableMethods.clickWithJS(loginPage.ViewCartButton);
       loginPage.ViewCartButton.sendKeys(Keys.ENTER);
    }

    @Then("Kullanici sepetteki urun saysısını dogrular")
    public void kullanici_sepetteki_urun_saysısını_dogrular() {
        Assert.assertTrue(loginPage.urunSayisiDogrulama.isDisplayed());
    }

    @Then("Kullanici Proceed To Checkout butonuna tiklar")
    public void kullanici_proceed_to_checkout_butonuna_tiklar() {
        loginPage.ProceedToCheckout.click();
    }

    @Then("Kullanici adres bilgilerinin gorundugunu dogrular")
    public void kullanici_adres_bilgilerinin_gorundugunu_dogrular() {
        Assert.assertTrue(loginPage.DeliveryAddress.isDisplayed());
        Assert.assertTrue(loginPage.BillingAddress.isDisplayed());
    }

    @Then("Kullanici text box kutusuna gondermek istedigi mesajı yazar")
    public void kullanici_text_box_kutusuna_gondermek_istedigi_mesajı_yazar() {
        loginPage.Message.sendKeys("Merhaba!!!...");
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici Place Order butonuna tiklar")
    public void kullanici_place_order_butonuna_tiklar() {
        loginPage.Order.click();
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().to("https://www.automationexercise.com/payment");

    }
}
