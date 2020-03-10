package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Referrals {

    WebDriver driver;

    public Referrals(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
  @FindBy(linkText = "Fetch Rewards logo")
    public WebElement homePageLink;

    @FindBy(linkText = "How it Works")
    public WebElement howitworkslink;

    @FindBy(linkText = "Brands")
    public WebElement Brandslink;

    @FindBy(linkText = "Rewards")
    public WebElement rewardslink;

    @FindBy(linkText = "Invite Friebds")
    public WebElement inviteFriendsLink;

    @FindBy(linkText = "About us")
    public WebElement AboutUsLink;

    @FindBy(linkText = "Stores")
    public WebElement Storeslink;

    @FindBy(linkText = "Press")
    public WebElement PressLink;

    @FindBy(partialLinkText = "Careers")
    public WebElement CareersLink;

    @FindBy(linkText = "TermsOfService")
    public WebElement TermsOfServiceLink;

    @FindBy(linkText = "PrivacyPolicy")
    public WebElement PrivacyPolicyLink;

    @FindBy(partialLinkText =  "Privacy")
    public WebElement Privacynoticelink;

    @FindBy(partialLinkText = "Facebook")
    public WebElement Facebooklink;

    @FindBy(partialLinkText  = "Twitter")
    public WebElement Twitterlink;

    @FindBy(partialLinkText =  "Instagram")
    public WebElement  Instagramlink;

    @FindBy(linkText = "Help")
    public WebElement Helplink;



    }


