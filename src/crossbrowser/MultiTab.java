package crossbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class MultiTab {

	public static void main(String[] args) {
		
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.snapchat.com/");
      driver.switchTo().newWindow(WindowType.TAB);
      driver.get("https://www.instagram.com/");
      driver.switchTo().newWindow(WindowType.WINDOW);
      driver.get("https://www.GITHUB.com/");
      driver.quit();
      

      
      
      
      WebDriver driver1 = new EdgeDriver();
      driver1.manage().window().maximize();
      String baseURL1 = "https://www.snapchat.com/";
      driver1.get(baseURL1);
      driver1.quit();
     
      
      
      
      
      
	}

}
