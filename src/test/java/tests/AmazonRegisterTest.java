package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class AmazonRegisterTest {

    /* 1.WithURL go to https://wwww.amazon.com

    2.hover over to account&signs
    3.then click 'start here' link
    4.fill the 'create account' part
  datas:your name:Esra
  Mobile number or email:esraberra6@gmail.com
  PASSWORD: 3434!uK
  Re-enter password :3434!uK
  5.then clcik the continue Button
  6. verify: user should see "Verify email address" text


     */
AmazonPage page=new AmazonPage();

    @Test
    public void registrationTest(){

        Driver.getDriver().get("https://www.amazon.com");
        Actions actions=new Actions(Driver.getDriver());
        SoftAssert softAssert=new SoftAssert();
        BrowserUtilities.waitFor(3);

        actions.moveToElement(page.accountSignIn).perform();
        page.startHereLink.click();

        page.nameInput.sendKeys("Esra");
        page.eMailInput.sendKeys("esraberra6@hotmail.com");
        page.password.sendKeys("3434!uK");
        BrowserUtilities.waitFor(3);
        page.passwordCheck.sendKeys("3434!uK");
        page.continueL.click();



        softAssert.assertTrue(page.verifyEmail.isDisplayed(),"expected message is not displayed");
        softAssert.assertAll();
    }


}
