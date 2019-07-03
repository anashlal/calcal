package anasgeme.geme;

import org.junit.Assert;
import org.junit.Test;




public class TestCalcaltor {


	@Test
	public void Test_Add_true() {
		 double firstnumber = 9.0;
		 double secondnumber = 1.0;
		double expected = 10.0;
		double actual = calcalator.Add(firstnumber, secondnumber);
		Assert.assertEquals(expected, actual, 0);
	}
	
	@Test
	public void Test_mult_true() {
		 double firstnumber = 9.0;
		 double secondnumber = 1.0;
		double expected = 9.0;
		double actual = calcalator.mult(firstnumber, secondnumber);
		Assert.assertEquals(expected, actual, 0);
	}
	@Test
	public void Test_dived_true() {
		 double firstnumber = 9.0;
		 double secondnumber = 1.0;
		double expected = 9.0;
		double actual = calcalator.dived(firstnumber, secondnumber);
		Assert.assertEquals(expected, actual, 0);
	}
	@Test
	public void Test_minus_true() {
		 double firstnumber = 9.0;
		 double secondnumber = 1.0;
		double expected = 8.0;
		double actual = calcalator.minus(firstnumber, secondnumber);
		Assert.assertEquals(expected, actual, 0);
	}
}
