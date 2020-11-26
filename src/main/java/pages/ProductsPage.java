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

    public WebElement getCartButtonOnFirstProduct() {
        return cartButtonOnFirstProduct;
    }

    @FindBy(xpath = "/html/body/app-root/div/div[1]/app-rz-header/header/div/div[2]/ul/li[5]/div/div/a")
    private WebElement headerCartButton;

    @FindBy(xpath = "//div[@class='cart-product__main']")
    private WebElement productInCart;

    @FindBy(xpath = "(//span[@class='goods-tile__title'])[1]")
    private WebElement firstProductFromCatalogue;

    public String getProductNameInCart() {
        wait.untilVisible(productInCart);
        return productInCart.getText();
    }

    public String getFirstProductName() {
        wait.untilVisible(firstProductFromCatalogue);
        return firstProductFromCatalogue.getText();
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
}