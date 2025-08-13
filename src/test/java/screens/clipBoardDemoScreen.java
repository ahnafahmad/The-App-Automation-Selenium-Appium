import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class clipBoardDemoScreen {

    @FindBy(className="android.view.ViewGroup")
    List<WebElement> clipBoardDemoBtn;
    @FindBy(id="messageInput")
    WebElement enterText;
    @FindBy(id = "setClipboardText")
    WebElement setClipBoardTextBtn;
    @FindBy(id = "refreshClipboardText")
    WebElement refreshClipBoardTextBtn;
    @FindBy(id= "clipboardText")
    WebElement clipBoardText;

    public clipBoardDemoScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String clickClipBoardDemoCheck(String clipBoardFieldText) {
        clipBoardDemoBtn.get(6).click();
        enterText.sendKeys(clipBoardFieldText);
        setClipBoardTextBtn.click();
        refreshClipBoardTextBtn.click();
        String clipBoardTextValue = clipBoardText.getText();
        Assert.assertEquals(clipBoardTextValue, clipBoardFieldText );
        enterText.clear();
        return clipBoardTextValue;
    }
}
