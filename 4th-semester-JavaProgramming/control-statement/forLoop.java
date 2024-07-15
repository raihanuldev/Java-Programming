// package control-statement;

public class forLoop {
    public static void main(String args[]) {
        int i;
        int n = 10;
        int sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println("Current Index=> " + i);
        }
        System.out.print(sum);
    }
}
