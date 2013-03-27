/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author a938548
 */
public class ModeloSteps {
    
    private static final String BASE_URL = "http://localhost:8087";
    private static final String CONTEXT = "/CadCongresso";
    private static final String CONTEXT_URL = BASE_URL + CONTEXT;

    private static WebDriver driver;

    @Before
    public static void before() {
        driver = new FirefoxDriver();
    }

    @After
    public static void after() {
        driver.close();
    }
    
    @When("^I navigate to \"([^\"]*)\"$")
    public void navigateTo(String relURL) throws Throwable {
        driver.get(CONTEXT_URL + relURL);
    }
    
    @Then("^I should see \"([^\"]*)\"$")
    public void shouldSee(String text) throws Throwable {
        String source = driver.getPageSource();
        Assert.assertTrue("Source: " + source, source.contains(text));
    }
}
