class Solution {
    public int reverse(int x) {
        if(x < 0){
            x = x * (-1);
            String st = String.valueOf(x);
            String st1 = "";
            for(int i=st.length()-1;i>=0;i--)
                st1 = st1 + st.charAt(i);
            try {
                int ans = Integer.parseInt(st1);
                ans = ans * (-1);
                return ans;
            }
            catch(Exception e){
                return 0;
            }
            
        }
        String st = String.valueOf(x);
        String st1 = "";
        for(int i=st.length()-1;i>=0;i--)
            st1 = st1 + st.charAt(i);
        try {
            int ans = Integer.parseInt(st1);
            return ans;
        }
        catch(Exception e){
            return 0;
        }
        
    }
}