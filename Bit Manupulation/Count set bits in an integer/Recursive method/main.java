// { Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
        if(N==0){
            return 0;
        }
        else {
            return 1 + setBits(N&(N-1));
        }
    }
}