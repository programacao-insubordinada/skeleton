package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.BasePage;
import pages.HelloPage;

import static support.Driver.createFireFoxDriver;
import static support.Driver.shutdownCurrentDriver;

public class HelloTest {

    private HelloPage page;

    @Before
    public void setUp() {
        createFireFoxDriver();
        page = BasePage.initElements(HelloPage.class);
    }

    @Test
    public void testSearch() {
        page.access();
        Assert.assertEquals("Welcome!", page.getTitle());
    }

    @After
    public void tearDown() {
        shutdownCurrentDriver();
    }

}
