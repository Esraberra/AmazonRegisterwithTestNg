package tests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.GooglePage;
import utilities.Driver;

public class GoogleTest {

    GooglePage page = new GooglePage();

    @Test
    public void test1(){
        Driver.getDriver().get("https://google.com");
        page.aramaKutusu.sendKeys("selenium"+ Keys.ENTER);
    }

}