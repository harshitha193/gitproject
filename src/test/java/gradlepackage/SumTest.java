package gradlepackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {
     private final Sum obj = new Sum();
	@Test
	void testSum() {
		assertEquals(5, obj.sum(2, 3));
	}
@Test
void testSumNegative() {
	assertNotEquals(7, obj.sum(2, 3));
}
}