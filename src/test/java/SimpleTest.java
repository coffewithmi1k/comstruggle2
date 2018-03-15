import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.ITestNGListener;

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

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
