package Tasks1.Exercise_1;

import java.util.Scanner;

public class Easy_Search {

    public void method(){
        System.out.println("Function: z=((a-3)*b/2)+c");
        System.out.println("Please, enter unknown values");
        double a,b,c,z;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
        z=((a-3)*b/2)+c;
        System.out.println("Answer of this function: z=((a-3)*b/2)+c is = '"+z+"'");
    }
}
