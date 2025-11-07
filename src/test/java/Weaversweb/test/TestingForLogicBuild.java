package Weaversweb.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Weaversweb.pages.ForgotPassword;
import com.Weaversweb.pages.LoginPage;
import com.Weaversweb.pages.MenuPage;
import com.Weaversweb.utils.ConfigReader;
import com.microsoft.playwright.Locator;

import Weaversweb.basetest.BaseTest;

public class TestingForLogicBuild extends BaseTest {
    private String businsssmanagment = "//a[normalize-space()='Business Management']";
    private String tableCategoryIDBusiness = "//table[@class='MuiTable-root css-1ogg1ku']//tbody/tr/td[1]";



    LoginPage loginPage;
    MenuPage menuPage;
    ForgotPassword forgotpPassword;
    SoftAssert softAssert = new SoftAssert();





    // @Test(priority = 1, groups = { "smoke" })
    public void  Verify_user_can_login_with_valid_credentials() throws InterruptedException {

        loginPage = new LoginPage(page);
        String username = ConfigReader.get("validUsername");
        String password = ConfigReader.get("validPassword");

        loginPage.login(username, password);
        String successMessage = loginPage.getSucessMessage();
        softAssert.assertEquals(successMessage, ConfigReader.get("SucessFullLoginMessage"), "Success message mismatch");

        String actualHeader = loginPage.getDashboardText();
        softAssert.assertTrue(actualHeader.contains("Dashboard"), "Dashboard not found after login");
       Locator businessManagementButton = page.locator(businsssmanagment);
    businessManagementButton.click();

    Locator tableLocator = page.locator(tableCategoryIDBusiness);
    

    // 6️⃣ Get all table rows
  
    int rowCount = tableLocator.count();

    System.out.println("Category IDs in table:");

    for (String categoryId : tableLocator.allTextContents()) {
        categoryId = categoryId.trim();
        if (!categoryId.isEmpty()) {
            System.out.println(categoryId);
        }
    }
    
            
        }
       

         

            

         

    







    @Test
    public void testSortingwithcategory() throws InterruptedException
    {
        Verify_user_can_login_with_valid_credentials();



        
    }
}