package pages;

import org.openqa.selenium.By;


public class GooglePage extends BasePage {

    private String searchButton = "//div[@class='lJ9FBc']//input[@name='btnK']";
    private String searchTextField = "//textarea[@id='APjFqb']";

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

    public void clickGoogleSearch() {
        clickElement(searchButton);
    }
    
    public void enterSearchCriteria(String criteria) {
        write(searchTextField, criteria);
    }
}
