class Trie {
    
    Node root;

    public Trie() {
        root = new Node();
    }
    
    class Node{
        Node[] children = new Node[26];
        boolean eow;
        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    
    public void insert(String word) {
        int len = word.length();
        Node curr = root;
        int idx = 0;
        for(int i=0; i<len; i++){
            idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    
    public boolean search(String word) {
        int len = word.length();
        Node curr = root;
        int idx = 0;
        for(int i=0; i<len; i++){
            idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        int idx = 0;
        for(int i=0; i<prefix.length(); i++){
            idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */