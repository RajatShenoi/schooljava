import java.io.*;
class Arr14 {
    public static void main()throws IOException {
        InputStreamReader inp  =  new InputStreamReader(System.in);
        BufferedReader in  =  new BufferedReader(inp);
        int Roll[] = new int[50];
        int SubA[] = new int[50];
        int SubB[] = new int[50];
        int SubC[] = new int[50];
        String HighName;
        int HighMarks, total = 0;
        for (int i = 0; i < 50; i++) {
            System.out.println("Enter Roll and Marks");
            Roll[i] = Integer.parseInt(in.readLine());
            System.out.println("Enter Subject A Marks");
            SubA[i] = Integer.parseInt(in.readLine());
            System.out.println("Enter Subject B Marks");
            SubB[i] = Integer.parseInt(in.readLine());
            System.out.println("Enter Subject C Marks");
            SubC[i] = Integer.parseInt(in.readLine());
        }
        System.out.println("Average Marks obtained by Students");
        for (int i = 0; i < 50; i++) {
            System.out.println("Roll " + Roll[i] + " Average is : " + (SubA[i] + SubB[i] + SubC[i]) / 3.0);
        }
        System.out.println("Average More then 80 by Students");
        for (int i = 0; i < 50; i++) {
            if (((SubA[i] + SubB[i] + SubC[i]) / 3.0) > 80) {
                System.out.println("Roll " + Roll[i] + " Average is : " + (SubA[i] + SubB[i] + SubC[i]) / 3.0);
            }
        }
        System.out.println("Average Less then 40 by Students");
        for (int i = 0; i < 50; i++) {
            if (((SubA[i] + SubB[i] + SubC[i]) / 3.0) < 40) {
                System.out.println("Roll " + Roll[i] + " Average is : " + (SubA[i] + SubB[i] + SubC[i]) / 3.0);
            }
        }
    }
}