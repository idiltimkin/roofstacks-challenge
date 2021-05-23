package com.roofstacks.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchBox {

    @FindBy(css = "input.gLFyf")
    WebElement searchInput;

    public void search(String term){
        searchInput.sendKeys(term);
        searchInput.sendKeys(Keys.ENTER);
    }
}
