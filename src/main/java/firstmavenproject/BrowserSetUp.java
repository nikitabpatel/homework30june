package firstmavenproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSetUp extends BasePage
{
    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getproperty("Browser");

    // Creating method for multibrowser
    public void selectBrowser()
    {
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resourses\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver","src\\test\\Resourses\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resourses\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else{System.out.print("Wrong Browser" +browser);}
    }

}
