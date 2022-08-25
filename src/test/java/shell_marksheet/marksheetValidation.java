package shell_marksheet;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Shell.calculator.logic.CalcSample;

public class marksheetValidation {

	marksheet result;
	
	//This gets executed before each method/testcase
	
	@Before
	public void thisISBeforeAnnotation() {
		result= new marksheet();
	}
	
	@Test
	public void FirstClass() {
		String expectedResult = "1st class";
		String actualResult= result.check_mark(90);
		Assert.assertEquals(expectedResult, actualResult);
//		if(actualResult==1)
//			System.out.println("First Class");
//		else if(actualResult==2)
//			System.out.println("Second Class");
//		else if(actualResult==3)
//			System.out.println("Third Class");
//		else 
//			System.out.println("Fail");
	}
	
	@Test
	public void SecondClass() {
		String expectedResult = "2nd class";
		String actualResult= result.check_mark(75);
		Assert.assertEquals(expectedResult, actualResult);
	
	}
	
	@Test
	public void ThirdClass() {
		String expectedResult = "3rd class";
		String actualResult= result.check_mark(45);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Fail() {
		String expectedResult = "fail";
		String actualResult= result.check_mark(20);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@After
	public void tearDown() {
		System.out.println("Testcase is completed");
	}


}
