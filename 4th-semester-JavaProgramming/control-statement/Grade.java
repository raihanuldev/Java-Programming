
public class Grade {
    public static void main(String args[]){
        // init score 0-100
        int score = 100;
        String  grade = null;

        switch(score /10){
            // for >=90
            case 10:
                grade = "Ei Tumi Fail";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade ="D";
            case 5:
                grade ="E";
            default:
                grade = "F";
                break;
        }
        // print
        System.out.print("Your Grade = "+ grade);
    }
}
