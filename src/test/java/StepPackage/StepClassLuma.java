package StepPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import BasePackage.BaseClassLuma;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepClassLuma extends BaseClassLuma {

	@Given("User send Url")
	public void user_send_url() throws Throwable {
		
		getURL("https://magento.softwaretestingboard.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\seenu\\eclipse-workspace\\Demo\\Ss\\name1.png");
		FileUtils.copyFile(source, destination);	
	}

	@When("User sign in the account and Enter the Email and Password")
	public void user_sign_in_the_account_and_enter_the_email_and_password() throws InterruptedException {
		
		Thread.sleep(1000);
	   // driver.findElement(By.linkText(" Sign In ")).click();
		driver.findElement(By.xpath("(//a[@href=\"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/\"])[1]")).click();
		driver.findElement(By.xpath("//input[@name=\"login[username]\"]")).sendKeys("seenuvasang00@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"login[password]\"]")).sendKeys("Seenu@vasan55");
		
//		WebElement womenHover = driver.findElement(By.xpath("//span[text()='Women']"));
//		Actions action=new Actions(driver);
//		action.moveToElement(womenHover).perform();	
	}

	@When("User click the Sign in")
	public void user_click_the_sign_in() {
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).submit();
		
	}
	@When("User click the Women dress and click tops and jackets")
	public void user_click_the_women_dress_and_click_tops_and_jackets() {
		WebElement wommen=driver.findElement(By.xpath("//a[@id=\"ui-id-4\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(wommen).perform();
		WebElement wommentops=driver.findElement(By.xpath("//a[@id=\"ui-id-9\"]"));
		Actions action1=new Actions(driver);
		action1.moveToElement(wommentops).perform();
		driver.findElement(By.xpath("(//span[text()='Jackets'])[1]")).click();
	}

	@When("User click first jackets to add to wish list")
	public void user_click_first_jackets_to_add_to_wish_list() {
		WebElement wishlist=driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(wishlist).perform();
	   driver.findElement(By.xpath("(//a[@title=\"Add to Wish List\"])[2]")).click();
	}

	@When("User click add to cart to jackets")
	public void user_click_add_to_cart_to_jackets() {
		WebElement wishlist=driver.findElement(By.xpath("(//img[@alt=\"Juno Jacket\"])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(wishlist).perform();
		driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]")).click();
	}

	@When("User click size and color to add to cart jackets")
	public void user_click_size_and_color_to_add_to_cart_jackets() {
		driver.findElement(By.xpath("//div[@id=\"option-label-size-143-item-168\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"option-label-color-93-item-57\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"product-addtocart-button\"]")).click();  
	}

	@When("User click men dress and click buttoms and pants")
	public void user_click_men_dress_and_click_buttoms_and_pants() throws Exception {
		Thread.sleep(2000);
		WebElement men=driver.findElement(By.xpath("//a[@id=\"ui-id-5\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		WebElement menbuttoms=driver.findElement(By.xpath("(//span[text()='Bottoms'])[2]"));
		Actions action1=new Actions(driver);
		action1.moveToElement(menbuttoms).perform();
		driver.findElement(By.xpath("//a[@id=\"ui-id-24\"]")).click();	   
	}
	
	
	@When("User click shopping options style climate and material then add to cart")
	public void user_click_shopping_options_style_climate_and_material_then_add_to_cart() throws Exception {
		driver.findElement(By.xpath("(//div[@class=\"filter-options-title\"])[1]")).click();
		driver.findElement(By.xpath("(//li[@class=\"item\"])[4]")).click();
		driver.findElement(By.xpath("(//div[@class=\"filter-options-title\"])[2]")).click();
		driver.findElement(By.xpath("(//li[@class=\"item\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"filter-options-title\"])[5]")).click();
		driver.findElement(By.xpath("(//li[@class=\"item\"])[10]")).click();
		WebElement menshorts=driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"])[3]"));
		Actions action1=new Actions(driver);
		action1.moveToElement(menshorts).perform();
		driver.findElement(By.xpath("(//button[@title=\"Add to Cart\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"option-label-size-143-item-177\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"option-label-color-93-item-53\"]")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	@When("User click size and color then add to cart")
	public void user_click_size_and_color_then_add_to_cart()throws Exception {
		Thread.sleep(3000);
		WebElement menshorts=driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"])[5]"));
		Actions action1=new Actions(driver);
		action1.moveToElement(menshorts).perform();
		driver.findElement(By.xpath("(//button[@title=\"Add to Cart\"])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"option-label-size-143-item-177\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"option-label-color-93-item-52\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"product-addtocart-button\"]")).click();
		Thread.sleep(3000);
	}
	
	@When("User click shopping cart and edit jackets quantity then checkout")
	public void user_click_shopping_cart_and_edit_jackets_quantity_then_checkout()throws Exception {
	   driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("(//a[@title=\"Remove item\"])[6]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("(//button[@name=\"update_cart_action\"])[2]")).click();
	   Thread.sleep(3000);
	   JavascriptExecutor js= (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,400)");
	   Thread.sleep(3000);
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   File destination= new File("C:\\Users\\seenu\\eclipse-workspace\\Demo\\Ss\\name3.png");
	   FileUtils.copyFile(source, destination);
	   driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
	   
	}
	@When("User click shipping medhods and click next and place order")
	public void user_click_shipping_medhods_and_click_next_and_place_order()throws Exception {
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
	    driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@title=\"Place Order\"]")).click();
	    Thread.sleep(3000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\seenu\\eclipse-workspace\\Demo\\Ss\\name2.png");
		FileUtils.copyFile(source, destination);
	    driver.findElement(By.xpath("//a[@class=\"action print\"]")).click();    
	}

	@When("User click print option")
	public void user_click_print_option() throws InterruptedException, AWTException {
	   
		Set<String> windows = driver.getWindowHandles();
		List<String> windowsHandles = new ArrayList(windows);
		
		driver.switchTo().window(windowsHandles.get(1));
		Thread.sleep(2000);
		
		   Robot robot = new Robot();
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);
           Thread.sleep(2000);
           robot.keyPress(KeyEvent.VK_A);
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);
           driver.close();
           
           driver.switchTo().window(windowsHandles.get(0));
           Thread.sleep(2000);
           driver.quit();
           
//           Robot robot = new Robot();
//           robot.keyPress(KeyEvent.VK_TAB);
//           robot.keyPress(KeyEvent.VK_ENTER);
//           robot.keyRelease(KeyEvent.VK_ENTER);
//           Thread.sleep(2000);
//           robot.keyPress(KeyEvent.VK_TAB);
//           robot.keyPress(KeyEvent.VK_ENTER);
           		
//		driver.close();
//		driver.switchTo().window(windowsHandles.get(0));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@class=\"action primary continue\"]")).click();	
	}
}
