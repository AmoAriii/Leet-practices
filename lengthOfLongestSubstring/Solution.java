package lengthOfLongestSubstring;

public class Solution {

  public int lengthOfLongestSubstring(String s){
      int counter=0;
      int max=0;
      StringBuilder builder=new StringBuilder();
      for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
          char currentChar = s.charAt(j);

            if (builder.indexOf(String.valueOf(currentChar)) == -1) {
                builder.append(currentChar);
                counter++;

                if (counter > max) {
                    max = counter;
                }
            } else {
                break;
            }
          
        }
      }
      return max;
  }
  
}
