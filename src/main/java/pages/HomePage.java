package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waiters.Waiter;

public class HomePage extends BasePage {
    @FindBy(xpath = "/html/body/app-root/div/div[1]/app-rz-header/header/div/div[2]/div[1]/button")
    private WebElement ProductsCatalogue;

    @FindBy(xpath = "/html/body/app-root/div/div[1]/app-rz-header/header/div/div[2]/div[1]/fat-menu/div/ul/li[1]/div/div[2]/div[1]/div[1]/ul[1]/li/a")
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

}
