package aj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class square2 {

	@Test
	void test() {
		testClass testClass = new testClass();
		int a = testClass.square(5);
		assertEquals(25, a);
	}

}
