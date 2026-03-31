class MyHashSet {
    ArrayList<Integer> x= new ArrayList<>();
    public MyHashSet() {

    }
    
    public void add(int key) {
        if(!x.contains(key)){
            x.add(key);
        }
    }
    
    public void remove(int key) {
        x.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return x.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */