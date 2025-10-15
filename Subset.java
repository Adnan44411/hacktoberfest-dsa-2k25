class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=0;
        List<Integer> temp=new ArrayList<>();
        
        return subsets(nums ,ans , temp , n);
    }
    public List<List<Integer>> subsets(int[] nums ,List<List<Integer>> ans,List<Integer> temp , int n) {
    if(n==nums.length){
        ans.add(new ArrayList<>(temp));
        return ans;
    }
    temp.add(nums[n]);
    subsets(nums , ans ,temp ,n+1);
    temp.remove(temp.size()-1);
     subsets(nums,ans,temp,n+1);
     return ans;

    }

}
