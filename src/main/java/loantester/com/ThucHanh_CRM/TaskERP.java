package loantester.com.ThucHanh_CRM;

import loantester.com.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TaskERP extends BaseTest {

    //login ERP
    public static void loginERP() {
        driver.get("https://app.hrsale.com/erp/login");
        //    driver.findElement(By.xpath("//input[@id='iusername']")).clear();
        //    driver.findElement(By.xpath("//input[@id='ipassword']")).clear();
        //    sleep(1);
        driver.findElement(By.xpath("//input[@id='iusername']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//input[@id='ipassword']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
    }

    public static void oppenTaskPage() {
        driver.findElement(By.xpath("//span[normalize-space()='Tasks']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Add Task']")).click();

    }

    public static void enterDataAddTask() {
        driver.findElement(By.xpath("//input[@name='task_name']")).sendKeys("KhoiMy");
        driver.findElement(By.xpath("//div[@class='input-group']//input[@name='start_date']")).click();
        driver.findElement(By.xpath("//a[contains(normalize-space(),'17')]")).click();
        driver.findElement(By.xpath("(//button[@class='dtp-btn-ok btn btn-flat btn-primary btn-sm'])[1]")).click();
        driver.findElement(By.xpath("//input[@name='end_date']")).click();
        driver.findElement(By.xpath("(//a[contains(normalize-space(),'25')])[2]")).click();
        driver.findElement(By.xpath("(//button[@class='dtp-btn-ok btn btn-flat btn-primary btn-sm'])[2]")).click();
        driver.findElement(By.xpath("//input[@name='task_hour']")).sendKeys("21");
        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
        driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']/input")).sendKeys("Advertising Platform AD.", Keys.ENTER);
        driver.findElement(By.xpath("//textarea[@id='summary']")).sendKeys("Theo quyết định số 3730, Bộ Giáo dục và Đào tạo (GD-ĐT) phê duyệt liên kết tổ chức thi cấp chứng chỉ tiếng Anhgiữa Công ty TNHH Giáo dục IDP (Việt Nam) và IELTS Australia Pty Ltd (Úc).");

        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();



        //    driver.findElement(By.xpath(""));


    }

    public static void main(String[] args) {
        creatDriver();
        loginERP();
        oppenTaskPage();
        enterDataAddTask();


        closeDriver();
    }
}
