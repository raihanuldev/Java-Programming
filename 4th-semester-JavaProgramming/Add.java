import java.util.Scanner;

class Add{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Frist Number: ");
        int a = sc.nextInt();
        System.out.print("Enter your Secound Number: ");
        int b = sc.nextInt();
        int add = a+b;
        System.out.println("The Answer Is "+ add);
    }
}