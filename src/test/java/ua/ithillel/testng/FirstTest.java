package ua.ithillel.testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void Test_1(){
        System.out.println("Test_1()");
        Assert.assertTrue(true);

    }

    @Test
    public void Test_2(){
        System.out.println("Test_2()");
        Assert.assertTrue(true);
    }
}
