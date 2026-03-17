class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n=nums.length;
        int[][] dp = new int[n][target+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        return sumRec(0,target,nums,dp);
        
    }
    static int sumRec(int i,int target,int[] nums,int[][] dp){
        int n=nums.length;
        if(i==n){
            if(target==0)
              return 1;
             
            return 0;  
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int incl=0;
        if(nums[i]<=target){
            incl = sumRec(i+1,target-nums[i],nums,dp);
        }
        int excl = sumRec(i+1,target,nums,dp);
        
       return  dp[i][target] = (incl+excl);
    }
}