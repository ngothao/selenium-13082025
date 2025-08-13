package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC01_Check_Enviroment
{
    WebDriver driver;
    @Test
    public void TC_011_Run_Firefox()
    {
        driver = new FirefoxDriver();
        driver.get("https://5bib.com/vi");
        driver.quit();
    }
}
