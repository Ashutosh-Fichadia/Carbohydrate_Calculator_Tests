import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorUtil {
    WebDriver webDriver;
    CalculatorItems calculatorItems = new CalculatorItems();

    public CalculatorUtil clickClearSendKeys(By element, String key){
        webDriver.findElement(element).click();
        webDriver.findElement(element).clear();
        webDriver.findElement(element).sendKeys(key);

        return this;
    }

    public CalculatorUtil clickCalculate(){
        webDriver.findElement(calculatorItems.calculateBtn).click();
        return this;
    }

    public CalculatorUtil clickClear(){
        webDriver.findElement(calculatorItems.calculateBtn).click();
        return this;
    }

    public CalculatorUtil assertClearedValues(){

        Assert.isTrue(webDriver.findElement(calculatorItems.ageBox).getText().equals(""),"Age not cleared");
        Assert.isTrue(webDriver.findElement(calculatorItems.heightBox).getText().equals(""),"Height Not Cleared");
        Assert.isTrue(webDriver.findElement(calculatorItems.weightBox).getText().equals(""),"Weight Not Cleared");

        return this;
    }

    public void lauchBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/ashutosh.fichadia/Downloads/chromedriver-mac-arm64/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.calculator.net/carbohydrate-calculator.html");
    }
}
