package tests.day14_testNgFramework_xmlFiles;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P02_TestNGAssertions {

    @Test
    public void test01(){

        // amazona gidin

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        // title'in best icermedigini test edin

        String unexpectedIcerik="best";
        String actualtitle=Driver.getDriver().getTitle();

        Assert.assertFalse(actualtitle.contains(unexpectedIcerik),"Title da istenmeyen icerik var");

        // url'in "https://www.amazon.com/" oldugunu test edin

        String expectedUrl="https://www.amazon.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl,"Url istenenden farklı");

        // Nutella aratın

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // arama sonuclarının Nutella icerdiğini test edin

        String expectedIcerik="Nutella";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik),"Arama sonucu Nutella icermiyor");


        Driver.closeDriver();
    }
}
