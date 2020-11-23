package Pages;

import driver.WebDriverSettings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends WebDriverSettings {

    public void getFirstCategory() {
        laptopCategory.click();
    }

    public void putProductInCart() {
        cartButton.click();
    }

    @FindBy(xpath = "//*[@title='Ноутбуки']")
    private WebElement laptopCategory;

    @FindBy(xpath = "(//button[@class='buy-button goods-tile__buy-button'])[1]")
    private WebElement cartButton;

}
