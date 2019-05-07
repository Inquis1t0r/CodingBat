package codingbat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inquis1t0r
 */

public class Array_1 {
  
  public boolean firstLast6(int[] nums) {
     return nums[0] == 6 || nums[nums.length - 1] == 6;
  }
  
  public int sum2(int[] nums) {
    int result = 0;
    
    if(nums.length > 2)
    {
       result += nums[0];
       result += nums[1];
    }
    else if (nums.length == 0)
    {
     result = 0;
    }
    else
    {
       for (int x : nums) {
            result += nums[x];
        }
    }
    return result;
  }

  
}
