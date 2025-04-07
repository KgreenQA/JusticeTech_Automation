import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WvEfilingNewComplaintPage {

    WebDriver driver;


    @FindBy(className = "dxeButtonEditSys")
    WebElement countyDropdownSelection;

    @FindBy(xpath = "//*[@id=\"ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_lstCounty_DDD_L_LBI55T1\"]")
    WebElement county60;


    public WvEfilingNewComplaintPage(WebDriver x){
        this.driver=x;
        PageFactory.initElements(driver, this);
    }

    public void complaintTabSelections(){
        countyDropdownSelection.click();
        countyDropdownSelection.sendKeys(Keys.DOWN);


    }
}
