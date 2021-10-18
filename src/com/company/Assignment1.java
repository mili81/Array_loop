package com.company;

public class Assignment1 {

    public static void main(String[] args) {
        int[] arrOne = {5, 3, 7, 6, 2, 8};
        ForMethod(arrOne);
        System.out.println();
        ForeachMethod(arrOne);
        System.out.println();
        WhileMethod(arrOne);
        System.out.println();
        DoWhile(arrOne);

    }

    public static void ForMethod(int[] arrOne) {
        for (int i = 0; i < arrOne.length; i++) {
           System.out.println(arrOne[i]);
      }
    }

    public static void ForeachMethod(int[] arrOne) {
        for (int vaRiable : arrOne) {
            System.out.println(vaRiable);
        }
    }
    public static void WhileMethod(int[] arrOne) {
            int i = 0;
            while (i < arrOne.length) {
                System.out.println(arrOne[i]);
                i++;

            }
        }
        public static void DoWhile(int[] arrOne) {
        int i = 0;
        do {
            System.out.println(arrOne[i]);
            i++;
        }
        while(i<arrOne.length);
    }}





