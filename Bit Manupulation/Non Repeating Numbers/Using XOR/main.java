// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int[] arr = new int[2];
        int n = nums.length;
        
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum ^ nums[i];
        }
        
        sum = sum & - sum;
        
        int sum1 = 0;
        int sum2 = 0;
        
        for(int j=0;j<n;j++){
            if((nums[j] & sum) >0){
                sum1 = sum1 ^ nums[j];
            }
            else{
                sum2 = sum2 ^ nums[j];
            }
        }
        arr[0] = sum1;
        arr[1] = sum2;
        Arrays.sort(arr);
        return arr;
    }
}