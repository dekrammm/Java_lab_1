import java.util.Scanner;

public class Task {
    public static void prog(int x, String a, String b){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                if (i == 0 || i == x-1){
                    System.out.print(a);
                    continue;
                }
                if (i == j || i == Math.abs(j - x + 1)) System.out.print(a);
                else System.out.print(b);
            }
            System.out.print("\n");
        }
    }
    public static int scan_Int(int x){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x = ");
        x = scanner.nextInt();

        return x;
    }
    public static String scan_Str(String a){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ...");
        a = scanner.next();
        return a;
    }
}
