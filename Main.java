import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance: ");
        int balance = scanner.nextInt();
        int count = 0;
        while (balance>0){
            int withdraw = currentBalance (balance);
            balance = balance-withdraw;
            count++;
        }
        System.out.println("You'll need "+count+" days to withdraw all your money");
    }
    public static int currentBalance (int balance){
        int maximumAmount = 1;
        for (int i=balance/2;i>1;i--){
            if (balance%i==0){
                maximumAmount = i;
                break;
            }
        }
        return maximumAmount;
    }
}
       