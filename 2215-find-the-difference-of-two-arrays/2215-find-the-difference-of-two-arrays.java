class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int no : nums1){
            set1.add(no);
        }
        for(int no : nums2){
            set2.add(no);
        }
        List<Integer> ans1 = new ArrayList<>();
        for(int n1 : set1){
            if(!set2.contains(n1)){
                ans1.add(n1);
            }
        }
        answer.add(ans1);
        List<Integer> ans2 = new ArrayList<>();
        for(int n2 : set2){
            if(!set1.contains(n2)){
                ans2.add(n2);
            }
        }
        answer.add(ans2);
        return answer;
    }
}