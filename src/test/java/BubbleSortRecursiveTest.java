import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortRecursiveTest {

  private static BubbleSortRecursive2 bubbleSort;

  @BeforeAll
  public static void once() {
    bubbleSort = new BubbleSortRecursive2();
  }

  @Test
  public void positiveTest() {
    int[] array = {2, 1, 4, 6, 3, 5};
    int[] sortedArray = {1, 2, 3, 4, 5, 6};
    bubbleSort.sort(array);

    assertArrayEquals(
        array,
        sortedArray,
        "Expected: "
            + Arrays.toString(sortedArray)
            + ", "
            + "found "
            + Arrays.toString(array)
            + ".");
  }
}
