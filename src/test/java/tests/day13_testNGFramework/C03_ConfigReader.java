package tests.day13_testNGFramework;

import org.testng.annotations.Test;
import utilities.ConfigReader;

public class C03_ConfigReader {

    @Test
    public void test01(){
        System.out.println(ConfigReader.getProperty("amazonUrl"));

        System.out.println(ConfigReader.getProperty("wiseurl"));

        // key yanliş yazılırsa Configreader'daki properties objesi
        // yanliş  yazilan key'i bulamaz ve null döner

        System.out.println(ConfigReader.getProperty("kullaniciAdiAhmet")); // rahmet


        System.out.println(ConfigReader.getProperty("password"));
    }





}
