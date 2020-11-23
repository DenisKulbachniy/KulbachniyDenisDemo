package Pages;

import driver.WebDriverSettings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends WebDriverSettings {

    public void openHomePage() {
        driver.get("https://rozetka.com.ua/");
    }

    public void navigateToCategories() {
        productCategories.click();

    }

    @FindBy(xpath = "//sidebar-fat-menu//ul/li[1]")
    private WebElement productCategories;

}
