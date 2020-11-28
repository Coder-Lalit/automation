import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBasePage extends BaseTest{

    @Test
    public void navigateToBasePage1(){
        BasePage basePage = new BasePage(driver);
        basePage.navigateToBasePage();
        Assert.assertTrue(basePage.validateIsBasePage(),"Base Page not found");
    }

    @Test
    public void navigateToBasePage2(){
        BasePage basePage = new BasePage(driver);
        basePage.navigateToBasePage();
        Assert.assertTrue(basePage.validateIsBasePage(),"Base Page not found");
    }

    @Test
    public void navigateToBasePage3(){
        BasePage basePage = new BasePage(driver);
        basePage.navigateToBasePage();
        Assert.assertTrue(basePage.validateIsBasePage(),"Base Page not found");
    }


}