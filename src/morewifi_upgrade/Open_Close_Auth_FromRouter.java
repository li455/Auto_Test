package morewifi_upgrade;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Open_Close_Auth_FromRouter {
	
	
	public static boolean isContentAppeared(WebDriver driver,String content) {  

	    boolean status = false;  
	    try {  
	        driver.findElement(By.xpath("//*[contains(.,'" + content + "')]"));  
	        System.out.println(content + " is appeard!");  
	        status = true;  
	    } catch (NoSuchElementException e) {  
	        status = false;  
	        System.out.println("'" + content + "' doesn't exist!");  
	    }  
	    return status;  
	}
	
	/*
	public static void verifyEquals(Object actual, Object expected){
		 boolean status = true;
        try{
            Assert.assertEquals(actual, expected);
        }catch(Error e){
            status = false;
        }
    }
    */
  class DataException extends Exception
  {
  	private static final long serialVersionUID = 1L;
  	String errorMessage;   
      public DataException(String errorMessage)
      {
           this.errorMessage = errorMessage;
      } 
  }
}

