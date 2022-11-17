package loantester.com.ThucHanh_CRM;

import loantester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EmployeERP extends BaseTest {

    public static void loginERP(){
        driver.get("https://app.hrsale.com/erp/login");
        driver.findElement(By.xpath("//input[@id='iusername']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//input[@id='ipassword']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    public static void oppenEmployeePage(){
        driver.findElement(By.xpath("//span[normalize-space()='Employees']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Add New']")).click();
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("lƯƠNG ");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("BÍCH HỮU");
        driver.findElement(By.xpath("//input[@name='employee_id']")).clear();
        driver.findElement(By.xpath("//input[@name='employee_id']")).sendKeys("012345678");
        driver.findElement(By.xpath("//input[@name='contact_number']")).sendKeys("888888");
        driver.findElement(By.xpath("//label[normalize-space()='Gender']/following-sibling::span[normalize-space()='Male']")).click();
        driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']/input")).sendKeys("Female", Keys.ENTER);
        driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("minh1234@gmail.com");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("888888");
        driver.findElement(By.xpath("//label[@class='control-label']/following-sibling::span[normalize-space()='Office Shift']")).click();
        driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input")).sendKeys("Morning Shift",Keys.ENTER);
    //    driver.findElement(By.xpath("//span[@class='select2-selection__rendered']//span[normalize-space()='Role']")).click();
        driver.findElement(By.xpath("//label[@for='role']/following-sibling::span[normalize-space()='Role']")).click();
        driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input")).sendKeys("HR Manager",Keys.ENTER);
        driver.findElement(By.xpath("//label[@for='department']/following-sibling::span[normalize-space()='Department']")).click();
        driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input")).sendKeys("Training",Keys.ENTER);
        driver.findElement(By.xpath("//label[@class='form-label']/following-sibling::span[normalize-space()='Designation']")).click();

        driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input")).sendKeys("Designation",Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='basic_salary']")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@name='hourly_rate']")).sendKeys("30000");
        driver.findElement(By.xpath("//label[@for='salay_type']/following-sibling::span[normalize-space()='Per Month']")).click();
        driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input")).sendKeys("Per Month",Keys.ENTER);









    }

    public static void main(String[] args) {
        creatDriver();
        loginERP();
        oppenEmployeePage();

        closeDriver();
    }
}
