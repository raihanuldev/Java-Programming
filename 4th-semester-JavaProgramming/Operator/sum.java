import java.util.Scanner;

class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tumar Frist Number ta dow: ");
        int a = sc.nextInt();
        System.out.print("Enter your secound Number: ");
        int b = sc.nextInt();
        int total = a+b;
        System.out.println("total: "+ total);
    }
}