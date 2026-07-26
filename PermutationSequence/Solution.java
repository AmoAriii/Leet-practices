package PermutationSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public String getPermutation(int n, int k) {
    int[] numbers = generateNumber(n);
    List<Integer> current = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    boolean[] used = new boolean[numbers.length];
    backtracker(numbers, used, current, result);

    List<Integer> value=result.get(k-1);
    StringBuilder numberToString=new StringBuilder();
    for(int num:value){
      numberToString.append(num);
    }
    
    return numberToString.toString();
  }

  public int[] generateNumber(int n) {
    int[] numbers=new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i]=i+1;
    }

    return numbers;

  }

  private void backtracker(int[] numbers, boolean[] used, List<Integer> current, List<List<Integer>> result) {

    if (current.size() == numbers.length) {
      result.add(new ArrayList<>(current));
      return;
    }
    
    for(int i=0;i<numbers.length;i++){
      if(used[i]){
        continue;
      }

      used[i]=true;
      current.add(numbers[i]);
      backtracker(numbers, used, current, result);
      current.remove(current.size()-1);
      used[i]=false;
    }

  }
}
