import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);//get value from user
        System.out.print("number?: ");//get value from user
        int num = dat.nextInt();
        System.out.print("power up?: ");//get power value from user
        int pow = dat.nextInt();
        long x = 1;
        for (int i = 1; i <= pow; i++) {//for loop until power value
            x *= num;
        }
        System.out.println("pow = " + x);
    }

}

