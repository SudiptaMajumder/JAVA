/* 
70. Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step */


public class LeetCode_70_ClimbingStairs {
    public static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        
        int[] clims = new int[n+1];
        clims[1] = 1;
        clims[2] = 2;
        for(int i=3; i<=n; i++){
            clims[i] = clims[i-1]+ clims[i-2];
        }
        return clims[n];
    }

    public static void main (String[] args){
        System.out.println (climbStairs(2));
        System.out.println (climbStairs(3));
        System.out.println (climbStairs(4));
    }
}
