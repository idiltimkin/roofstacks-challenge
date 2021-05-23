package com.roofstacks.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
    @FindBy(css = "a[title='Career']")
    WebElement careerLink;

    public void goToCareerPage(){
        careerLink.click();
    }
}
