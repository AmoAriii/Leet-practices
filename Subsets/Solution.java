package Subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  
  private List<List<Integer>> result =new ArrayList<>();
  private int[] nums;

  public List<List<Integer>> subsets(int[] nums){
    this.nums=nums;

    List<Integer> current=new ArrayList<>();

    backtrack(0,current);

    return result;
  }

  private void backtrack(int index,List<Integer> current){

    if(index==nums.length){
      result.add(new ArrayList<>(current));
      return;
    }

    //Most Important lines for backtracking!!!
    current.add(nums[index]);
    backtrack(index+1, current);
    current.remove(current.size()-1);
    backtrack(index+1, current);
  }
}
