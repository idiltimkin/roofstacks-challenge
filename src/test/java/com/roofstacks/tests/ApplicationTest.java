package com.roofstacks.tests;

import com.roofstacks.components.*;
import com.roofstacks.pages.LeadProductTesterPage;
import com.roofstacks.pages.CareerPage;
import com.roofstacks.pages.HomePage;
import com.roofstacks.util.Navigator;
import com.roofstacks.pages.GoogleSearchPage;
import com.roofstacks.util.FileUtil;
import com.roofstacks.util.WaitUtil;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.PageFactory.initElements;

@ExtendWith(SeleniumJupiter.class)
public class ApplicationTest {
    WebDriver driver;
    GoogleSearchPage googleSearchPage;
    CareerPage careerPage;
    Navigator navigator;
    LeadProductTesterPage leadProductTesterPage;
    WaitUtil waitUtil;
    HomePage homePage;

    ApplicationTest(WebDriver driver) {
        this.driver = driver;
        googleSearchPage = initElements(driver, GoogleSearchPage.class);
        homePage = initElements(driver, HomePage.class);
        careerPage = initElements(driver, CareerPage.class);
        navigator = initElements(driver, Navigator.class);
        leadProductTesterPage = initElements(driver, LeadProductTesterPage.class);
        waitUtil = initElements(driver, WaitUtil.class);
    }

    @Test
    void apply_to_lead_product_tester_position() {
        GoogleSearchBox googleSearchBox = initElements(driver, GoogleSearchBox.class);
        GoogleSearchResult googleSearchResult = initElements(driver, GoogleSearchResult.class);
        ApplicationForm applicationForm = initElements(driver, ApplicationForm.class);
        OpenPositionItem openPositionItem = initElements(driver, OpenPositionItem.class);
        Menu menu = initElements(driver, Menu.class);

        navigator.navigateTo(googleSearchPage);
        assertEquals(googleSearchPage.url(), driver.getCurrentUrl());

        googleSearchBox.search("roof stack yazılım");
        googleSearchResult.clickFirstResult();

        assertEquals(homePage.url(), driver.getCurrentUrl());

        menu.goToCareerPage();
        assertEquals(careerPage.url(), driver.getCurrentUrl());

        openPositionItem.clickProductVacant();
        openPositionItem.clickLeadProductTesterVacant();
        assertEquals(leadProductTesterPage.url(), driver.getCurrentUrl());

        applicationForm.clickSendCvButton();
        applicationForm.fillEmailInput("idiltimkin@gmail.com");
        applicationForm.uploadFile(FileUtil.getSampleFilePath());
        applicationForm.submitForm();
    }
}
