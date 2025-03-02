package steps;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks extends BasePage {

    public Hooks() {
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.log("Scenario failed, see screenshot below");

            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String screenshotName = "failed_screenshot_" + timestamp + ".png";
            String screenshotPath = "test-output/HtmlReport/" + screenshotName;

            try {
                FileOutputStream fos = new FileOutputStream(screenshotPath);
                fos.write(screenshotBytes);
                fos.close();

                scenario.log("<img src='" + screenshotName + "' width='600px' />");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
