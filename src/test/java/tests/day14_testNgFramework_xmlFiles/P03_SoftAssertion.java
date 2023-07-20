package tests.day14_testNgFramework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P03_SoftAssertion {

    @Test
    public void nutellaTesti(){

        // amazona gidin

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // 1.Soft Assert kullanmak için obje olusturmaliyiz.
        SoftAssert softAssert=new SoftAssert();
        //2. istediğiniz tüm testleri SoftAssert kullanarak yapin

        // title'in best icermediğini test edin

        String unexpectedIcerik="best";
        String actualTitle=Driver.getDriver().getTitle();

        softAssert.assertFalse(actualTitle.contains(unexpectedIcerik));


        // url'nin "https://www.amazon.com/" olduğunu test edin

        String expectedUrl="https://www.amazon.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl);



        // Nutella aratin

        AmazonPage amazonPage=new AmazonPage();

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);



        // arama sonuclarının Nutella icerdiğini test edin

        String expectedUrunIcerik="Nutella";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();

        softAssert.assertTrue(actualSonucYazisi.contains(expectedUrunIcerik));

        //3.tum testlerimiz bittiğinde softAssert objesinin hataları not aldığı raporlamasini isteyin

        softAssert.assertAll();

        Driver.closeDriver();




    }
}
