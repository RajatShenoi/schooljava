import java.util.*;
public class Lib11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 - 6 for different patterns");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (i % 2 == 0) {
                            System.out.print((char)(j + 96));
                        } else {
                            System.out.print((char)(j + 64));
                        }
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= i; j--) {
                        if (j == 5) {
                            System.out.print("Z");
                        }
                        if (j == 4) {
                            System.out.print("Y");
                        }
                        if (j == 3) {
                            System.out.print("X");
                        }
                        if (j == 2) {
                            System.out.print("W");
                        }
                        if (j == 1) {
                            System.out.print("U");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 5; i >= 1; i -= 2) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print((char)(j + 64));
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 4; i >= 1; i--) {
                    for (int j = 1; j <= i * 2; j += 2) {
                        System.out.print((char)(j + 79));
                    }
                    System.out.println();
                }
                break;
            case 5:
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print((char)(j + 64) + "*");
                    }
                    System.out.println();
                }
                break;
            case 6:
                for (int i = 1; i <= 4; i++) {
                    for (char j = 1; j <= 4; j++) {
                        if (i == 1) {
                            System.out.print("a");
                        }
                        if (i == 2) {
                            System.out.print("b");
                        }
                        if (i == 3) {
                            System.out.print("A");
                        }
                        if (i == 4) {
                            System.out.print("B");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Enter from 1 - 6 only!");
        }
    }
}