package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] drobch = {1.2,3.4,5.6,-1.2,-7.1,6.6,9.6,-90.9,50.5,30.5,-25.6,60.0,7.9,3.3,-15.0};
        double sum=0;
        double kol=0;
        boolean isOtr = false;
        for (double crArif : drobch){
            if (crArif < 0){
                isOtr=true;
            }else { if (isOtr){
                kol++;
                sum += crArif;
            }
            }
        }
        System.out.println(Arrays.toString(drobch));
        System.out.println("среднее ариф. знач.: " + sum/kol);

        sortirovkaChisel(drobch);
        System.out.println(Arrays.toString(drobch));

    }
    public static void sortirovkaChisel (double[] abu){
        for (int i = 0; i < abu.length; i++) {
            double minZnachenie = abu[i];
            for (int j = i; j < abu.length; j++) {
                if (minZnachenie > abu[j]){
                    double d = minZnachenie;
                    minZnachenie = abu[j];
                    abu[j]=d;
                }
            }
            abu[i] = minZnachenie;
        }
    }



}
