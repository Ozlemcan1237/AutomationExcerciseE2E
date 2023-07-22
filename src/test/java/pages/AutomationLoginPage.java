package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationLoginPage {

    public AutomationLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@lang='en']")
    public WebElement anasayfaDogrula;

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement SignuploginButton;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emaillTextBox;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@href='/view_cart'])[2]")
    public WebElement ViewCartButton;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement ProceedToCheckout;

    @FindBy(xpath = "//*[@id='address_delivery']")
    public WebElement DeliveryAddress;

    @FindBy(xpath = "//*[@id='address_invoice']")
    public WebElement BillingAddress;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement Message;

    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement Order;

    @FindBy(xpath = "//*[@href='/products']")
    public WebElement productsButton;

//    @FindBy(xpath = "(//*[@data-product-id='38'])[1]")
//    public WebElement urun1add;
//
//    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[58]")
//    public WebElement urun2add;

    @FindBy(xpath = "//a[@href='/product_details/38']")
    public WebElement urunViewProductButton;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement urunAddButton;
    @FindBy(xpath = "//button[@class='disabled']")
    public WebElement urunSayisiDogrulama;

    @FindBy(xpath = "//*[text()='Close']")
    public WebElement popUpAccept;

    @FindBy(xpath = "//*[@viewBox='0 0 48 48']")
    public WebElement popUpX;
}
