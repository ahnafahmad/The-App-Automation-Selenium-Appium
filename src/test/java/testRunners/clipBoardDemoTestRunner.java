import org.testng.annotations.Test;
import screens.clipBoardDemoScreen;

public class clipBoardDemoTestRunner extends Setup{

//        @BeforeTest
//        public void startClipBoardDemo() {
//            driver.activateApp("com.appiumpro.clipboarddemo");
//        }

        @Test(priority = 1, description = "Verifying the Clipboard Demo App is working fine")
        public void doClipBoardDemo() throws InterruptedException {
            clipBoardDemoScreen clipBoardDemoScreen = new clipBoardDemoScreen(driver);

            String[] values = {"Ahnaf Ahmad", "Atiqur Rahman"};

            for (String value : values) {
                String clipBoardTextField = clipBoardDemoScreen.clickClipBoardDemoCheck(value);
//                Assert.assertEquals(clipBoardText, value );
                System.out.println("Clipboard Text: " + clipBoardTextField);
            }

        }
}
