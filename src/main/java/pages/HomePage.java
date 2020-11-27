package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waiters.Waiter;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@class='menu-toggler']")
    private WebElement ProductsCatalogue;

    @FindBy(xpath = "(//a[@class='menu__hidden-title'])[1]")
    private WebElement LaptopCategory;

    private final Waiter wait;

    public HomePage(WebDriver driver) {
        super(driver);
        wait = new Waiter(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToCategoriesFromMainPage() {
        wait.untilVisible(ProductsCatalogue).click();
    }

    public void navigateToLaptopCategory() {
        wait.untilVisible(LaptopCategory).click();
    }

    //public void

}
