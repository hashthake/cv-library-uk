package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    @FindBy(id = "keywords")
    WebElement jobtitle;
    @FindBy(id = "location")
    WebElement location;
    @FindBy(id="distance")
    WebElement distanceDropdown;
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionLink;
    @FindBy (id = "salarymin")
    WebElement salaryMin;
    @FindBy (id = "salarymax")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobBtn;
    @FindBy (xpath = "//button[@class='mat-focus-indicator solo-button mat-button mat-button-base mat-raised-button']//span//div")
    WebElement acceptCookies;
    @FindBy (xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement iframeCookies;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public void acceptCookies(){
        switchToIframe(iframeCookies);
        clickOnElement(acceptCookies);
    }



    public void enterJobTitle(String jobTitle){
        sendTextToElement(jobtitle,jobTitle);
    }
    public void enterLocation(String Location){
        sendTextToElement(location,Location);
    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distanceDropdown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionLink);
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }

    public void selectJobType(String jType){
        selectByVisibleTextFromDropDown(jobTypeDropDown,jType);
    }

    public void clickOnFindJobButton(){
        clickOnElement(findJobBtn);
    }
    



    // jobTitle,
// location,
// distanceDropDown,
// moreSearchOptionsLink,
// salaryMin,
//    salaryMax,
//    salaryTypeDropDown,
//    jobTypeDropDown,
//    findJobsBtn

//    enterJobTitle(String jobTitle),
//    enterLocation(String location),
//    selectDistance(String distance),
//    clickOnMoreSearchOptionLink(),
//    enterMinSalary(String minSalary),
//    enterMaxSalary(String maxSalary),
//    selectSalaryType(String sType),
//    selectJobType(String jobType),
//    clickOnFindJobsButton().
}
