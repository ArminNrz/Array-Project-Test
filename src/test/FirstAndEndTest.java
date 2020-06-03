package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import questionRoadMap.FirstAndEnd;

class FirstAndEndTest {

	@ParameterizedTest
	@CsvSource(value = {"0, 1", "1, 100", "5, 98"})
	void test(int placeHolder, int value) {
		FirstAndEnd obj = new FirstAndEnd();
		int[] list = obj.method();
		assertEquals(value, list[placeHolder]);
	}

}
