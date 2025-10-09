package Weaversweb.test;

import org.testng.annotations.Test;

import com.Weaversweb.pages.CatagoryManagment;
import com.Weaversweb.pages.LoginPage;
import com.Weaversweb.pages.MenuPage;
import com.Weaversweb.utils.ConfigReader;

import Weaversweb.basetest.BaseTest;

public class Catagorymanagment_Test extends BaseTest {

    LoginPage loginPage;
    MenuPage menuPage;
    CatagoryManagment categorymanagement;


    @Test
    public void User_can_able_to_Add_new_category()
    {
        loginPage = new LoginPage(page);
            String username = ConfigReader.get("validUsername");
            String password = ConfigReader.get("validPassword");

            loginPage.login(username, password);
            menuPage =new MenuPage(page);
            menuPage.clickcategorymanagemet();
            categorymanagement = new CatagoryManagment(page);
            categorymanagement.createNewCategory("Wordpress", "add");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            



            
    }


}
