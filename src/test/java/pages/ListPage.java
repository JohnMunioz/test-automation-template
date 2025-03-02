package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;



public class ListPage extends BasePage {

    private String searchField = "//input[@id='myInput']";   
    private String searchResults = "//ul[@id='myUL']/li";
    public ListPage() {
        super(driver);
    }

    public void navigateToList() {
        navigateTo("https://www.w3schools.com/howto/howto_js_filter_lists.asp");
    }

    public void enterSearchCriteria() throws InterruptedException {
       try {
        Thread.sleep(600);
        write(searchField, "C");
       } catch (NoSuchElementException e) {
            System.out.println("The WebElement search fiel couldn't be found.");
            e.printStackTrace();
       }
    }

   public List<String> getAllSearchResults() {
        List<WebElement> list = driver.findElements(By.xpath(searchResults));
        List<String> stringsFromList = new ArrayList<>();
        
        for (WebElement element : list) {
            stringsFromList.add(element.getText().trim());
        }
        return stringsFromList;
    }
    
}
