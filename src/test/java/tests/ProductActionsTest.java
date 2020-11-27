package tests;

import org.testng.Assert;
import pages.HomePage;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class ProductActionsTest extends BaseTest {


    @Test
    public void addProductInCartTest() {
        homePage.openHomePage();
        homePage.navigateToCategoriesFromMainPage();
        homePage.navigateToLaptopCategory();
        productsPage.putFirstProductInCart();
        productsPage.clickToHeaderCartButton();
        Assert.assertEquals(productsPage.getFirstProductName(), productsPage.getProductNameInCart());
    }

    @Test
    public void checkViewedProductsTest() {
        homePage.openHomePage();
        homePage.navigateToCategoriesFromMainPage();
        homePage.navigateToLaptopCategory();
        productsPage.clickToFirstProductFromLaptops();
        basePage.clickBackButton();
        productsPage.clickToSecondProductFromLaptops();



    }
}
