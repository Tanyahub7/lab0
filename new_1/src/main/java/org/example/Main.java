package org.example;

public class Main {
    public static void main(String[] args) {
        Variant1 variant = new Variant1();

        //integerNumbersTask
        System.out.println("integerNumbersTask(258) = " + variant.integerNumbersTask(258));
        System.out.println("integerNumbersTask(543) = " + variant.integerNumbersTask(543));
        System.out.println("integerNumbersTask(101) = " + variant.integerNumbersTask(101));

        //booleanTask
        System.out.println("booleanTask(5) = " + variant.booleanTask(-5,-2,-4));
        System.out.println("booleanTask(-3) = " + variant.booleanTask(-3,6,7));
        System.out.println("booleanTask(0) = " + variant.booleanTask(-3,-5,-7));

        //ifTask-
        System.out.println("ifTask(5,2,4) = " + variant.ifTask(5,2,4));
        System.out.println("ifTask(-1,4,8) = " + variant.ifTask(-1,4,8));
        System.out.println("ifTask(-2,-5,7) = " + variant.ifTask(-2,-5,7));

        //switchTask
        double array [] = variant.switchTask (1,3);
        System.out.println("switchTask(1) = "+ array[0] + "   " + array[1] + "   "+array[2] + "   "+array[3]);
        double array1 [] = variant.switchTask(2,8);
        System.out.println("switchTask(2) = "+ array1[0] + "   " + array1[1] + "   "+array1[2] + "   "+array1[3]);
        double array2 [] =variant.switchTask   (3,10);
        System.out.println("switchTask(4) = "+ array2[0] + "   " + array2[1] + "   "+array2[2] + "   "+array2[3]);
        double array3 [] =variant.switchTask  (4,2);
        System.out.println("switchTask(4) = "+ array3[0] + "   " + array3[1] + "   "+array3[2] + "   "+array3[3]);

        //forTask
        System.out.println("forTask:"+variant.forTask( 4));


        //whileTask
        System.out.println("whileTask(10, 3) = ");
        variant.whileTask(10, 3);

        System.out.println("whileTask(12, 5) = ");
        variant.whileTask(12, 5);

        System.out.println("whileTask(25, 7) = ");
        variant.whileTask(25, 7);

        //arrayTask
        int[] dwf={10, 20, 30, 40};
        int[] arrayResult = variant.arrayTask(dwf);
        System.out.print("arrayTask(5) = ");
        for (int num : arrayResult) {
            System.out.print(num + " ");
        }
        System.out.println();

        //twoDimensionArrayTask
        variant.twoDimensionArrayTask(4, 5);
        variant.twoDimensionArrayTask(9, 2);
        variant.twoDimensionArrayTask(5, 7);
    }
}