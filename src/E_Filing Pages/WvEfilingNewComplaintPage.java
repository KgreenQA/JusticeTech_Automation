import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;
import java.util.List;


public class WvEfilingNewComplaintPage {

    WebDriver driver;

    //CountyDropdown
    @FindBy(id = "ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_lstCounty_I")
    WebElement county60;

    @FindBy(id = "ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_lstCounty_DDD_L_LBI55T1")
    WebElement testcountySelection;

    //CaseTypeDropdown

    @FindBy(id = "ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_lstCaseType_I")
    WebElement caseType;

    @FindBy(id ="ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_lstCaseType_DDD_L_LBI0T1")
    WebElement adminAppealCaseTypeSelection;

    //ComplaintDropdown

    @FindBy(id="ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_lstCaseSubType_I")
    WebElement complaintType;

    @FindBy(id = "ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_lstCaseSubType_DDD_L_LBI2T0")
    WebElement complaintTypeSelection;

    //next button

    @FindBy(id = "ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_btnNewCaseNext_CD")
    WebElement complaintNextBtn;

    //SubstantialHardship
    @FindBy(id = "ctl00_MainHolder_cpnlNewFiling_pnlNewFiling_pgNewFiling_ctrlComplaint_cpnlNewCase_chkSubstantialHardshipRequested_S_D")
    WebElement substantialHardshipCheckbox;



    public WvEfilingNewComplaintPage(WebDriver x){
        this.driver=x;
        PageFactory.initElements(driver, this);
    }

    public void complaintTabSelections(){
        county60.sendKeys("test");
        testcountySelection.click();

        caseType.sendKeys("Admin");
        adminAppealCaseTypeSelection.click();

        try {
            substantialHardshipCheckbox.click();

        }
        catch (StaleElementReferenceException elementHasReloaded){
            substantialHardshipCheckbox.click();
        }




        complaintNextBtn.click();




    }
}
