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
