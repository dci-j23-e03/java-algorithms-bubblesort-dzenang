import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

  private static BubbleSort bubbleSort;

  @BeforeAll
  public static void once() {
    bubbleSort = new BubbleSort();
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
