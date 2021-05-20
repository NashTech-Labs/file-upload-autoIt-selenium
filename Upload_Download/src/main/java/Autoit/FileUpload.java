package Autoit;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {


    public static void main(String[] args) throws InterruptedException, IOException {
        //Instantiation of driver object. To launch chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PrajjawalK\\Downloads\\Upload_Download\\Upload_Download\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ilovepdf.com/pdf_to_word");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[id='pickfiles']")).click();
        Thread.sleep(3000);
        //To call the AutoIt script
        Runtime.getRuntime().exec("C:\\Users\\PrajjawalK\\Music\\check\\Fileupload.exe");
        driver.close();
    }

}