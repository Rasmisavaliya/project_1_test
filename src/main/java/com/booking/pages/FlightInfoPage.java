package com.booking.pages;

import com.booking.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightInfoPage extends Utility {
    private static final Logger log = LogManager.getLogger(FlightInfoPage.class.getName());

    public FlightInfoPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id ="flights")
    WebElement flightLink;
//    @CacheLookup
//    @FindBy(id ="flights")
//    WebElement destinationFrom;
    @CacheLookup
    @FindBy(css =".Text-module__root--variant-body_2___-3fYM.Text-module__root--color-disabled___tERfD")
    WebElement destinationTo;
    @CacheLookup
    @FindBy(css =".css-1ejj2j9")
    WebElement enterAirportTo;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Search']")
    WebElement search;
    @CacheLookup
    @FindBy(css =".css-3cj1dx")
    WebElement checkBox;
    @CacheLookup
    @FindBy(id ="onetrust-accept-btn-handler")
    WebElement cookies;




    public void clickOnFlightLink() {
        log.info("Click on FlightLink" + flightLink.toString());
        clickOnElement(flightLink);
    }
    public void clickOnWhereToBox(){
//        mouseHoverToElementAndClick(destinationTo);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", destinationTo);
        sendTextToElement(enterAirportTo,"Delhi");
    }
    public void clickOnCheckBox(){
   clickOnElement(checkBox);
    }
    public void clickOnCookies(){
//        driver.switchTo().frame("OTcrossDomain");
//        clickOnElement(cookies);
//        driver.switchTo().defaultContent();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", cookies);
    }
    public void clickOnSearchButton(){
        clickOnElement(search);

    }



}