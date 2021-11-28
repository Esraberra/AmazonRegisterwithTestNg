package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage{


    /*public GooglePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }*/

    @FindBy (name = "q")
    public WebElement aramaKutusu;

}
