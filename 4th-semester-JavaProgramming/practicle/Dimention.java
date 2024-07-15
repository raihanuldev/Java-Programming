
public class Dimention {
    public static void main(String[] args){
        int [][] a = {{35,12,43},{55,23,52}};
        int [][] b = {{83,16,23},{91,13,42}};
        int [][] Sum = new int[2][3];
        int rows,columns;

        for(rows =0; rows<a.length; rows++){
            for(columns = 0; columns <a[0].length; columns++){
                Sum[rows][columns]=a[rows][columns]+b[rows][columns];

            }
        }

        System.out.println("Sum Of thoese twos array");
        for(rows = 0; rows < a.length; rows++){
            for(columns =0; columns < a[0].length; columns++){
                System.out.format("%d \t",Sum[rows][columns]);
            }
            System.out.println("");
        }
    }
}
