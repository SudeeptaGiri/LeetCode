class Solution {
    static void swap(int [] nums, int lb, int rb){
        int temp = nums[lb];
        nums[lb] = nums[rb];
        nums[rb] = temp;
    }
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[correct]!= nums[i]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                return nums[j];
            }
        }
        return nums.length+1;
    }
}