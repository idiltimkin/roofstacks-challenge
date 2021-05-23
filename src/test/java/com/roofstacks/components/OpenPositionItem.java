package com.roofstacks.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenPositionItem {
    @FindBy(xpath = "//h4[text()='Product']")
    private WebElement productVacant;

    @FindBy(xpath = "//h4[text()='Lead Product Tester']")
    private WebElement leadProductTesterVacant;

    public void clickProductVacant() {
        productVacant.click();
    }

    public void clickLeadProductTesterVacant() {
        leadProductTesterVacant.click();
    }

}
