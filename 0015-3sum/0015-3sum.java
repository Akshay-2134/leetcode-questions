class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
              Set<List<Integer>> s=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();

        Arrays.sort(nums);
        //fix the 1st ele and find other 2 ele
        for(int i=0;i<nums.length;i++)
        {
        //find other 2 ele using 2-sum approach
            int j=i+1;
            int k=nums.length-1;
           
            while(j<k)
            {int sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {   //add to the set and move
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        res.addAll(s);
        return res;
    }
}