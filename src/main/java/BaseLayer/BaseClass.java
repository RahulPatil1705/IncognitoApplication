package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static FileInputStream f;
    public static Properties prop;
    public static WebDriver driver;

    // Method to read properties from config file
    public static void readProperty() {
        try {
            f = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//config.properties");
            prop = new Properties();
            prop.load(f);
        } catch (FileNotFoundException e) {
            System.out.println("Configuration file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error loading properties file: " + e.getMessage());
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file input stream: " + e.getMessage());
                }
            }
        }
    }

    // Method to initialize WebDriver and load the URL
    public static void initialization() {
        // Reading properties file
        readProperty();

        // Setup WebDriver (ChromeDriver in this case)
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        // Launching the URL
        String url = prop.getProperty("URL");
        if (url != null) {
            driver.get(url);
        } else {
            System.out.println("URL is not specified in the properties file.");
        }
        String userEmail=prop.getProperty("UserEmail");
        String passWord=prop.getProperty("Password");
        driver.findElement(By.xpath("//div[text()='Login']")).click();
    }
}
