class Solution {
    
    public int longestPalindrome(String s) {
        int arr[]=new int[58];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
        }
        int ans=0;
        for(int i=0;i<58;i++){
            ans+=(arr[i]/2)*2;
        }
        if(ans==s.length()){
            return ans;
        }
        return ans+1;
    }
}