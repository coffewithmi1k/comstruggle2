import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.ITestNGListener;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.String.format;
import static org.testng.Assert.fail;


@Epic("Regression10Tests")
public class SimpleTest {



    private WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

    }
    @Story("My story")

    @Test(priority = 3)
    public void getGoogle()  {
        driver.get("Https:Google.com");
        saveScreenshotPNG(driver);
    }

    @Test(priority = 2)
    public void getFacebook()   {
        driver.get("Https:facebook.com");
saveScreenshotPNG(driver);
saveTextLog("Here you will find Success work");


    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG (WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
    //Text attachments for Allure
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog (String message) {
        return message;
    }

    //HTML attachments for Allure
    @Attachment(value = "{0}", type = "text/html")
    public static String attachHtml(String html) {
        return html;
    }






    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
