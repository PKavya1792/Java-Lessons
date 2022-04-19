import java.awt.*;
import java.sql.Date;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] [] numbers1= {{1,2,3},{4,5,6}};
        numbers1[0][0]=1;

        System.out.println(Arrays.deepToString(numbers1));

        int [] numbers = {2,4,1,5,6};
        Arrays.sort(numbers);
        System.out.println(numbers.length);

             System.out.println(Arrays.toString(numbers1));
       }
}