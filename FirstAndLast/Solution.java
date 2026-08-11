package FirstAndLast;

public class Solution{
    public int[] searchRange(int[] nums, int target) {
      int left=0;
      int right=nums.length-1;
      int res[]={-1,-1};

      while (left<=right) {
        int mid=left+(right-left)/2;
        if(nums[mid]>=target){
          right=mid-1;
        }else{
          left=mid+1;
        }
      }
      //This force stop works because it's already sorted(Binary search anyway)
      if(left>=nums.length||nums[left]!=target ){
        return res;
      }
      res[0]=left;
      //Left part finished;

      left=0;
      right=nums.length-1;
      while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]<=target){
          left=mid+1;
        }else{
          right=mid-1;
        }
      }
      res[1]=right;
      return res;
    }
}


