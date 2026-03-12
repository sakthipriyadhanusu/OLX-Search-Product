package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class ProductDetailsPage {

    WebDriver driver;

    public ProductDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//h1")
    WebElement title;

    @FindBy(xpath="//span[@data-aut-id='itemPrice']")
    WebElement price;

    @FindBy(xpath="//div[contains(@class,'seller')]")
    WebElement sellerInfo;

    @FindBy(xpath="//div[@data-aut-id='itemDescription']")
    WebElement description;

    @FindBy(xpath="//img")
    WebElement productImage;

    public boolean validateProductDetails(){

        return title.isDisplayed()
                && price.isDisplayed()
                && description.isDisplayed()
                && productImage.isDisplayed();
    }
}