class Check_if_Array_is_Sorted_or_not {
    public void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        
        int first = nums[0];

        for (int i = 0 ; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[n - 1] = first;
    
    }
}
