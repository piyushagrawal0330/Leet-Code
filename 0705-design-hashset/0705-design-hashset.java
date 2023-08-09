class MyHashSet {
    //Upvote appreciated!
    boolean[] st;

    public MyHashSet() {
        st = new boolean[1000000 + 1];
    }
    
    public void add(int key) {
        st[key] = true;
    }
    
    public void remove(int key) {
        st[key] = false;
    }
    
    public boolean contains(int key) {
        return st[key];
    }
}