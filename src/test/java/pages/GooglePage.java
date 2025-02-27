package pages;

import org.openqa.selenium.By;


public class GooglePage extends BasePage {

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
    }

    public void enterSearchFor(String searchCriteria) {
        driver.findElement(By.name("q")).sendKeys(searchCriteria);
    }

    public void clickSearchButton() {
        driver.findElement(By.name("btnK")).click();
    }
    
}
