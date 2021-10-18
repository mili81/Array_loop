package com.company;

public class Assignment2 {
    public static void main(String[] args) {
        int[] myArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        negative(myArray);
        odd(myArray);
        countOdd(myArray);
        sameValue(myArray);
        eachSecond(myArray);

        // // TODO: 18.10.21 ask Edgars about this.
        averageValue(myArray);
        smaller(myArray);
    }

    public static void negative(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                System.out.println("Negative values are: " + myArray[i]);
            }
        }
    }

    public static void odd(int[] myArray) {
        System.out.println("Odd numbers in this Array are:");
        for (int oddNr : myArray) {
            if (oddNr % 2 != 0)
                System.out.println(oddNr + "");
            //   System.out.println(""+myArray[i]+"");
        }
    }

    public static void countOdd(int[] myArray) {
        int count = 0;
        for (int i : myArray) {
            if (i % 2 != 0) {
                count++;

            }
        }
        System.out.println("There are " + count + " odd Numbers in this Array.");


    }

    public static void sameValue(int[] myArray) {
        System.out.println("Duplicate elements in given Array are: ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    System.out.println(myArray[j]);
                }
            }
        }
    }

    public static void eachSecond(int[] myArray) {
        System.out.println("There is printed each second element of Array: ");
        for (int i = 1; i < myArray.length; i = i + 2) {
            System.out.println(myArray[i]);
        }
    }

    public static double averageValue(int[] myArray) {
        double sum = 0;
        if (myArray.length > 0) {
            for (int i = 0; i < myArray.length; i++)
                sum = sum + myArray[i];
        }
        double averageValue1 = sum / myArray.length;
        return averageValue1;

    }

    public static void printAverage(int[] myArray) {
        System.out.println("Average value of Array is " + averageValue(myArray));

    }



    public static void smaller(int[] myArray){
        int establish = 0;
        double avgVariable = averageValue(myArray);
        for (int i = 0; i < myArray.length; i++) {
            if (avgVariable> myArray[i]){
                establish++;

            }

        }
        System.out.println("There are" + establish + " elements in this Array, smaller than average" + "(" + avgVariable + ").");
    }
}

