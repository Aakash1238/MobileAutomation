package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PaymentPage {
    private AppiumDriver<AndroidElement> driver;

    public PaymentPage(AppiumDriver<AndroidElement> driver) {

        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
    public List<AndroidElement> productList;


    @AndroidFindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")
    public AndroidElement totalAmount;

    public List<AndroidElement> getProductList() {

        return productList;
    }
}
