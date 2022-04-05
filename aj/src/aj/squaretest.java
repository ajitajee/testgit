package aj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squaretest {

	@Test
	void test() {
		testClass t = new testClass();
		int a = t.square(5);
		assertEquals(26, a);
		
	}

}
