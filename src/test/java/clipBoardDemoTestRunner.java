import org.testng.annotations.Test;

public class clipBoardDemoTestRunner extends Setup{

//        @BeforeTest
//        public void startClipBoardDemo() {
//            driver.activateApp("com.appiumpro.clipboarddemo");
//        }

        @Test(priority = 1, description = "Verifying the Clipboard Demo App is working fine")
        public void doClipBoardDemo() throws InterruptedException {
            clipBoardDemoScreen clipBoardDemoScreen = new clipBoardDemoScreen(driver);
            String clipBoardText = clipBoardDemoScreen.clickClipBoardDemoCheck("Ahnaf Ahmad");
            System.out.println("Clipboard Text: " + clipBoardText);
        }
}
