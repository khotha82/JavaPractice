import junit.framework.TestCase;

import org.junit.Test;

import com.example.unittest.LargestNumber;

/**
 * Created by krishna_hotha on 4/15/15.
 */
public class LargestNumberTest extends TestCase {

	public LargestNumberTest(String name) {
		super(name);
	}

	@Test
	public void testLargestNumber() throws Exception {

		assertEquals(10, LargestNumber.getLargestNumber(new int[] { 10, 9, 7 }));

	}

	@Test
	public void testLargestNumberWithNegative() throws Exception {

		System.out.println("in largets array");
		assertEquals(-8, LargestNumber.getLargestNumber(new int[] { -10, -8, -11 }));

	}

	@Test
	public void testEmptyArray() {

		System.out.println("in empty array");
		try {
			LargestNumber.getLargestNumber(new int[] {});
			fail("should throw exception");
		} catch (Exception e) {
			assert (true);
		}
	}

	public void testNullArray() {

		System.out.println("in null array");
		try {
			LargestNumber.getLargestNumber(null);
			fail("should throw exception");
		} catch (Exception e) {
			assert (true);
		}
	}

}
