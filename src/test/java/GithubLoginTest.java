import core.TestBase;
import helpers.Actions;
import helpers.CustomListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.PageObject;
import java.io.IOException;

import static helpers.WebDriverSingleton.getDriver;

@Listeners(CustomListener.class)
public class GithubLoginTest extends TestBase {

    @Test
    public void loginTest() throws IOException {
        PageObject.login("kreisfahrer@gmail.com", "wrong pass");
        Actions.takeScreenhot("D:/screen.png");
        Assert.assertTrue(getDriver().findElement(PageObject.VALIDATION_MESSAGE).isDisplayed());
    }

    @Test
    public void onlinerTest() throws IOException {
        getDriver().get("http://onliner.by");
        System.out.println(getDriver().getTitle());
        Actions.takeScreenhot("D:/screen.png");
        //Assert.assertTrue(getDriver().findElement(PageObject.VALIDATION_MESSAGE).isDisplayed());
    }
}
