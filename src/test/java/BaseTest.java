import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        String host ="localhost";
        DesiredCapabilities dc;

        if(System.getProperty("BROWSER") != null
                && System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = DesiredCapabilities.firefox();
        }
        else {
            dc = DesiredCapabilities.chrome();
        }

        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }

        String completeHost= "http://"+host+":4444/wd/hub";
        driver = new RemoteWebDriver(new URL(completeHost),dc);
    }

    @AfterTest
    public void closeSetUp(){
        driver.quit();
    }
}
