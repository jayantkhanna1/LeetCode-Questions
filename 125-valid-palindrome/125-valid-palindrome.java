class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
         
        int left = 0, right = s.length() - 1;
        while(left < right){
            
            if(!Character.isLetterOrDigit(s.charAt(right))) right--;
            else if(!Character.isLetterOrDigit(s.charAt(left))) left++;
            else
                if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}