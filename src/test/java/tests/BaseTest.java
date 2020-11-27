package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.HomePage;
import pages.ProductsPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;

    HomePage homePage = new HomePage(getDriver());
    ProductsPage productsPage = new ProductsPage(getDriver());
    BasePage basePage = new BasePage(getDriver());

    @BeforeClass
    public void setUp2(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterMethod
    public void close() {
        if (driver != null)
            driver.quit();
    }
}
