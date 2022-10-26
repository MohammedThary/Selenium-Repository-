import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pita.Calculation;

public class CalculationTest {
    @DataProvider(name = "factorial_data_provider")
    public Object[][] dpMethod(){
        return new Object[][] {{5,120}, {4,24},{3,2},{0,1}};
    }


    @Test (dataProvider = "factorial_data_provider")
    public void testfactorial(int input,int expected){
    Calculation calculation = new Calculation();
        Assert.assertEquals(calculation.factorial(input),expected);
    }

//
//    @Test
//    public void testfactorial4(){
//        Calculation calculation = new Calculation();
//        Assert.assertEquals(calculation.factorial(4),24);
//    }
//
//    @Test
//    public void testfactorial3(){
//       Calculation calculation = new Calculation();
//        Assert.assertEquals(calculation.factorial(3),120);
//    }
}
