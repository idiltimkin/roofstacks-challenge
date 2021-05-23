package com.roofstacks.util;

import com.roofstacks.Page;
import org.openqa.selenium.WebDriver;

public class Navigator {

    private final WebDriver driver;

    public Navigator(WebDriver driver){
        this.driver = driver;
    }

    public void navigateTo(Page page){
        driver.get(page.url());
    }
}
