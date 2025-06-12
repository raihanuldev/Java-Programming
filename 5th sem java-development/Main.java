/**
 * Bismillahhir Rahmanir Rahim
 * author: Raihanul Islam Sharif
 * Problem : Main.java
 * platform: 
 * Date: 12 - 06 - 2025
 */

class Student {
    int roll;
    String name;
    String semester;

    void getData(int Froll,String fname,String fsem){
        roll = Froll;
        this.name = fname;
        this.semester = fsem;
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll: "+roll);
        System.out.println("Student Semester : "+semester);
    }
}

public class Main {

    public static void main(String[] args) {
        Student raihan = new Student();
        raihan.getData(789144, "Raihanul Islam","5th Seemster");
        raihan.name = "raihan";
        raihan.semester = "5th semester";
        System.err.println(raihan.name);
        System.err.println(raihan.semester);
    }
}