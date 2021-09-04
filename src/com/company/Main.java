package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double elem;
        for(int i = 1; i <= 10; i++){
            elem = (double)1/i;
            DecimalFormat format = new DecimalFormat("0.000");
            System.out.print(format.format(elem) + "\t");
        }
    }
}
