# Bubblesort in Java

Implement the bubblesort presented in pseudocode below in Java in the `BubbleSort` class. Then run
the `BubbleSortTest` class to test your implementation. The test should be passing.

```
BEGIN BubbleSort(list)
  swaps = false
  FOR i FROM zero TO (LENGTH OF list MINUS 2)
    IF list[i] > list[i+1]
      SWAP(list[i], list[i+1])
      swaps = true
    ENDIF
  ENDFOR
  IF swaps == true
    BubbleSort(list)
  ENDIF
  RETURN list
END BubbleSort
```