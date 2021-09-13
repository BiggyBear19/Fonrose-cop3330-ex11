/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise11;

import java.util.Scanner;
import java.lang.Math;

public class Exercise11 {
    public static void main(String[] args){

        Scanner exchange = new Scanner(System.in);

        System.out.print("How many Euros are you exchanging: ");

        String str_euros = exchange.nextLine();

        double Euros = Integer.parseInt(str_euros, 10);

        System.out.print("What is the exchange rate: ");

        double rate = exchange.nextDouble();

        double Dollars = Euros * rate;

        double rounded_dollars = Math.round(Dollars *100)/100.0;

        System.out.printf("%.2f Euros at an exchange rate of %f is\n%.2f US Dollars", Euros, rate, rounded_dollars);



    }
}
