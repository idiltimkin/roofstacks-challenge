package com.roofstacks.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResult {

    @FindBy(css = "div#search .g a")
    WebElement firstResult;

    public void clickFirstResult(){
        firstResult.click();
    }
}
