import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;
    public final String URL = "https://www.wikipedia.org/";
    public final By myXpath = By.xpath("//h1/span[contains(text(),'Wikipedia')]");

    public BasePage(WebDriver driver) {
        this.driver=driver;
    }


    public void navigateToBasePage() {
        driver.navigate().to(URL);
    }

    public boolean validateIsBasePage(){
        return driver.findElement(myXpath).isDisplayed();
    }
}
