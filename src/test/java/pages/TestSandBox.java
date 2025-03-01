package pages;

public class TestSandBox extends BasePage {

    
    private String dropdown = "//div[contains(@class,'css-1wa3eu0-placeholder')]";


    public TestSandBox() {
        super(driver);
    }

    public void navigateToSandbox() {
        navigateTo("https://demoqa.com/select-menu");
    }

    public void selectCategory(String category) {
        selectFromReactDropdown(dropdown, category);
    }
    
}
