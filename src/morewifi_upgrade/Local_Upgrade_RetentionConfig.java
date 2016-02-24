package morewifi_upgrade;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Local_Upgrade_RetentionConfig {
  private WebDriver driver;
  private String baseUrl;

  @BeforeClass 
  public void setUp() throws Exception {
	System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla Firefox/firefox.exe");
    driver = new FirefoxDriver();   
    baseUrl = "http://m.com";  
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test
  //upgrade
  public void test() throws Exception {
	driver.manage().window().maximize();
    driver.get("http://m.com");  
    if(Open_Close_Auth_FromRouter.isContentAppeared(driver, "MW1000X")==true){
    	driver.findElement(By.id("focus_password")).sendKeys("admin");
        
        driver.findElement(By.cssSelector("input.cbi-button.cbi-button-apply")).click();
        driver.findElement(By.xpath(".//*[@id='main-menu']/div[4]/ul/li[3]/a")).click(); 
      
       // driver.findElement(By.xpath(".//*[@id='image']")).sendKeys("file:///C:/Users/MoreWiFi/Desktop/shengji/morewifi-MW1000X-0.3.0.0e780ae-combined-ext4.img.gz");
      driver.findElement(By.xpath(".//*[@id='image']")).sendKeys("C:\\Users\\MoreWiFi\\Desktop\\shengji\\morewifi-MW1000X-0.3.0.0e780ae-combined-ext4.img.gz");
        driver.findElement(By.xpath(".//*[@id='page-content']/div/div/fieldset[2]/form/div[2]/div[2]/div/input[2]")).click();
        Thread.sleep(30000);
        driver.findElement(By.xpath(".//*[@id='page-content']/div/div/form[2]/input[3]")).click();  
       Thread.sleep(300000);
        driver.manage().timeouts().implicitlyWait(350000,TimeUnit.SECONDS);
        driver.get(baseUrl);
        
        //driver.getText("By.xpath(".//*[@id='footer']/")");
       // Open_Close_Auth_FromRouter.verifyEquals(driver.getText("By.xpath(".//*[@id='footer']/")"), "MW2000E 0.3.0.0e780ae-v1.2");
        
        //network test
        //driver.get("http://www.baidu.com");
        //assertTrue(driver.getTitle().matches("百度一下，你就知道"));
       // driver.close(); 
        
  
    	
    }else if (Open_Close_Auth_FromRouter.isContentAppeared(driver, "MW2000E")==true){
    	driver.findElement(By.id("focus_password")).sendKeys("admin");

    	driver.findElement(By.cssSelector("input.cbi-button.cbi-button-apply")).click();
    	driver.findElement(By.xpath(".//*[@id='main-menu']/div[4]/ul/li[3]/a")).click(); 

    	driver.findElement(By.xpath(".//*[@id='image']")).sendKeys("file:///C:/Users/MoreWiFi/Desktop/shengji/morewifi-MW2000E-0.3.0.0e780ae-combined-ext4.img.gz");
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/fieldset[2]/form/div[2]/div[2]/div/input[2]")).click();
    	Thread.sleep(30000);
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/form[2]/input[3]")).click();  
    	Thread.sleep(300000);
    	driver.manage().timeouts().implicitlyWait(350000,TimeUnit.SECONDS);
    	driver.get(baseUrl);
    	//assertTrue(driver.findElement(By.xpath(".//*[@id='footer']/div/div")).getText().matches("^[\\s\\S]*MW2000E 0.3.0.*[\\s\\S]*$"));
    	
    	//network test
        driver.get("http://www.baidu.com");
       // assertTrue(driver.getTitle().matches("百度一下，你就知道"));
    	driver.close(); 

        
    	
    }else if (Open_Close_Auth_FromRouter.isContentAppeared(driver, "MW500X")==true){
    	driver.findElement(By.id("focus_password")).sendKeys("admin");
    	

    	driver.findElement(By.cssSelector("input.cbi-button.cbi-button-apply")).click();
    	driver.findElement(By.xpath(".//*[@id='main-menu']/div[4]/ul/li[3]/a")).click(); 

    	driver.findElement(By.xpath(".//*[@id='image']")).sendKeys("file:///C:/Users/MoreWiFi/Desktop/shengji/morewifi-MW500X-0.3.0.0e780ae-combined-ext4.img.gz");
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/fieldset[2]/form/div[2]/div[2]/div/input[2]")).click();
    	Thread.sleep(30000);
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/form[2]/input[3]")).click();  
    	Thread.sleep(300000);
    	driver.manage().timeouts().implicitlyWait(350000,TimeUnit.SECONDS);
    	driver.get(baseUrl);
    	//assertTrue(driver.findElement(By.xpath(".//*[@id='footer']/div/div")).getText().matches("^[\\s\\S]*MW1000X 0.3.0.*[\\s\\S]*$"));
    	
    	//network test
        driver.get("http://www.baidu.com");
       // assertTrue(driver.getTitle().matches("百度一下，你就知道"));
    	driver.close(); 
    	
    }else if (Open_Close_Auth_FromRouter.isContentAppeared(driver, "MR100M")==true){
    	driver.findElement(By.id("focus_password")).sendKeys("admin");
    	

    	driver.findElement(By.cssSelector("input.cbi-button.cbi-button-apply")).click();
    	driver.findElement(By.xpath(".//*[@id='main-menu']/div[4]/ul/li[3]/a")).click(); 

    	driver.findElement(By.xpath(".//*[@id='image']")).sendKeys("file:///C:/Users/MoreWiFi/Desktop/shengji/MoreWiFi_MR100M-IN01M22DQ-P300_MT7620A-Rev-A_0.2.1_sysupgrade.bin");
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/fieldset[2]/form/div[2]/div[2]/div/input[2]")).click();
    	Thread.sleep(30000);
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/form[2]/input[3]")).click();  
    	Thread.sleep(300000);
    	driver.manage().timeouts().implicitlyWait(350000,TimeUnit.SECONDS);
    	driver.get(baseUrl);
    	//VerifyError(driver.findElement(By.xpath(".//*[@id='footer']/div/div")).getText().matches("^[\\s\\S]*MW1000X 0.3.0.*[\\s\\S]*$"));
    	
    	//network test
        driver.get("http://www.baidu.com");
       // assertTrue(driver.getTitle().matches("百度一下，你就知道"));
    	driver.close(); 
    	
    }else if (Open_Close_Auth_FromRouter.isContentAppeared(driver, "MA210A")==true){
    	driver.findElement(By.id("focus_password")).sendKeys("admin");
    	

    	driver.findElement(By.cssSelector("input.cbi-button.cbi-button-apply")).click();
    	driver.findElement(By.xpath(".//*[@id='main-menu']/div[4]/ul/li[3]/a")).click(); 

    	driver.findElement(By.xpath(".//*[@id='image']")).sendKeys("file:///C:/Users/MoreWiFi/Desktop/shengji/morewifi-ma210a-v0.2.1.f087074-squashfs-sysupgrade.bin");
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/fieldset[2]/form/div[2]/div[2]/div/input[2]")).click();
    	Thread.sleep(30000);
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/form[2]/input[3]")).click();  
    	Thread.sleep(30000);
    	driver.manage().timeouts().implicitlyWait(35000,TimeUnit.SECONDS);
    	driver.get(baseUrl);
    	//assertTrue(driver.findElement(By.xpath(".//*[@id='footer']/div/div")).getText().matches("^[\\s\\S]*MW1000X 0.3.0.*[\\s\\S]*$"));
    	
    	//network test
        driver.get("http://www.baidu.com");
        //assertTrue(driver.getTitle().matches("百度一下，你就知道"));
    	driver.close(); 
    	
    }else if (Open_Close_Auth_FromRouter.isContentAppeared(driver, "MW300M")==true){
    	driver.findElement(By.id("focus_password")).sendKeys("admin");
    	

    	driver.findElement(By.cssSelector("input.cbi-button.cbi-button-apply")).click();
    	driver.findElement(By.xpath(".//*[@id='main-menu']/div[4]/ul/li[3]/a")).click(); 

    	driver.findElement(By.xpath(".//*[@id='image']")).sendKeys("file:///C:/Users/MoreWiFi/Desktop/shengji/morewifi-MW300M-v0.3.0.0e780ae-squashfs-sysupgrade.bin");
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/fieldset[2]/form/div[2]/div[2]/div/input[2]")).click();
    	Thread.sleep(30000);
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/form[2]/input[3]")).click();  
    	Thread.sleep(300000);
    	driver.manage().timeouts().implicitlyWait(350000,TimeUnit.SECONDS);
    	driver.get(baseUrl);
    	//assertTrue(driver.findElement(By.xpath(".//*[@id='footer']/div/div")).getText().matches("^[\\s\\S]*MW1000X 0.3.0.*[\\s\\S]*$"));
    	
    	//network test
        driver.get("http://www.baidu.com");
        //assertTrue(driver.getTitle().matches("百度一下，你就知道"));
    	driver.close(); 
    	
    }else if (Open_Close_Auth_FromRouter.isContentAppeared(driver, "MR100A")==true){
    	driver.findElement(By.id("focus_password")).sendKeys("admin");
    	

    	driver.findElement(By.cssSelector("input.cbi-button.cbi-button-apply")).click();
    	driver.findElement(By.xpath(".//*[@id='main-menu']/div[4]/ul/li[3]/a")).click(); 

    	driver.findElement(By.xpath(".//*[@id='image']")).sendKeys("file:///C:/Users/MoreWiFi/Desktop/shengji/morewifi-mr100a-v0.0.19.20d92e7-squashfs-sysupgrade.bin");
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/fieldset[2]/form/div[2]/div[2]/div/input[2]")).click();
    	Thread.sleep(30000);
    	driver.findElement(By.xpath(".//*[@id='page-content']/div/div/form[2]/input[3]")).click();  
    	Thread.sleep(300000);
    	driver.manage().timeouts().implicitlyWait(350000,TimeUnit.SECONDS);
    	driver.get(baseUrl);
    	//assertTrue(driver.findElement(By.xpath(".//*[@id='footer']/div/div")).getText().matches("^[\\s\\S]*MW1000X 0.3.0.*[\\s\\S]*$"));
    	
    	//network test
        driver.get("http://www.baidu.com");
        //assertTrue(driver.getTitle().matches("百度一下，你就知道"));
    	driver.close(); 
    	
    }
    
  }
    @AfterClass
    public void tearDown() throws Exception {
      driver.quit();      
    }
}