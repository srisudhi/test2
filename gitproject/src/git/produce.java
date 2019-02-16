package git;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

@Test
public class produce {

  private AndroidDriver driver;

  @BeforeMethod
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformversion", "8.0.0");
    desiredCapabilities.setCapability("deviceName", "XUV3Y18725041617");

    desiredCapabilities.setCapability("app", "D:\\app\\app-release_2_11_69.apk");
   
    desiredCapabilities.setCapability("appPackage", "com.mobile.producersonline");
    desiredCapabilities.setCapability("appActivity", "com.mobile.producersonline.SplashActivity");

   
    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
    }

 // private void setCapability(String string, String string2) {
	// TODO Auto-generated method stub
	
//}
  
  public void signin() throws InterruptedException {
		MobileElement el1 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/edtEmailOrPhone");
		el1.sendKeys("Sudhir5");threed(2000);
		MobileElement el2 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/edtPassword");
		el2.sendKeys("12345");threed(2000);
		MobileElement el3 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/btnSignIn");
		el3.click();threed(2000);
		MobileElement el4 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
		el4.click();threed(2000);
  }
    public void Favarities() throws InterruptedException {
	MobileElement el1 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/edtEmailOrPhone");
	el1.sendKeys("Sudhir5");threed(2000);
	MobileElement el2 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/edtPassword");
	el2.sendKeys("12345");threed(2000);
	MobileElement el3 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/btnSignIn");
	el3.click();threed(2000);
	MobileElement el4 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
	el4.click();threed(2000);

	MobileElement elt = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
	elt.click();
	MobileElement ely = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView");
	ely.click();
	MobileElement ell = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView");
	ell.click();
	MobileElement elm = (MobileElement) driver.findElementById("com.mobile.producersonline:id/btnFavorite");
	elm.click();
	MobileElement el5 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/btnInfoOk");
	el5.click();
	MobileElement el6 = (MobileElement) driver.findElementById("com.mobile.producersonline:id/btnShare");
	el6.click();

  }




  private void threed(int i) {
	// TODO Auto-generated method stub
	
}

@AfterMethod

  public void tearDown() {
    driver.quit();
  }
}