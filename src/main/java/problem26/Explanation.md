# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
Iterate through the given array checking if the previous element is less than the current element - the `prev` variable help keep track of the previous elelment. If the current element is greater than the previous, the index which was set to `0` is incremented by `1`. Since the `in-place` algorithm doesn't allow us to create a new data structure, the element of `nums` at the index location is overriden and replaced with a unique element of `nums` array. Then a `subarray` of `nums` is reassigned to the original array to remove the unwanted elements.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
$$O(n)$$

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
$$O(n)$$

# Code
```
class Solution {
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
```