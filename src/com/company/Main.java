package com.company;

public class Main {

    public static void main(String[] args) {
        String[] arrOne = {"NifNif", "NafNaf", "NufNuf"};
        for (String piggyUser : arrOne) {
            System.out.println(piggyUser);
        }


        {
            for (int i = 0; i < arrOne.length; i++) {
                arrOne[i] = "pig";
                System.out.println((arrOne[i]));
            }
        }
    }}