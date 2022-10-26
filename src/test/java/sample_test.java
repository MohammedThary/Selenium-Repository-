import org.testng.Assert;
import org.testng.annotations.Test;
import pita.Calculation;

public class sample_test {

    @Test
    public void test1(){
        System.out.println("test first time");
        Assert.assertTrue(5==5);
    }
    @Test
    public void test2(){
        System.out.println("test second time");
        Assert.assertFalse(5==5);
    }

    @Test
    public void test3(){
        System.out.println("test third time");
        Assert.assertNull(0);
    }

    @Test
    public void test4(){
        System.out.println("test fourth time");
        Assert.assertEquals(8,9);
    }
    @Test
    public void test5(){
        System.out.println("test fifth time");
        Assert.assertNotEquals(8,9);    }

@Test
    public void test6(){
        System.out.println("test Sixth time");
        Assert.assertNotEquals(8,9);    }
    @Test
    public void testfactorial(){
        System.out.println("test factorial");

        Calculation calculation = new Calculation();
        Assert.assertEquals(calculation.factorial(5),120);
    }
}
