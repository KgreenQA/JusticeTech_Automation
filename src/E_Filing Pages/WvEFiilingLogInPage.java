import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WvEFiilingLogInPage {

    WebDriver driver;

    @FindBy( id = "ctl00_MainHolder_cpnlDefault_ASPxRoundPanel1_txtUserId_I")
    WebElement userName;

    @FindBy(id = "ctl00_MainHolder_cpnlDefault_ASPxRoundPanel1_txtPassword_I")
    WebElement passWord;

    @FindBy(id = "ctl00_MainHolder_cpnlDefault_ASPxRoundPanel1_btnLogin_CD")
    WebElement loginButton;


    public WvEFiilingLogInPage(WebDriver xx){
        this.driver = xx;
        PageFactory.initElements(driver, this);
    }

    public void logIntoWvEFiling(String username, String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        loginButton.click();

    }


}
