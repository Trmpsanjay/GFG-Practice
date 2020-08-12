// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends

    /*
    basic idea is that take modulus untill number becomes zero if modulus is 0 replace it by 5 and
    then reverse the number to get the desired output
    *///
class GfG {
    int revNum(int num){
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num/=10;
        }
        return rev;
    }
    int convertfive(int num) {
        int revNum =0;
        while(num>0){
            int mod = num%10;
            if(mod==0){
                mod = 5;
            }
            revNum = revNum*10+mod;
            num/=10;
        }
        return revNum(revNum);
    }
}
