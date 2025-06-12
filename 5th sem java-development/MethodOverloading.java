/**
 * Bismillahhir Rahmanir Rahim
 * author: Raihanul Islam Sharif
 * Problem : MethodOverloading.java
 * platform: 
 * Date: 12 - 06 - 2025
 */


class overload{
    int sameName(int x,int y){
        int z = x+y;
        System.out.println("Int er Summtion method overloadng+> "+z);
        return 0;
    }
    float sameName(float x,float y){
        float z = x+y;
        System.out.println("This is Floteing Data-type mthd overlaoding "+z);
        return 0;
    }
    int sameName(int x){
        System.err.println("this is hudai "+x);
        return 0;
    }
}


public class MethodOverloading {
    public static void main(String[] arg){
        overload s = new overload();
        s.sameName(10,12);
        // s.sameName(10.1,12.2);
        s.sameName(10);
        s.sameName(22.43f, 233.4f);
    }
}
