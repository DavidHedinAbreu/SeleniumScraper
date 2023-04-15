import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scraper {
    public Scraper() {
        WebDriver driver = new ChromeDriver();
    }
    public static void main(String[] args) {
        new Scraper();
    }
}