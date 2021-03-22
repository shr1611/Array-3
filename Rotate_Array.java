// Time:O(n)
// Space:O(1)

class Solution {
    public void rotate(int[] nums, int k) {
      int n = nums.length;
          if(k > n){
            k = k%n;
          }  
      reverse(nums,0,n-k-1);
      reverse(nums,n-k,n-1);
      reverse(nums,0,n-1);
    }
  public void reverse(int[] nums,int start,int end){
    while(end > start){
      swap(nums,start,end);
      start++;
      end--;
    }
  }
  public void swap(int[] nums,int i,int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
