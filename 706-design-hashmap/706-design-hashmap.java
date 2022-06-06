class MyHashMap {
    ArrayList<List<Integer>> myarr = new ArrayList<List<Integer>>();
    public MyHashMap() {
       
    }
    
    public void put(int key, int value) {
        ArrayList<Integer> temparr =  new ArrayList<Integer>();
        if (get(key) == -1){
            temparr.add(key);
            temparr.add(value);
            myarr.add(temparr);
        }
        else{
            remove(key);
            temparr.add(key);
            temparr.add(value);
            myarr.add(temparr);
        }
    }
    
    public int get(int key) {
        for(int i=0; i< myarr.size();i++){
            if(myarr.get(i).get(0) == key)
                return myarr.get(i).get(1);
        }
        return -1;
    }
    
    public void remove(int key) {
        if(get(key) != -1){
            for(int i=0; i< myarr.size();i++){
                if(myarr.get(i).get(0) == key)
                    myarr.remove(i);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */