package tests.day12_testNG;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_TestNGIlkTest {

    @Test
    public void test01(){


        Driver.getDriver().get("https://www.amazon.com");

        ReusableMethods.bekle(5);

        Driver.closeDriver();

    }


}



