package blind75;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        //        for (int num : nums) {
        //            if (set.contains(num)) {
        //                return true;
        //            }
        //            set.add(num);
        //        }

        return false;
    }
}



//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
//
