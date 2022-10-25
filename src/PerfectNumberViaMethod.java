import java.util.Scanner;

public class PerfectNumberViaMethod {
    static long perfectNum(long num) {
        long sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        long Num, S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        Num = sc.nextLong();
        S = perfectNum(Num);

        if(S == Num){
            System.out.println(Num + " is the Perfect number.");
        }
        else {
            System.out.println(Num + " is not the Perfect number.");
        }


    }
}


