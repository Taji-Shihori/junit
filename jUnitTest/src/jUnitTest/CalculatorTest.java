package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void maltiplication��5��2�̏�Z���ʂ��擾�ł���() throws Exception {
        Calculator sut = new Calculator();
        int expected = 10;
        int actual = sut.maltiplication(5, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void division��5��8�̏��Z���ʂ��擾�ł���() throws Exception {
    	Calculator sut = new Calculator();
        float expected = 0.625f;
        float actual = sut.division(5, 8);
        assertEquals(expected, actual, 0);
		
	}

}
