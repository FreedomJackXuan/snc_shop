package snc.server.ide.handler;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class Dayuhao {
    public static void main(String[] args) throws InterruptedException {

        //设置 chrome 的无头模式
        //设置 chrome 的无头模式
        WebDriver driver=null;



        try {
            driver = new ChromeDriver();

            Actions action2 = new Actions(driver);
            driver.get("https://mp.dayu.com/dashboard/video/write");
//            driver.quit();
        }catch (Exception e){

        }finally{

            driver.quit();

        }
//        String cookie="cna=IT4DFJNeLUICAX0lHTvoZPau; USER_TMP=Ds6xAGCbg07Mtd09fXbi1g.2lMQQl2rQugikS__9SdoH06Re7pUSmQ8D58kkrscKiiOzpPkRd2UmqtjREtMzUrrOfPfsrXLt-5Nsua4Dy66tOS1mqUNpYCVy_eKpqeXbNeTB4VfiL3t5P-QsJXp_-VpYdCx7ZCpB7b8bdNVBwu8dUE3qAtIzC5KzPpZJXLy9zvmIEINoG7ORwuqHSJ6fugZXIF0IC24Xe1HR5_2BMvL32_LTh3GV1xyRvd0MJul-mhYegIJFgW3_oEacm8b64O9DhzsVkr-D0ZGfYQhWb61wOt6zobnTtROFwFqZXnfdPcwKiq3W8_fm9qJunUeSPqXNfAQAMxENEuzFGkujQMpsS0xIyOpYDPv_T3HchHX6dNUsUpqsm5295xAu-fcU8guqIU1sp2WbIwK4PRszpWSLqlRGz46q6qJabUhPUNGgPMsOXXzbI4ckpk0TpJlgdskGC2cT605hkTgJ9cV8K5cdPX7QZlrOv__tNPTZJ0q6C_id9zk3tiuxHRtEiMxvvh1soxgIM4vwTW4JitPppxh9zTxulGrI0AB7DtHTPCMTp8b_JD8GBANl15ewg-4d5Z_uO0wNBMAgbs-zL34JJnRJ41n3fmbVluo16QCCaS9T-e_QvEPsryV9N8IwvFluS3r4ojR0JGpGHQintRdvBLzdLvb8YoIm4bWMLmlkBNXQ9UkbQXgVIw7-pEcEYGJs_60dmqgfFMORBO2LAPATWSYxkpc4yUFtQ8vF5ZogpHbefmhBhTzC580pUZuNnO8-tpnpPczJitvzGNEhk8m-5f4rJuMSZCfxnvXsNm2pkdvztaav_2AMKFxsBbVpNSX_AhTgZ00jrVEiENEQiVC7dCxeywmOXmmK4jyMz0sPH8V-odVzVlXOm_GJ55p8lYZhLXVXti12bIbPurzECBsdWNjkEHZcjjv0TBFt5hmvlOcSN4-AzbqEMtirDuj-e3ZiJhMixfnVQDhzgT0yGuglhqBoRGhDbH1z4A3phHqpwlr8HhBYlp9KmPXDLgDQuESQGusMXYQJeb7PZxOOPRLjUO1zvRJP6WnVMJyjiB1rwWCmLENp1dzrnlfQvllR1Uvdv2Z.1562054252036.604800000.I0IrStxVfETEbVfzbcr7pDS3eXnlc9ztAd6hireGkac; isg=BL6-1ND0b3JKXbqSJH7XQy7ZD93AV4Bquz0YeGjHKoH8C17l0I_SieRphpdiCHqR";
//        String c[]=cookie.split(";");
//
//        for (int i = 0; i <c.length ; i++) {
//            String cc[]=c[i].trim().split("=");
//////            System.out.println();;
////            System.out.println(cc[0]);
////            System.out.println("=================================");
////            System.out.println(cc[1]);
//////            Cookie cn= new Cookie(cc[0], cc[1]);
//            driver.manage().addCookie(new Cookie(cc[0], cc[1]));
//
//        }
//
//        System.out.println("============================");
//        driver.get("https://mp.dayu.com/dashboard/video/write");
//        System.out.println("============================");
//        WebDriverWait wait = new WebDriverWait(driver, 120);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("webuploader-element-invisible")));
//        driver.findElement(By.className("webuploader-element-invisible")).sendKeys("/home/zjt/视频/尚学堂_肖斌_Hadoop视频100集/02.mp4");
//        //下一页
//        WebDriverWait wait2 = new WebDriverWait(driver, 120);
//        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"coverImg\"]/input")));
//        driver.findElement(By.xpath("//*[@id=\"coverImg\"]/input")).sendKeys("/home/zjt/02.png");
//
//        WebDriverWait wait3 = new WebDriverWait(driver, 120);
//        wait3.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div[2]/button"))));
//        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div[2]/button")).click();
//
////
//        WebDriverWait wait4 = new WebDriverWait(driver, 120);
//        wait4.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]/div[1]/input"))));
//        wait4.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[3]/div/textarea"))));
//        WebDriverWait wait5 = new WebDriverWait(driver, 120);
//
//        wait5.until(ExpectedConditions.presenceOfElementLocated((By.className("widgets-selects_container"))));
//
//        WebDriverWait wait6 = new WebDriverWait(driver, 120);
//
//        wait6.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[5]/div/div/div[2]/a[1]"))));
//        WebDriverWait wait7 = new WebDriverWait(driver, 120);
//
//        wait7.until(ExpectedConditions.elementToBeClickable((By.className("w-btn_primary"))));
//        WebDriverWait wait8 = new WebDriverWait(driver, 120);
//
//        wait8.until(ExpectedConditions.elementToBeClickable((By.className("widgets-selects_container"))));
//
////        WebDriverWait wait9 = new WebDriverWait(driver, 120);
////        wait9.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[4]/div/div/div[1]"))));
//
//        WebDriverWait wait10 = new WebDriverWait(driver, 120);
//
//        wait10.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[4]/div/div/div[1]"))));
//
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]/div[1]/input")).clear();
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]/div[1]/input")).sendKeys("就是这么刚就是这么刚就是这么刚");
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[3]/div/textarea")).clear();
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[3]/div/textarea")).sendKeys("lalalalalala");
////        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[4]/div/div")).sendKeys("sacsac");
////        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[4]/div/div")).sendKeys(Keys.ENTER);
//        JavascriptExecutor driver_js= (JavascriptExecutor) driver;
//        driver_js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//
//
//        WebElement ww=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[4]/div/div/div[1]"));
////        Thread.sleep(2000);
////通过action模拟键盘输入java关键字到 输入框，只有使用了perform方法才会输入进去
////        Thread.sleep(3000);
//        action2.moveToElement(ww);
//
////        action2.click();
////        Thread.sleep(2000);
////        action2.sendKeys(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[4]/div/div/div[1]")), "java");
//        action2.sendKeys(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[4]/div/div/div[1]")), "java").perform();
////        action2.sendKeys("java");
//
////        action2.build().perform();
////        Thread.sleep(3000);
////        driver.findElement(By.className("article-write_video-tags-label")).sendKeys("java");
//
////        action2.sendKeys(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[4]/div/div/div[1]")), Keys.ENTER).perform();
//        WebElement w= driver.findElement(By.className("widgets-selects_container"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(w);
//        actions.click();
//        actions.build().perform();
//        System.out.println("fffffffffffffffffffffffffffffffffffffffffffff");
//        WebDriverWait wait11 = new WebDriverWait(driver, 120);
//        wait11.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[5]/div/div/div[2]/a[1]"))));
//        WebElement fabiao=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[5]/div/div/div[2]/a[1]"));
//        actions.moveToElement(fabiao);
//        actions.click();
//        actions.build().perform();
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[2]/div/button[1]")).click();
//
//
////        Thread.sleep(2000);
//        WebDriverWait wait12 = new WebDriverWait(driver, 120);
//        wait12.until(ExpectedConditions.presenceOfElementLocated((By.xpath("/html/body/div[4]/div/div[2]/div/div[5]/div/button"))));
//
////        driver.findElement(By.className("w-btn_primary")).click();
////        Thread.sleep(3000);
//        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[5]/div/button")).click();
//        Thread.sleep(2000);
//        driver.quit();



    }
}
