package loantester.com.ThucHanh_CRM;

import loantester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class ClientCRM extends BaseTest {

    public static void loginCRM(){
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        sleep(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
    }
    public static void oppenClientPage (){
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();


    }
    public static void enterDataaddClient(String loan){
        driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Mr.Misha");
        driver.findElement(By.xpath("//div[@id='s2id_created_by']")).click();
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Richard Gray", Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Cầu giấy");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hà Nội");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Nu");

        //cuộn chuột đến element VAT_number vì nó bị che
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));

        driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("092323");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("cầu giấy-hà nội");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("092093232");
        driver.findElement(By.xpath("//input[@id='website']")).sendKeys("https://www.google.com");
        driver.findElement(By.xpath("//input[@id='vat_number']")).sendKeys("093");
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']")).click();
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("VIP",Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='s2id_currency']")).click();
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("AMD",Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

    }
    public static void CheckClientAfterAdded(String clientName){
        driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientName);
        String clientNameIntable = driver.findElement(By.xpath("//table[@id='client-table']//tbody//tr[1]//td[2]")).getText();
        System.out.println(clientNameIntable);
    }


    public static void main(String[] args) {
        creatDriver();
        loginCRM();
        oppenClientPage();
        enterDataaddClient("HCM");
        CheckClientAfterAdded("HCM");




        closeDriver();

    }
}
