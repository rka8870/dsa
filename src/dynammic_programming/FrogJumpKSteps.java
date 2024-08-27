package dynammic_programming;

public class FrogJumpKSteps {

    public static int minimizeCost(int n, int k, int []height){
        int[] dp = new int[n+1];
        if(n<=1){return 0;}
        for(int i=0;i<=k;i++){
            if(i<=1){
                continue;
            }
            dp[i] = Math.abs(height[i-1]-height[0]);
        }
        for(int i=k+1;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=k;j++){
                min = Math.min(min,dp[i-j]+Math.abs(height[i-1]- height[i-j-1]));
            }
            dp[i]=min;
        }
        return dp[n];
        // Write your code here.
    }

}
