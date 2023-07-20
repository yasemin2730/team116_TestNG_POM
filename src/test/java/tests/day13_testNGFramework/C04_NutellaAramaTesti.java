package tests.day13_testNGFramework;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NutellaAramaTesti {

    @Test
    public void test01(){

        //amazon anasayfaya gidin

      Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // Nutella için arama yapin

        AmazonPage amazonPage=new AmazonPage();

        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonArananKelime")+ Keys.ENTER);

        // Sonucların Nutella icerdiğini test edin

        String expectedIcerik= ConfigReader.getProperty("amazonArananKelime");
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        //sayfayi kapatin
        Driver.closeDriver();
    }
}
