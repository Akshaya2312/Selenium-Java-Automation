package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import testbase.TestBase;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * Representation os employee home page
 */
public class Employee extends TestBase{
    private static final Logger LOGGER = getLogger(Employee.class);
    WebDriver driver;
    Actions action;
    private By create =  By.id("bAdd");
    private By delete = By.xpath("//p[contains(text(),'Delete')]");
    private By firstName =  By.cssSelector("input[ng-model='selectedEmployee.firstName']");
    private By lastName =  By.cssSelector("input[ng-model='selectedEmployee.lastName']");
    private By startDate =  By.cssSelector("input[ng-model='selectedEmployee.startDate']");
    private By email =  By.cssSelector("input[type='email']");
    private By add =  By.xpath("//button[contains(text(),'Add')]");
    private By update =  By.xpath("//button[contains(text(),'Update')]");
    private By employeeeList =  By.id("employee-list");

    public Employee(WebDriver driver){
     this.driver = driver;
    }

    /**
     * Creates new Employee
     * @param firstname
     * @param lastname
     * @param startdate
     * @param emailid
     */
    public void createEmployee(String firstname, String lastname, String startdate, String emailid){
        waitForElementPresent(driver,create);
        findElement(driver,create).click();
        waitForElementPresent(driver,firstName);
        findElement(driver,firstName).sendKeys(firstname);
        waitForElementPresent(driver,lastName);
        findElement(driver,lastName).sendKeys(lastname);
        waitForElementPresent(driver,startDate);
        findElement(driver,startDate).sendKeys(startdate.toString());
        waitForElementPresent(driver,email);
        findElement(driver,email).sendKeys(emailid);
        waitForElementVisible(driver,add);
        findElement(driver,add).click();
        LOGGER.info("employee created ..");
    }
    /**
     * Edits Already created employee
     * @param firstname
     * @param lastname
     * @param startdate
     * @param emailid
     */
    public void editEmployee(String firstname, String lastname, String startdate, String emailid){
        waitForElementPresent(driver,firstName);
        findElement(driver,firstName).clear();
        findElement(driver,firstName).sendKeys(firstname);
        waitForElementPresent(driver,lastName);
        findElement(driver,lastName).clear();
        findElement(driver,lastName).sendKeys(lastname);
        waitForElementPresent(driver,startDate);
        findElement(driver,startDate).clear();
        findElement(driver,startDate).sendKeys(startdate);
        waitForElementPresent(driver,email);
        findElement(driver,email).clear();
        findElement(driver,email).sendKeys(emailid);
        waitForElementPresent(driver,update);
        findElement(driver,update).click();
        LOGGER.info("employee edited ..");
    }
    /**
     * Deletes Employee
     */
    public void deleteEmployee(String name){

        waitForElementPresent(driver,delete);
        findElement(driver,delete).click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        LOGGER.info("employee deleted ..");
    }
    /**
     * Displays all employees
     *
     */
    public Boolean displayAllEmployees(String employeeName){
        waitForElementVisible(driver,employeeeList);
        System.out.println("Employee Name : " + employeeName);
        WebElement ul_element = findElement(driver,employeeeList);
        System.out.println("UL Element : " + ul_element.getText());
        List<WebElement> li_All = ul_element.findElements(By.tagName("li"));
        for(WebElement element : li_All){
            System.out.println(employeeName + ": Element : " + element.getText());
                if(element.getText().equals(employeeName))
                {
                    return Boolean.TRUE;
                }

        }
        return Boolean.FALSE;
    }
    /**
     * selects specific employee
     * @param employeename
     */
    public void selectSpecificEmployee( String employeename){
        String employeexpath =  "//li[contains(text(),'"+employeename+"')]";
        By employeeName =  By.xpath(employeexpath);
        waitForElementPresent(driver,employeeName);
        WebElement ul_element = findElement(driver,employeeName);
        System.out.println("UL Element : " + ul_element.getText());
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",ul_element);
        ul_element.click();
        action =new Actions(driver);
        action.doubleClick(ul_element).build().perform();
    }
    /**
     * Employee details
     * @param firstname
     * @param lastname
     * @param startdate
     * @param emailid
     */
    public Boolean employedeatils(String firstname, String lastname, String startdate, String emailid) {
        findElement(driver,firstName).click();
        System.out.println(firstname + "value" + findElement(driver,firstName).getAttribute("value"));
        System.out.println(lastname + "value" + findElement(driver,lastName).getAttribute("value"));
        System.out.println(startdate + "value" + findElement(driver,startDate).getAttribute("value"));
        System.out.println(emailid + "value" + findElement(driver,email).getAttribute("value"));
       if (firstname.equals(findElement(driver,firstName).getAttribute("value")) &&
               lastname.equals(findElement(driver,lastName).getAttribute("value")) &&
               startdate.equals(findElement(driver,startDate).getAttribute("value")) &&
               emailid.equals(findElement(driver,email).getAttribute("value"))) {
           return Boolean.TRUE;
       }
       else {

       return Boolean.FALSE;
       }
    }
}
