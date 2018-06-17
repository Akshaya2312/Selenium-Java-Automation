package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import testbase.TestBase;
import static org.slf4j.LoggerFactory.getLogger;

public class LoginPage extends TestBase {
    private static final Logger LOGGER = getLogger(LoginPage.class);
    WebDriver driver;
    private By userName =  By.cssSelector("input[type='text'][ng-model='user.name']") ;
    private By password =  By.cssSelector("input[type='password'][ng-model='user.password']") ;
    private By loginButton =  By.cssSelector("button[type='submit'][class='main-button']") ;
    private By logout =  By.cssSelector("p[class='main-button']") ;
    private By loginSuccess =  By.id("greetings") ;
    //private By loginError =  By.cssSelector("p[class='error-message ng-binding']") ;


    public LoginPage(WebDriver driver){
     this.driver = driver;
    }
    /**
     * does login
     * @param userId
     * @param pwd
     */
    public void login(String userId, String pwd){
        waitForElementPresent(driver,userName);
        findElement(driver,userName).clear();
        findElement(driver,userName).sendKeys(userId);
        waitForElementPresent(driver,password);
        findElement(driver,password).clear();
        findElement(driver,password).sendKeys(pwd);
        waitForElementPresent(driver,loginButton);
        findElement(driver,loginButton).click();
        LOGGER.info("Login is done sucessfully..");
    }
    /**
     * does logout
     */
    public void logout(){
        waitForElementPresent(driver,logout);
        Actions actions = new Actions(driver);
        WebElement logoutButton = findElement(driver,logout);
        actions.moveToElement(logoutButton).click().perform();
        LOGGER.info("logout is done sucessfully..");
    }

    /**
     * checks whether login is success or not
     * @return true if login is success, false otherwise
     */
       public boolean isLoginSuccess(){
           waitForElementPresent(driver,loginSuccess);
           return findElement(driver,loginSuccess).isDisplayed();

    }
    /**
     * checks application is logout
     * @return true if application is logout
     * Will use with invalid credentials
     *
     */

//    public boolean isLogout(){
//        return driver.findElements(loginButton).size()>0;
//
//    }
    /**
     * checks whether login is success or not
     * @return true if login is success, false otherwise
     */
//    public boolean isInvalidLogin(){
//        waitForElementPresent(driver,loginError);
//        return driver.findElement(loginError).isDisplayed();
//    }

}
