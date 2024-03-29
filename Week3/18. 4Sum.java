class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> s = new ArrayList<>();
        if(nums == null || nums.length<4)
            return s;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])
                    continue;
                int left = j+1;
                int right = n-1;
                while(left<right){
                    while(left<right && nums[left] == nums[left-1])
                        left++;
                    while(left<right && nums[right] == nums[right+1])
                        right--;
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                        s.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++; right--;

                    }
                    else if(sum>target)
                        right--;

                    else
                        left++;

                }
            }
        }
        return s;
    }
}