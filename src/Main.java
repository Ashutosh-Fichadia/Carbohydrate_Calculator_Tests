public class Main extends CalculatorUtil{

    //TC_004 - Validate the "Clear" button functionality
    public static void main(String[] args) {
        CalculatorItems calculatorItems = new CalculatorItems();
        CalculatorUtil calculatorUtil = new CalculatorUtil();
        new Main().lauchBrowser();
        calculatorUtil.clickClearSendKeys(calculatorItems.ageBox, "30")
                .clickClearSendKeys(calculatorItems.heightBox, "200")
                .clickClearSendKeys(calculatorItems.weightBox, "100")
                .clickClear()
                .assertClearedValues();
    }
}