import java.awt.*;
import java.sql.Date;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                    boolean hasGoodIncome=false;
                    boolean hasCriminalRecord=false;
                    boolean hasGoodCredit=true;

                    boolean isEligible=(hasGoodIncome||hasGoodCredit) && !hasCriminalRecord;

                System.out.println(isEligible);

    }
}

