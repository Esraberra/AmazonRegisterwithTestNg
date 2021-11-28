package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage extends BasePage {



@FindBy (partialLinkText = "Account & Lists")

    public WebElement accountSignIn;


@FindBy(partialLinkText="Start here.")
    public WebElement startHereLink;

@FindBy (id = "ap_customer_name")
    public WebElement nameInput;


@FindBy (id = "ap_email")
public WebElement eMailInput;


@FindBy(id="ap_password")
    public WebElement password;

@FindBy(id="ap_password_check")
    public WebElement passwordCheck;

@FindBy(xpath = "//input[@id='continue']")

    public WebElement continueL;

@FindBy(xpath = "//h1[text()='Verify email address']")

    public  WebElement verifyEmail;




}
