package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Referrals;
import utilities.Config;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Referrals_steps {
    Referrals referrals = new Referrals();

    @Given("user is on Referrals page")
    public void user_is_on_Referrals_page() {

        Driver.getDriver().get(Config.getProperty("url"));
    }


    @When("User clicks careers link")
    public void user_clicks_careers_link() {

        referrals.CareersLink.click();
    }

    @Then("User should be navigated to the careers page")
    public void user_should_be_navigated_to_the_careers_page() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Careers"));
    }

    @When("User loops through all the links on the web page and clicks on careers link")
    public void user_loops_through_all_the_links_on_the_web_page_and_clicks_on_careers_link() {

        List<WebElement> links = Driver.getDriver().findElements(By.tagName("a"));
        for (WebElement link: links){
            if(link.getText().equalsIgnoreCase("careers")){
                link.click();
                break;
            }
        }
    }

    @Then("User should be successfully navigated to the Careers page")
    public void user_should_be_successfully_navigated_to_the_Careers_page() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Careers"));

    }

    @When("User uses TAB key through all the links on the web page and pressing on careers link")
    public void user_uses_TAB_key_through_all_the_links_on_the_web_page_and_pressing_on_careers_link() throws InterruptedException {

        Actions action = new Actions(Driver.getDriver());
        List<WebElement> links = Driver.getDriver().findElements(By.tagName("a"));
        WebElement career = Driver.getDriver().findElement(By.linkText("Careers"));
        for (WebElement link : links) {
            action.sendKeys(Keys.TAB).build().perform();
            Thread.sleep(1000);
            if (Driver.getDriver().switchTo().activeElement().equals(career)) {
                action.sendKeys(Keys.ENTER).build().perform();
                break;
            }
        }
    }

    @Then("User should be navigated to the Careers page p")
    public void user_should_be_navigated_to_the_Careers_page_p() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Careers"));

    }






}
