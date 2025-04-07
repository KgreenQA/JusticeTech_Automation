import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WvEFilingHomePage {

    WebDriver driver;
    @FindBy( id = "ctl00_mnuMain_DXI1_PImg")
    WebElement complaintsDropDown;

    @FindBy(xpath = "//*[@id=\"ctl00_mnuMain_DXI1i0_T\"]/span")
    WebElement newCaseMenu;

    @FindBy(xpath ="//*[@id=\"ctl00_mnuMain_DXI1i0i0_T\"]/span" )
    WebElement newComplaint;




    public  WvEFilingHomePage(WebDriver xx){
        this.driver = xx;
        PageFactory.initElements(driver, this);

    }

    public void complaintStart(){
        complaintsDropDown.click();
        newCaseMenu.click();
        newComplaint.click();


    }


}
