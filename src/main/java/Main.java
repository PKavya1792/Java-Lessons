import java.awt.*;
import java.sql.Date;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
final byte Percent = 100;
final byte Months_In_Year = 12;

Scanner scanner = new Scanner(System.in);

System.out.print("Principal: ");
int principal = scanner.nextInt();

        System.out.println("Annual interest rate: ");
float annualInterest= scanner.nextFloat();
float monthlyInterest= annualInterest / Percent / Months_In_Year;

        System.out.println("Period (Years):");
        byte years=scanner.nextByte();
        int numberOfPayments=years*Months_In_Year;

        double mortgage=(principal*(monthlyInterest*Math.pow(1+monthlyInterest, numberOfPayments)-1));


        String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ mortgageFormatted);

    }
}