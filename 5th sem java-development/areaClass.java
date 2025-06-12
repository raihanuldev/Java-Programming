/**
 * Bismillahhir Rahmanir Rahim
 * author: Raihanul Islam Sharif
 * Problem : areaClass.java
 * platform: 
 * Date: 12 - 06 - 2025
 */

import java.util.Scanner;

public class areaClass {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radious: ");
        double r = sc.nextDouble();
        double area = (22 * r*r)/7;
        System.out.println("area of Cricle: "+area);
    }
}