import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int isEdekaOpen = 8;
        int isReweOpen = 9;
        int isEdekaClosed = 20;
        int isReweClosed = 21;
        int open = Math.min(isEdekaOpen,isReweOpen);
        int close = Math.max(isEdekaClosed,isReweClosed);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time: ");
        int time;
        while (true){
            time = sc.nextInt();
            if (time<0 || time>=24)
                System.out.print("Enter the valid value: ");
            else break;
        }
        if (time<open || time>close) System.out.println("Both shops are closed");
        else if (theFirstShop(time,isEdekaOpen,isEdekaClosed) && theSecondShop(time,isReweOpen,isReweClosed)) System.out.println("Both shops are opened");
        else if (theSecondShop(time,isEdekaOpen,isEdekaClosed)) System.out.println("Only Edeka is open");
        else System.out.println("Only Rewe is open");


    }
    public static boolean theFirstShop(int time,int open,int close){
        if (time>=open && time<close) return true;
        else return false;
    }
    public static boolean theSecondShop
            (int time,int open,int close){
        if (time>=open && time<close) return true;
        else return false;
    }

}