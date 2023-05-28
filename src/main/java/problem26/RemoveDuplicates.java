package main.java.problem26;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.removeDuplicates(new int[]{1,2,4,6,7});
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int index =0;
            int prev = nums[0];
            for(int x=1; x < nums.length; x++){
                if(prev < nums[x]){
                    index +=1;
                    nums[index] = nums[x];
                }

                prev = nums[x];
            }

            nums = Arrays.copyOfRange(nums, 0, index+1);

            return nums.length;
        }
    }
}
