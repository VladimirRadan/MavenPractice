import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {


    @BeforeTest
    public void setWebDriver(){
        System.out.println("ispis iz before Test");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Ispis before Method");
        WebDriverManager.edgedriver().setup();
        //driver = new EdgeDriver();
    }


}
