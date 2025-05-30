package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.openqa.selenium.NoAlertPresentException;


public class BasePage {

    protected static WebDriver driver;
    private  static WebDriverWait wait;
    private static Actions action;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
    }
   
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
    }
    
    public static void navigateTo(String url) {
        driver.get(url);
    }
    
    public static void closeBrowser() {
        driver.quit();
    }
    
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }


    public void write(String locator, String textToWrite) {
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue(String locator, String valueToSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(valueToSelect);
    }

    public void selectFromDropdownByIndex(String locator, int indexToSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(indexToSelect);
    }
    
    public void selectFromDropdownByText(String locator, String textToSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(textToSelect);
    }

    public void selectFromReactDropdown(String dropdownLocator, String optionText) {
    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dropdownLocator)));
    dropdown.click();
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
    dropdown.click();
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id,'react-select')]")));
    input.sendKeys(optionText);
    input.sendKeys(Keys.ENTER);
    }

    public void hoverOverElement(String locator) {
        action.moveToElement(Find(locator));
    }

    public void doubleClickElement(String locator) {
        action.doubleClick(Find(locator));
    }

    public void rightClickElement(String locator) {
        action.contextClick(Find(locator));
    }

    public String getValueFromTable(String locator, int row, int column) {
        String cellInTable = locator +"/table/tbody/tr[" + row + "]/td[" + column + "]";
        return Find(cellInTable).getText();
    }

    public void setValuesInTable(String locator, int row, int column, String stringToSend) {
        String cellToFill = locator +"/table/tbody/tr[" + row + "]/td[" + column + "]";
        Find(cellToFill).sendKeys(stringToSend);
    }

    public void switchToiFrame(int iFrameIndex) {
        driver.switchTo().frame(iFrameIndex);
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    public void dismissAlert() {
        try {
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    } 

    public String textFromElement(String locator) {
        return Find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator) {
        return Find(locator).isDisplayed();
    }
    
    public boolean elementIsSelected(String locator) {
        return Find(locator).isSelected();
    }

    public List<WebElement> bringMeAllElements(String locator) {
        return driver.findElements(By.className(locator));
    }
    
}  
    

