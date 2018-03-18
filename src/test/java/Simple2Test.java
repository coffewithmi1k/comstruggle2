import io.qameta.allure.Allure;

import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;




@Epic("Regression10Tests")
public class Simple2Test {



    private WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

    }
    @Story("My story")

    @Test(priority = 3)
    public void getTwitter()  {
        driver.get("Https:twitter.com");
        saveScreenshotPNG(driver);

    }

    @Test(priority = 2)
    public void getLinkedin()   {
        driver.get("Https:linkedin.com");
        saveScreenshotPNG(driver);

    }


    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG (WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }





    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
