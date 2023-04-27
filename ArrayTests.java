import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	// @Test 
	// public void testReverseInPlace() {
  //   int[] input1 = { 3 };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ 3 }, input1);
	// }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void test1Reversed() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

    // @Test
  // public void test1RIP() {
  //   int[] input1 = {1, 2, 3, 4};
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
  // }

  // @Test
  // public void negativesAverageWithoutLowest() {
  //   double[] nums = {-2, -5, -3, 2, 9, 2};
  //   assertEquals((Double)1.6, (Double)ArrayExamples.averageWithoutLowest(nums));
  // }
}
