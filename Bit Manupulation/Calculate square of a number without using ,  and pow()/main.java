import java.util.*;

public class main{

    public static int square(int n){
        if(n<0){
            n= -n;
        }
        int res = n;
        for(int i =1;i<n;i++){
            res += n;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = square(num);
        System.out.println(ans);
    }
}