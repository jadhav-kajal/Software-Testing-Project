package JustDial_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Final_Proj
{

	public static void main(String[] args) 
	{
		  WebDriverManager.chromedriver().browserPath("‪ 95.0.4638.54").setup();
		  WebDriverManager.chromedriver().setup();
		  WebDriver w= new ChromeDriver();
 
		  w.get("https://www.justdial.com/");
  

          w.manage().window().maximize();
  
        
 //click on jdmart

 w.findElement(By.xpath("//*[@id=\"ContextualHotkey_4\"]")).click();

        
          
 //click on categories

 w.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/ul/li[1]/a/span[1]")).click();
 

 //click on Health & Medical
 
 w.navigate().to("https://www.jdmart.com/Mumbai/Health-Medical/tid-2"); 

 w.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/ul/li[2]/a")).click();


 
 //click on Electrical Tool & Supplies

 w.navigate().to("https://www.jdmart.com/Mumbai/Electrical-Tools-Supplies/tid-3");
 
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/ul/li[3]/a")).click();


 //click on Industrial Machinery

 w.navigate().to("https://www.jdmart.com/Mumbai/Industrial-Machinery/tid-4");

 w.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/ul/li[4]/a")).click();


 
 //Click on Apparel & Fashion
 
 w.navigate().to("https://www.jdmart.com/Mumbai/Apparel-Fashion/tid-5");
 
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/ul/li[5]/a")).click();



 //Click on Automobile & Accessories
 
 w.navigate().to("https://www.jdmart.com/Mumbai/Automobile-Accessories/tid-6");
 
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/ul/li[6]/a")).click();

 w.navigate().to("https://www.justdial.com/");

 w.findElement(By.id("hotkeys_text_0")).click();                            //click on covid-19 Helpline

 w.findElement(By.xpath("/html/body/div[1]/ul/li[1]/a")).click();           //click on live status
      
 w.findElement(By.xpath("/html/body/div[1]/ul/li[2]/a")).click();           //click on Covid Resources
  
 w.findElement(By.xpath("/html/body/div[1]/ul/li[3]/a")).click();           //click on vaccination centers
   
 w.findElement(By.xpath("//*[@id=\"vaccineCent\"]/ul/li[2]/a")).click();    //click on symptons
   
 w.findElement(By.xpath("//*[@id=\"vaccineCent\"]/ul/li[2]/a")).click();    //click on Do's and Don't
   
 w.findElement(By.xpath("/html/body/div[1]/ul/li[5]/a")).click();           //click on symptons
   
 w.findElement(By.xpath("/html/body/div[1]/ul/li[6]/a")).click();           //click on do and don't        
   
 w.navigate().back();

   
 
 //click on Air Ticket module
   
  w.findElement(By.id("hotkeys_text_2")).click();  
   
   
  
 //For Leaving From
   
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[2]/div[1]/div[2]/input")).click();

 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Pune, IN - Lohegaon (PNQ)");
   
 
 
 //For Going To
   
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[2]/div[2]/div[2]/input")).click();
   
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[2]/div[2]/div[2]/input")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
   
  
 
 //For Adult 12+
   
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[3]/div[2]/div[1]/div[2]/input")).click();
   
  
 //For Children
 
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[3]/div[2]/div[2]/div[2]/span[1]")).click();
   
 
 
 //Class of Travel
 
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[5]/a")).click();
   
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[5]/div/div/div[2]/div/input")).click();
   
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[5]/div/div/div[2]/ul/li[2]")).click();
   
   
 //For Submit Button
   
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[6]/input")).click();
 
 
 //An unexpected error has occured
   
 w.navigate().back();
   
 w.findElement(By.xpath("//*[@id=\"hotkeys_text_2\"]")).click();
   
   
   
 //click on Hotel
  
 w.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/ul/li[2]/a")).click();
   
 
 
 //For Destination
   
  w.findElement(By.xpath("//*[@id=\"destinationName\"]")).click();
   
  w.findElement(By.xpath("//*[@id=\"destinationName\"]")).sendKeys("OYO Flagship 19162 Narayan Nagar Pune, ");
   
  
  //For Check In
   
  w.findElement(By.xpath("//*[@id=\"checkInDt\"]")).click();
   
 
  
  //For Check Out
  
  w.findElement(By.xpath("//*[@id=\"checkOutDt\"]")).click();
   
  
  
  //No of Nights
 
  w.findElement(By.xpath("//*[@id=\"_dNightCountSelector_HtlVal\"]")).click();
   
  
  //No of Rooms
  
  w.findElement(By.xpath("//*[@id=\"_dRoomCountSelector_HtlVal\"]")).click();
   
  
   
  //For Search Button
 
  w.findElement(By.xpath("//*[@id=\"hsearch\"]")).click();                     //search button is not clickble DEFECT
 
  
  
  //CLICK ON BUS 
  //  w.navigate().to("https://www.justdial.com/Travel/Bus-Booking");
   
  //click on train
  w.navigate().to("https://www.justdial.com/travel/Train-Booking "); 
  w.findElement(By.linkText("Train")).click();
 
  //For By station
  // w.navigate().to("https://www.justdial.com/travel/Train-Booking");
  
  w.findElement(By.linkText("By Station")).click();
  
  //click on From 
 //   w.findElement(By.xpath("//*[@id=\"frm_stn\"]")).click();
 // w.findElement(By.xpath("//*[@id=\"frm_stn\"]")).sendKeys("Mumbai Chhatrapati Shivaji Terminus (CSMT))" );
   //FOR TO
//   w.findElement(By.xpath("/html/body/section[1]/div[1]/div/div[2]/div[2]/div[1]/div/div[3]/div/input")).click();
  //w.findElement(By.xpath("//*[@id=\"to_stn\"]")).sendKeys("Pudukad (PUK)");
   //FOR DEPARTURE
 // w.findElement(By.xpath("//*[@id=\"departDate\"]")).click();
  
 //w.findElement(By.xpath("//*[@id=\"departDate\"]")).click();
  
  //FOR SEARCH
//  w.findElement(By.xpath("//*[@id=\"Bystation\"]/div/div[5]/button[1]")).click();

  
  //click on Visa Assistance
  w.navigate().to("https://www.justdial.com/Mumbai/Visa%20Assistance");
 // w.findElement(By.xpath("/html/body/div/div/main/div[1]/ul/li[6]/a")).click();
    
//click on foreign exchange
 // w.navigate().to("https://www.justdial.com/Travel/Foreign-Exchange");
//  w.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/ul/li[7]/a")).click();
   
  //click on International SIM Card
  
  // w.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/ul/li[8]/a")).click();
   
   w.navigate().to("https://www.justdial.com/");
   
   //click on Loan Button
   
//   w.findElement(By.xpath("//*[@id=\"hotkeys_text_4\"]")).click();
   
  // w.navigate().back();
   
  
  
   
   //CLICK ON AUTOMOBILE
   w.findElement(By.id("hotkeys_text_6")).click();
   
   w.navigate().back();
   
  
   //CLICK ON BABY CARE
   w.findElement(By.xpath("//*[@id=\"hotkeys_text_7\"]")).click();
   
   w.navigate().back();
  // w.findElement(By.xpath("//*[@id=\"hotkeys_text_5\"]")).click();
   
   //CLICK ON BANQUETS
 //  w.findElement(By.xpath("//*[@id=\"ContextualHotkey_11\"]")).click();
   
   w.navigate().back();
   
   //CLICK ON BOOKES
   w.findElement(By.id("hotkeys_text_11")).click();
   
   w.navigate().back();
   
   //ClICK ON BUS
   
   w.findElement(By.xpath("//*[@id=\"hotkeys_text_12\"]")).click();
   
   w.navigate().back();
    
 

	}



  
   
   
  
 


	}


