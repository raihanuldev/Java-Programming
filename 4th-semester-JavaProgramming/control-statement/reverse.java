public class reverse {
    public static void main(String[] args) {
        int number = 9876543, reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse *10 + remainder;
            number = number /10;
        }
        System.out.println("THe Reverse number is:"+ reverse);
    }
}
