package Stepdefinations;
import Pages.Employee;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;
import  Pages.LoginPage;
import testbase.TestBase;
import utilities.ConfigRead;

public class LoginTest extends TestBase {
    private static final Logger LOGGER = getLogger(LoginTest.class);

    WebDriver webDriver;
    LoginPage loginPage;
    TestBase testBase;
    Employee employee;
    String firstName;
    String lastName;
    String date;
    String employeeName;
//    @BeforeClass
//    public void setup() {
//        System.out.println("Inside setup");
//        testBase = new TestBase();
//        webDriver= testBase.setupApplication();
//        loginPage = new LoginPage(webDriver);
//        loginPage.login(ConfigRead.getProperty("username"), ConfigRead.getProperty("password"));
//        employee = new Employee(webDriver);
//        firstName=ConfigRead.getLasttName();
//        lastName=ConfigRead.getLasttName();
//        date=ConfigRead.getTodayDate();
//        employeeName=firstName.concat(" ").concat(lastName);
//
//    }
//
//    @AfterClass
//    public void exit() {
//        System.out.print("Inside exit");
//        loginPage.logout();
//        testBase.closeApplication();
//    }
//
//    @Given("^Valid user_name  and password$")
//    public void valid_user_name_and_password() {
//        LOGGER.info("application started");
//    }
//
//    @When("^user login  with valid inputs$")
//    public void user_login_with_valid_inputs()  {
//
//
//    }
//
//    @Then("^user logged in an application$")
//    public void user_logged_in_an_application() {
//        Assert.assertTrue(loginPage.isLoginSuccess());
//        LOGGER.info("application closed");
//    }
  /*  @Given("^Valid user_name  and password$")
    public void valid_user_name_and_password() {
    LOGGER.info("application started");
    }

    @When("^user login  with valid inputs$")
    public void user_login_with_valid_inputs()  {
      //  Login login = new Login();
        TestBase testBase = new TestBase();
        webDriver= testBase.setupApplication();
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login(ConfigRead.getProperty("username"), ConfigRead.getProperty("password"));
        Assert.assertTrue(loginPage.isLoginSuccess());
        loginPage.logout();
        testBase.closeApplication();
    }

    @Then("^user logged in an application$")
    public void user_logged_in_an_application() {
        LOGGER.info("application closed");
    }*/
}
