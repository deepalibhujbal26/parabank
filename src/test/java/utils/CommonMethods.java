package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.UUID;

public class CommonMethods  extends PageInitializer{

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication() {

        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        initializerPageObjects();
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }
    }

    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(textToSend);
    }

    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT));
        return wait;
    }

    public static void waitForClickablity(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void click(WebElement element) {
        waitForClickablity(element);
        element.click();
    }

    public static JavascriptExecutor getJsExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public static void jsClick(WebElement element) {
        getJsExecutor().executeScript("arguments[0].click()", element);

    }

    public static String getTimeStamp(String pattern){
        Date date=new Date();
        //after getting the date, i need to format it as per my requirements

        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        return sdf.format(date); //it will return formatted date as per the pattern in string format

    }

    public static String generateRandomText() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().substring(0, 8);
    }

    public static void closeBrowser(){
            driver.quit();
    }


}
