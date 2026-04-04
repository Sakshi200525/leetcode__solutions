class Solution {
    public int removeElement(int[] nums, int val) {
       int ptr = 0;

       for(int i=0;i<nums.length;i++){
        if(nums[i] != val){
            nums[ptr] = nums[i];
            ptr++;
        }
       }
       return ptr;
    }
}

//Program 1:
 // int i=0;
        // int j=0;
        // int n = nums.length;

        // while(j<n){
        //     if(nums[j] != val){
        //         nums[i] = nums[j];
        //         i++;
        //     }
        //     j++;
        // }
        // return i;
//Program 2:

        // int i=0;
        // int n = nums.length;
        // int count =0;

        // for(i=0;i<n;i++){
        //     if(nums[i] == val){
        //         continue;
        //     }
        //     nums[count]=nums[i];
        //     count++;
        // }
        // return count;
