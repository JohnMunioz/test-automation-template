package pages;

public class GridPage extends BasePage {

    private String cell = "//div[@id='root']//div";
    private String mainTable = "//*[@id='root']/div/table";
    public GridPage() {
        super(driver);
    }

    public void navigateToGrid() {
        navigateTo("https://1v2njkypo4.csb.app");
    }

    public String getValuesFromGrid(int row, int column) {
        return getValueFromTable(cell, row, column);
    }

    public boolean cellStatus() {
        return elementIsDisplayed(mainTable);
    }
}
