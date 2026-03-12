package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@data-aut-id='searchBox']")
    WebElement searchBox;

    // Method to close popup if it appears
    public void closePopupIfPresent() {

        try {
            WebElement closePopup = driver.findElement(By.xpath("//button[@aria-label='Close']"));
            closePopup.click();
        } catch (Exception e) {
            System.out.println("Popup not present");
        }
    }

    public void searchProduct(String product){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(searchBox));

        searchBox.sendKeys(product);

        searchBox.sendKeys(Keys.ENTER);
    }
}