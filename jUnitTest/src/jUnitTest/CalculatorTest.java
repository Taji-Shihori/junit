package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void maltiplication‚Å5‚Æ2‚ÌæZŒ‹‰Ê‚ªæ“¾‚Å‚«‚é() throws Exception {
        Calculator sut = new Calculator();
        int expected = 10;
        int actual = sut.maltiplication(5, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void division‚Å5‚Æ8‚ÌœZŒ‹‰Ê‚ªæ“¾‚Å‚«‚é() throws Exception {
    	Calculator sut = new Calculator();
        float expected = 0.625f;
        float actual = sut.division(5, 8);
        assertEquals(expected, actual, 0);
		
	}

}
