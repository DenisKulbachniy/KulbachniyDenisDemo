package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waiters.Waiter;

public class ProductsPage extends BasePage {
    private final Waiter wait;

    @FindBy(xpath = "(//button[@class='buy-button goods-tile__buy-button'])[1]")
    private WebElement cartButtonOnFirstProduct;

    @FindBy(xpath = "(//div[@class='header-actions__button-wrapper'])[3]")
    private WebElement headerCartButton;

    @FindBy(xpath = "//div[@class='cart-product__main']")
    private WebElement productInCart;

    @FindBy(xpath = "(//span[@class='goods-tile__title'])[1]")
    private WebElement firstProductFromLaptops;

    @FindBy(xpath = "(//span[@class='goods-tile__title'])[2]")
    private WebElement secondProductFromLaptops;

    public WebElement getCartButtonOnFirstProduct() {
        return cartButtonOnFirstProduct;
    }

    public String getProductNameInCart() {
        wait.untilVisible(productInCart);
        return productInCart.getText();
    }

    public String getFirstProductName() {
        wait.untilVisible(firstProductFromLaptops);
        return firstProductFromLaptops.getText();
    }

    public ProductsPage(WebDriver driver) {
        super(driver);
        wait = new Waiter(driver);
        PageFactory.initElements(driver, this);
    }

    public void putFirstProductInCart() {
        wait.untilVisible(cartButtonOnFirstProduct).click();

    }

    public void clickToHeaderCartButton() {
        wait.untilVisible(headerCartButton).click();
    }

    public void clickToFirstProductFromLaptops() {
        wait.untilVisible(firstProductFromLaptops);
    }

    public void clickToSecondProductFromLaptops() {
        wait.untilVisible(secondProductFromLaptops);
    }

}