package tests.day12_testNG;

import org.testng.annotations.Test;

public class C02_Priority {

    /*
    JUnit'de hangi testin once calişacağini ONGOREMEYİZ VE KONTROL EDEMEYİZ
    TestNG testleri natural order'a göre calıştırır

    Eger sıralamayı degiştirmek isterseniz
    test methodlarına priority atayabilirsiniz

    priority default olarak 0 degerini alir
    ve var olan priority degerlerine gore kucukten buyuğe göre caliştirir.
    eger priority degeri ayni olan methodlar varsa
    natural order a bakar

     */

    @Test(priority = 3)
    public void amazonTest(){
        System.out.println("Amazon");
    }

    @Test(priority = 2)
    public void youtubeTest(){
        System.out.println("Youtube");
    }

    @Test(priority = 1)
    public void wiseTest(){
        System.out.println("Wise");
    }
}
