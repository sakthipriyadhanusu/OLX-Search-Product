package tests;

import base.BaseTest;
import pages.*;
import utils.ScreenshotUtil;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {

    @Test
  
    public void verifyProductDetails(){
    	HomePage home = new HomePage(driver);
    	home.searchProduct("Used mobile phone");

    	SearchResultsPage results = new SearchResultsPage(driver);

    	Assert.assertTrue(results.validateSearchResults());

    	results.applyLocationFilter();

    

    	
    	

    }
}