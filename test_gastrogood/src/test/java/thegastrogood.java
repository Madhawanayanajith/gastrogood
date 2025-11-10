import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class thegastrogood {
      WebDriver driver;
       @BeforeMethod
       public void opengoogle(){
              driver = new ChromeDriver();
              driver.get("https://gastrogoods.netlify.app/");
       }

       @Test
       public void automate(){
             //check the categories
             driver.findElement(By.xpath("//div[contains(text(),'Vegetables')]")).click();
             driver.findElement(By.xpath("//div[contains(text(),'Dairy')]")).click();
             driver.findElement(By.xpath("//div[contains(text(),'Meat')]")).click();
             driver.findElement(By.xpath("//div[contains(text(),'Fish & Seafood')]")).click();
             driver.findElement(By.xpath("//div[contains(text(),'Snacks')]")).click();
             driver.findElement(By.xpath("//div[contains(text(),'Beverages')]")).click();
             driver.findElement(By.xpath("//div[contains(text(),'All')]")).click();

             //refresh
             driver.navigate().refresh();

             //search
             driver.findElement(By.name("searchTerm")).sendKeys("Snake Gourd");

             //search button
             driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();


             //view product
             driver.findElement(By.xpath("//button[normalize-space()='View Product']")).click();

             //add to cart
             driver.findElement(By.xpath("//div[contains(text(),'Snacks')]")).click();

             //refresh
             driver.navigate().refresh();

             //admin
             driver.findElement(By.xpath("//img[@alt='Avatar']")).click();

             //click login
             driver.findElement(By.xpath("//div[normalize-space()='Log In']")).click();

             //enter email
             //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin@gmail.com");


             //close
             driver.close();
       }


}






