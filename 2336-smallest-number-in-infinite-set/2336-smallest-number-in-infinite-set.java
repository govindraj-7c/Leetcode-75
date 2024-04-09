class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    HashSet<Integer> set;
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        set = new HashSet<>();

        for(int i=1; i<=1000; i++){
            pq.add(i);
            set.add(i);
        }
    }
    
    public int popSmallest() {
        int no = pq.peek();
        pq.remove();
        set.remove(no);
        return no;
    }
    
    public void addBack(int num) {
        if(set.contains(num)){

        }
        else{
            pq.add(num);
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */