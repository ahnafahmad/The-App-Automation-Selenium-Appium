import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clipBoardDemoScreen {

    @FindBy(id="RNE__LISTITEM__padView")
    WebElement clipBoardDemoBtn;
    @FindBy(id = "messageInput")
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

    public String clickClipBoardDemoCheck(String clipBoardtext) {
        clipBoardDemoBtn.click();
        enterText.sendKeys(clipBoardtext);
        setClipBoardTextBtn.click();
        refreshClipBoardTextBtn.click();
        String clipBoardTextValue = clipBoardText.getText();
        return clipBoardTextValue;
    }
}
