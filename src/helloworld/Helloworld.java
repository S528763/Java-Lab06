package helloworld;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author merry
 */
public class Helloworld {

    public static void main(String[] args) throws ParseException {
//        int[] myInts = new int[100];
//        for(int i=0; i< myInts.length; i++){
//            System.out.print(myInts[i]+ " ");
//            if((i+1)%10 == 0){
//                System.out.println();
//            }
//        }
//
        ArrayList<Integer> myIntegers = new ArrayList<Integer>();
        myIntegers.add(14);
        myIntegers.add(34989);
        myIntegers.add(46);
        myIntegers.add(87);
        myIntegers.add(98);
        myIntegers.add(23);
        myIntegers.add(343573);
        System.out.println(myIntegers.size());
//
//        int max = myIntegers.get(0);
//        for(int myInt : myIntegers){
//            if(myInt > max){
//                max = myInt;
//            }
//        }
//        System.out.println("Largest value : " + max);

//          int max = myIntegers.get(0);
//          for(int i=0; i < myIntegers.size();i++)
//          {
//              if(myIntegers.get(i) > max){
//                  max = myIntegers.get(i);
//              }
//          }
//          System.out.println("This" + max);
//        
////        Scanner in = new Scanner(new File("integers.txt"));
////
////        System.out.println(myNumbers.get(37));
////
////        myNumbers.add(135);
////
////        myIntegers.set(14,56);
//        
////        for(int myNum : myNumbers)
////        {
////            System.out.print(myNum + " ");
////        }
////        int num = 53;
////        System.out.println(num < 10 ? "small" : "big");
////
////        System.out.println(myNums[37]);
////
////        myNums[14] = 56;
////
////        for(int i=0; i < myNums.length; i++)
////        {
////            System.out.print(myNums[i] + " ");
////        }
//        
//        int n = 5;
//        int temp = n;
//        for (int row = 1 ; row <= n ; row++)
//        {
//            for (int c = 1 ; c < temp ; c++)
//            {
//                System.out.print("a");
//            }
//            temp--;
//            for (int d = 1 ; d <= 2*row - 1 ; d++)
//            {
//                System.out.print("B");
//            }
//            System.out.println("");
//        }
//        
//        String myString = "The memorial!";
//        System.out.println(myString.substring(2, 6));
//        System.out.println(myString.charAt(0));
//        System.out.println(myString.indexOf("Reshma"));
//        System.out.println(myString.indexOf("m"));
//        System.out.println(myString.indexOf("!"));
//        
//        String str = "I really hope that it gets warm soon";
//        System.out.println(str.length());
//        System.out.println(str.substring(4, 12));
//        System.out.println(str.substring(14));
//        System.out.println(str.charAt(3));
//        System.out.println(str.substring(str.indexOf('a'),str.lastIndexOf('e')));
//        
//        
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println(format.parse("01-23-2004"));
        
    }
}