package FirstAndLast;
public class Main{
  public static void main(String[] args){
    Solution solution=new Solution();
    int[] nums={5,7,7,8,8,10};
    
    int[] res=solution.searchRange(nums,8);
    for(int n:res){
      System.out.println(n);
    }
  }
}
