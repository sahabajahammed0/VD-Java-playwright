package Weaversweb.test;

import org.testng.annotations.Test;

import com.Weaversweb.pages.BusinessManagement;
import com.Weaversweb.pages.LoginPage;
import com.Weaversweb.pages.MenuPage;
import com.Weaversweb.utils.ConfigReader;

import Weaversweb.basetest.BaseTest;

public class BusinessManagementPage extends BaseTest {
    




     LoginPage loginPage;
     MenuPage menuPage;
     BusinessManagement businessManagement;
   


    @Test
    public void User_can_able_approve_all_Business()
    {
        loginPage = new LoginPage(page);
            String username = ConfigReader.get("validUsername");
            String password = ConfigReader.get("validPassword");

            loginPage.login(username, password);
            menuPage =new MenuPage(page);
            menuPage.clickBusinessManagement();
            businessManagement = new BusinessManagement(page);
          
            businessManagement.approveAllBusiness();
            


           
           
            



            
    }

    
}
