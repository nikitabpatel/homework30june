package firstmavenproject;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils
{
    BrowserSetUp browserSetUp = new BrowserSetUp();

    @BeforeMethod

    // method to open browser
    public void openbrowser()
    {
        browserSetUp.selectBrowser();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
    }

    @AfterMethod

    // For taking screenshots when any test cases get fail.
    public  void captureScreenshoot() {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            // System.currentTimeMillis() for taking multiple screenshots. If you dont use it, it will re write old image
            // so if you dont use that you will able to take only one image at a time.
            FileUtils.copyFile(src, new File("src\\test\\Resourses\\Screenshots\\" + System.currentTimeMillis() + "\\error.png"));
            System.out.println("Screenshot taken");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

        @AfterMethod
        public void closebrowser ()
        {
            driver.quit();
        }
    }
