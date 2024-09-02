import java.util.Scanner;

public class forLoopEx {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value For N=>:  ");
        int n = 10;
        // int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i<= n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
