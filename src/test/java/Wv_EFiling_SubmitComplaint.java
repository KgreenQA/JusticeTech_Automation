import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wv_EFiling_SubmitComplaint {

    public ChromeOptions options = new ChromeOptions();
    public static WebDriver wvEFilingDriver;
    WvEFiilingLogInPage eFilingLogin;
    WvEFilingHomePage eFilingHomePage;
    WvEfilingNewComplaintPage eCpPage;

    @BeforeTest
    public void setup(){
        options.addArguments("--remote-allow-origins=*");
        wvEFilingDriver = new ChromeDriver(options);
        wvEFilingDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wvEFilingDriver.get("https://testefile.courtswva.com/Default.aspx?ReturnUrl=%2fPages%2fDesktop.aspx");



    }

    @Test(priority = 1)
    public void log_into_wvEFiilng(){
        eFilingLogin = new WvEFiilingLogInPage(wvEFilingDriver);
        eFilingLogin.logIntoWvEFiling("kgreen@i3verticals.com","Playstationvsxbox88!");

    }

    @Test(priority = 2)
    public void submitComplaint(){
        eFilingHomePage = new WvEFilingHomePage(wvEFilingDriver);
        eFilingHomePage.complaintStart();
        eCpPage = new WvEfilingNewComplaintPage((wvEFilingDriver));
        eCpPage.complaintTabSelections();

    }
}
