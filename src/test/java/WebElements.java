import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    public static void main(String[] args) {
        // ChromeDriver path'ini belirtin
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // WebDriver nesnesi oluşturun
        WebDriver driver = new ChromeDriver();

        // Web sayfasına gidin
        driver.get("https://example.com");

        // 1. Input elementini bul ve veri gönder
        WebElement inputField = driver.findElement(By.id("input-id"));
        inputField.sendKeys("Test data");

        // 2. Butonu bul ve tıkla
        WebElement submitButton = driver.findElement(By.id("submit-id"));
        submitButton.click();

        // 3. Başka bir elementi XPath ile bul
        WebElement anotherElement = driver.findElement(By.xpath("//div[@class='class-name']"));
        System.out.println(anotherElement.getText());

        // Tarayıcıyı kapat
        driver.quit();
    }
}
