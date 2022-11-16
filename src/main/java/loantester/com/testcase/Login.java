package loantester.com.testcase;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jshell.Snippet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //1 - Maximize browser của mình
        driver.manage().window().maximize();

        //2 - Đi đến 1 url

        driver.navigate().to("https://rise.fairsketch.com/signin");
        Thread.sleep(2000);

        //3 - Lấy Title và in ra console

        System.out.println(driver.getTitle());

        // Tìm Element bằng thuộc tính
        driver.findElement(By.id("email")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("");
        Thread.sleep(1000);


        // Tìm element bằng Xpath tuyệt đối
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/button")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul/li[5]/a")).click();
        Thread.sleep(1000);
        driver.close();


        // Thoát hẳn Browser

        driver.quit();
    }
}
