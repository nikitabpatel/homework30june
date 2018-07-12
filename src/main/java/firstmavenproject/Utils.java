package firstmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage
{
    // to click on element
    public static void ClickOnElement(By by)
    { driver.findElement(by).click();}

    // to enter text
    public static void EnterText(By by, String text)
    { driver.findElement(by).sendKeys(text);}

    // to get text from element
    public static String GetTextFromElement(By by)
    { return driver.findElement(by).getText();}

    // for timestamp so email address will change everytime and won't give error of email already exists.
    public static String timestamp()
    { DateFormat format=new SimpleDateFormat("DDMMYYHHMM");
        return format.format(new Date());}

    // to wait for element to be invisible
    public static void  waitForElementsToBeInvisible(By by, int time)
    { WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));}

    // to select from dropdown by visible text
    public static void SelectFromDropdown(String dropdown, String chooseValue)
    { Select droplist = new Select(driver.findElement(By.name(dropdown)));
        droplist.selectByVisibleText(chooseValue); }

    // to select from dropelist by index
    public static void SelectFromDropList(String droplist, int chooseValue)
    { Select list = new Select(driver.findElement(By.id(droplist)));
        list.selectByIndex(chooseValue);
    }

    // Other reusable methods

    //clear and enter text
    public static void clearAndEnterText(By by, String text)
    {driver.findElement(by).clear();
     driver.findElement(by).sendKeys(text);}

     //select from visible text
    public static void selectFromListByText(By element, String text)
    { new Select(driver.findElement(element)).selectByVisibleText(text);}

    //select from visible number
    public static void selectFromListByNumber(By element, int number)
    { new Select(driver.findElement(element)).selectByVisibleText(String.valueOf(number));}

    //select by index
    public static void selectFromListByIndex(By element,int number)
    { new Select(driver.findElement(element)).selectByIndex(number);}

    //select by value
    public static void selectFromListByValue(By element,String text)
    { new Select(driver.findElement(element)).selectByValue(text);}

    //wait for element for given time in second
    public static void waitForElement(By by, int time)
    { WebDriverWait wait =new WebDriverWait(driver,time);
      wait.until(ExpectedConditions.visibilityOfElementLocated(by));}

    // wait and click
    public static void waitAndClick(By by,int time)
    { WebDriverWait wait = new WebDriverWait(driver,time);
    wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    driver.findElement(by).click();}

    //get text from given location
    public static String getText(By by)
    { driver.findElement(by).isDisplayed();
    return driver.findElement(by).getText();}

    //wait for specific text to present on given location
    public static void waitForText(By by,String text,int time)
    { WebDriverWait wait = new WebDriverWait(driver,time);
    wait.until(ExpectedConditions.textToBePresentInElementLocated(by,text));}

    //verify element present
    public static boolean isElementDisplayed(By by)
    {return driver.findElement(by).isDisplayed();}

    //verify element is enabled
    public static boolean isElementEnabled(By by)
    { return driver.findElement(by).isEnabled();}

    public static void navigateToBack()
    { driver.navigate().back();}

    //wait for element to be present
    public static void isAlertPresent(int time)
    {WebDriverWait wait = new WebDriverWait(driver,time);
    wait.until(ExpectedConditions.alertIsPresent()); }

    //wait for element to dis-appear
    public static void waitForElementDisappear(By by, int time)
    {WebDriverWait wait= new WebDriverWait(driver,time);
    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(by)));}

    //wait for element clickable
    public static void waitForClickable(By by,int time)
    {WebDriverWait wait = new WebDriverWait(driver,time);
    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));}

    //wait for element display
    public static void waitForElementDisplay(By by, int time)
    { WebDriverWait wait = new WebDriverWait(driver,time);
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));}

}
