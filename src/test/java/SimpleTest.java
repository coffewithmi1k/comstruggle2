import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ITestNGListener;



@Epic("Regression10Tests")
public class SimpleTest {



    private WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

    }
    @Story("My story")

    @Test
    public void getGoogle(){
        driver.get("Https:Google.com");
    }

    @Test
    public void getFacebook()  {
        driver.get("Https:facebook.com");

    }

   




    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
