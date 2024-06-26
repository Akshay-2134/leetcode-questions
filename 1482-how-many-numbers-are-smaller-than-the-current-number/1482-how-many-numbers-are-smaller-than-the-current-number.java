class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
     int [] result=nums.clone();
     Arrays.sort(result);
     Map<Integer,Integer> index=new HashMap<>();
     for(int i=0;i<result.length;i++){
        index.putIfAbsent(result[i],i);
     }
     for(int i=0;i<nums.length;i++)
     {
        result[i]=index.get(nums[i]);
     }
     return result;
    }
}