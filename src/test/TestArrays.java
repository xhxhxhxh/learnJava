package test;

import java.util.Arrays;

public class TestArrays {
  public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,7,8,9,1};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.binarySearch(arr, 0));
  }
}
