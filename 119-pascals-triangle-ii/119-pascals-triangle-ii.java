class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result= new ArrayList<>();
        for(int i=0; i<=rowIndex ;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(0,1);
            for(int j=1 ;j<i ;j++){
                temp.add(j, result.get(i-1).get(j) + result.get(i-1).get(j-1));
                
            }
            if(i!=0){
                temp.add(1);
            }
            result.add(temp);
        }
        return result.get(result.size()-1);
    }
}