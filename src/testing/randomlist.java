package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import randomVariate.PRandom;

class randomlist {

	@Test
	void testRandomIntObject() {
		PRandom randomList = new PRandom(7);
		List<Integer> intPrandomList = randomList.generate(10);
		List<Integer> expectedIntPrandomList = Arrays.asList(11 , 5 , 7 , 5 , 5 , 4 , 8 , 6 , 6 , 6);
		for (int i = 0; i < intPrandomList.size(); i++) {
			assertEquals(expectedIntPrandomList.get(i), intPrandomList.get(i));
		}

	}
	

}
