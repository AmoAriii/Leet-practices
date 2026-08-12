package FindRightInterval;

public class Solution {
  public int[] findRightInterval(int[][] intervals) {
    int[] res = new int[intervals.length];
    for (int i = 00; i < intervals.length; i++) {
      int end = intervals[i][1];
      int SmallestNumber = Integer.MAX_VALUE;
      int foundedNumber = -1;

      for (int j = 0; j < intervals.length; j++) {
        int start = intervals[j][0];
        if (start >= end && start < SmallestNumber) {
          SmallestNumber = start;
          foundedNumber = j;
        }
      }
      res[i] = foundedNumber;

    }
    return res;
  }

}
