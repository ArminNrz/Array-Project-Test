package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import questionRoadMap.SevenThree;

class SevenThreeTest {
	
	@ParameterizedTest
	@CsvSource(value = {"0,7","1,3","2,7"})
	void resultTest(int arayPlaceHolder, int expect) {
		SevenThree objTest = new SevenThree();
		int[] list = objTest.method();
		assertEquals(expect, list[arayPlaceHolder]);
	}
	
	@Test
	void lenghtTest() {
		SevenThree test = new SevenThree();
		assertEquals(100, test.method().length);
	}

}
