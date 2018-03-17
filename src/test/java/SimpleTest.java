import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.ITestNGListener;



@Epic("Regression10Tests")
public class SimpleTest {



    private WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

    }
    @Story("My story")

    @Test(priority = 3)
    public void getGoogle() throws InterruptedException {
        driver.get("Https:Google.com");
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void getFacebook() throws InterruptedException {
        driver.get("Https:facebook.com");
Thread.sleep(5000);
    }



   




    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
