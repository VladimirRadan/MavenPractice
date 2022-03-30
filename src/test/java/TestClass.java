import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestClass extends BaseClass{


    WebDriver driver;
    String url = "http://automationpractice.com/index.php";


    @BeforeTest
    public void setWebDriver(){
        //WebDriverManager.firefoxdriver().setup();
    }

    @BeforeClass
    public void setUp2(){
        System.out.println("Ispis before class");
        //WebDriverManager.firefoxdriver().setup();
    }

    @BeforeMethod
    public void setUp1(){
        System.out.println("Ispis before Method");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void test1(){
        driver.get("https://google.com");
    }

    @Test
    public void test2(){

        driver.get("https://yahoo.com");
    }


}
