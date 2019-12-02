/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advent1;

import helpme.InputReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import solution.Day1;
import solution.Day2;

/**
 *
 * @author antonis
 */
public class Advent1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

//     Day1 d=new Day1();
//        System.out.println(d.computeTotalFuel());
//        InputReader ir=new InputReader();
//        ir.readInput();
        int[] a = {1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 6, 1, 19, 1, 19, 9, 23, 1, 23, 9, 27, 1, 10, 27, 31, 1, 13, 31, 35, 1, 35, 10, 39, 2, 39, 9, 43, 1, 43, 13, 47, 1, 5, 47, 51, 1, 6, 51, 55, 1, 13, 55, 59, 1, 59, 6, 63, 1, 63, 10, 67, 2, 67, 6, 71, 1, 71, 5, 75, 2, 75, 10, 79, 1, 79, 6, 83, 1, 83, 5, 87, 1, 87, 6, 91, 1, 91, 13, 95, 1, 95, 6, 99, 2, 99, 10, 103, 1, 103, 6, 107, 2, 6, 107, 111, 1, 13, 111, 115, 2, 115, 10, 119, 1, 119, 5, 123, 2, 10, 123, 127, 2, 127, 9, 131, 1, 5, 131, 135, 2, 10, 135, 139, 2, 139, 9, 143, 1, 143, 2, 147, 1, 5, 147, 0, 99, 2, 0, 14, 0
        };

//int []a={1,1,1,4,99,5,6,0,99};

int []b=a.clone();
Day2 d = new Day2();


                for (int j=75; j<100; j++){
               for (int k=0; k<100; k++){
                 a[1] = j; a[2] = k;
                    System.out.println("noun is "+a[1]);
                    System.out.println("verb is "+a[2]);
                   System.out.println(Arrays.toString(a));
                   int result=d.calculateTheArray(a);
                   System.out.println("the result is "+result);
                   if(result==19690720){
                       int dada=a[1]*100+a[2];
                       System.out.println("the answer is "+dada);
                       break;
                   }
               a=b.clone();
                   System.out.println(Arrays.toString(a));
                }

            }
        }
}
    


