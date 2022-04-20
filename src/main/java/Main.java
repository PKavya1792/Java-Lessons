import jdk.jshell.SourceCodeAnalysis;

import java.awt.*;
import java.sql.Date;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte Percent = 100;
        final byte Months_In_Year = 12;


        int principal =0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal: ");
            principal=scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.println("Annual interest rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest < 30) {
                monthlyInterest = annualInterest / Percent / Months_In_Year;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.println("Period (Years):");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * Months_In_Year;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

           double mortgage=(principal*(monthlyInterest*Math.pow(1+monthlyInterest, numberOfPayments)-1));

        String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ mortgageFormatted);

        }
    }





