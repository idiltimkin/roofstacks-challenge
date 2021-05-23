package com.roofstacks.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationForm {

    @FindBy(css = "a[data-toggle='modal'] > h3")
    WebElement sendCvButton;

    @FindBy(css = "input[type=email]")
    WebElement emailInput;

    @FindBy(css = "input[type=file]")
    WebElement fileInput;

    @FindBy(css = "input[type=submit]")
    WebElement submitButton;

    public void clickSendCvButton(){
        sendCvButton.click();
    }

    public void fillEmailInput(String email){
        emailInput.sendKeys(email);
    }

    public void uploadFile(String filePath){
        fileInput.sendKeys(filePath);
    }

    public void submitForm(){
        submitButton.click();
    }
}
