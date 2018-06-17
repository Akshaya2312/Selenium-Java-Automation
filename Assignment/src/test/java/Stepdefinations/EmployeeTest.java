package Stepdefinations;

import Pages.Employee;
import Pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import testbase.TestBase;
import utilities.ConfigRead;
import static org.slf4j.LoggerFactory.getLogger;

public class EmployeeTest extends TestBase {

    private static final Logger LOGGER = getLogger(EmployeeTest.class);
    WebDriver webDriver;
    LoginPage loginPage;
    TestBase testBase;
    Employee employee;
    String firstName;
    String lastName;
    String date;
    String employeeName;
    /**
     * Intialize teh setup for each feature
     */
    @Before
    public void setup() {
        System.out.println("Inside setup");
        testBase = new TestBase();
        webDriver= testBase.setupApplication();
        loginPage = new LoginPage(webDriver);
        loginPage.login(ConfigRead.getProperty("username"), ConfigRead.getProperty("password"));
        employee = new Employee(webDriver);
        firstName=ConfigRead.getLasttName();
        lastName=ConfigRead.getLasttName();
        date=ConfigRead.getTodayDate();
        employeeName=firstName.concat(" ").concat(lastName);

    }
    /**
     * Close the application after each feature
     */
    @After
    public void exit() {
        loginPage.logout();
        testBase.closeApplication();
    }
    /**
     * Valid Login scenario
     */
    @Given("^Valid user_name  and password$")
    public void valid_user_name_and_password() {

        LOGGER.info("application started");
    }
    @When("^user login  with valid inputs$")
    public void user_login_with_valid_inputs()  {
        LOGGER.info("Logged in with valid inputs");

    }
    @Then("^user logged in an application$")
    public void user_logged_in_an_application() {
        Assert.assertTrue(loginPage.isLoginSuccess());
        LOGGER.info("application closed");
    }
    /**
     * Create employee in employee list feature
     */
    @Given("^user login in an application$")
    public void user_login_in_an_application()  {
        LOGGER.info("user logged in successfully");
    }
    @When("^user click on create button and fill employee details and click add button$")
    public void user_click_on_create_button_and_fill_employee_details_and_click_add_button()  {
        employee.createEmployee(firstName,lastName,date,"abc@gmail.com");

    }
    @Then("^employee is added in employee list$")
    public void employee_is_added_in_employee_list() {
        employee.selectSpecificEmployee(employeeName);
        boolean employeedetailsfound  =employee.employedeatils(firstName,lastName,date, "abc@gmail.com");
        Assert.assertTrue(employeedetailsfound);
        employee.deleteEmployee(employeeName);
    }
    /**
     * View details of employee feature
     */
    @Given("^Employee is in employee list$")
    public void employee_is_in_employee_list() {
        employee.createEmployee(firstName,lastName,date,"abc@gmail.com");
    }
    @When("^User double click on employee$")
    public void user_double_click_on_employee() {
        employee.selectSpecificEmployee(employeeName);

    }
    @Then("^User is able to see the details of employee$")
    public void user_is_able_to_see_the_details_of_employee() {
        boolean employeedetailsfound  =employee.employedeatils(firstName,lastName,date, "abc@gmail.com");
        Assert.assertTrue(employeedetailsfound);
        employee.deleteEmployee(employeeName);
    }
    /**
     * Edit employee details  feature
     */
    @Given("^Create Employee is in employee list$")
    public void create_Employee_is_in_employee_list()  {
        employee.createEmployee(firstName,lastName,date,"abc@gmail.com");
    }

    @When("^User edit the details of employee$")
    public void user_edit_the_details_of_employee() {
        employee.selectSpecificEmployee(employeeName);
        firstName=ConfigRead.getLasttName();
        lastName=ConfigRead.getLasttName();
        date=ConfigRead.getTodayDate();
        employee.editEmployee(firstName,lastName,date,"bb@gmail.com");
    }

    @Then("^Details should be added$")
    public void details_should_be_added() {
       employeeName=firstName.concat(" ").concat(lastName);
        employee.selectSpecificEmployee(employeeName);
        boolean employeedetailsfound  =employee.employedeatils(firstName,lastName,date, "bb@gmail.com");
        Assert.assertTrue(employeedetailsfound);
        employee.deleteEmployee(employeeName);
    }
    /**
     * Delete employee from employee list feature
     */
    @Given("^Employee is present in employee list$")
    public void employee_is_present_in_employee_list() {
        employee.createEmployee(firstName,lastName,date,"abc@gmail.com");
    }


    @When("^User click on Delete button$")
    public void user_click_on_Delete_button() {
        employee.selectSpecificEmployee(employeeName);
        employee.deleteEmployee(employeeName);
    }

    @Then("^User get deleted from employee list$")
    public void user_get_deleted_from_employee_list() {
        Boolean employeeFound = employee.displayAllEmployees(employeeName);
        Assert.assertFalse(employeeFound);
    }
}

