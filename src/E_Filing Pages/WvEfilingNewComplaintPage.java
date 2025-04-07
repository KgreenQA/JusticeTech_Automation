import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class WvEfilingNewComplaintPage {

    WebDriver driver;


    @FindBy(className = "dxeButtonEditSys")
    WebElement countyDropdownSelection;

    @FindBy(id = "ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_lstCounty_I")
    WebElement county60;


    public WvEfilingNewComplaintPage(WebDriver x){
        this.driver=x;
        PageFactory.initElements(driver, this);
    }

    public void complaintTabSelections(){
        county60.sendKeys("test");









    }
}
