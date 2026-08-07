package BinarySearch;

public class Solution {

  public int BinarySearch(int[] nums,int target){
    //Array must be sorted!
    int left=0;
    int right=nums.length-1;

    while(left<=right){
      int mid=left+(right-left)/2;

      if(nums[mid]==target){
        return mid;
      }

      if(nums[mid]<target){
        left=mid+1;
      }else{
        right=mid-1;
      }
    }
    return -1;
  }
  
}
