package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class SearchResultsPage {

    WebDriver driver;
    WebDriverWait wait;

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Product cards
    @FindBy(xpath="//div[@data-aut-id='itemBox']")
    List<WebElement> products;
   

    // Tamil Nadu location filter
    @FindBy(xpath="//div[text()='Tamil Nadu']")
    WebElement tamilNaduLocation;



    // Validate search results
    public boolean validateSearchResults(){

        By products = By.xpath("//div[@data-aut-id='itemBox']");

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(products));

        List<WebElement> results = driver.findElements(products);

        return results.size() > 0;
    }


    // Apply location filter
    public void applyLocationFilter(){

        By tamilNadu = By.xpath("//div[contains(text(),'Tamil Nadu')]/ancestor::a");

        WebElement location = wait.until(
            ExpectedConditions.elementToBeClickable(tamilNadu));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", location);

        location.click();

        wait.until(ExpectedConditions.visibilityOfAllElements(products));
    }



  


    // Scroll utility
    private void scrollToElement(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}