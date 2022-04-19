import java.awt.*;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        byte age=30;
        long viewsCount = 1_123_456_789L;
        float price = 30.11F;
        char letter = 'A';
        boolean isEligible=false;

        byte x = 1;
        byte y = x;
        Point point1=new Point(x=1,y=1);
      Point point2=point1;
point1.x=2;
        System.out.println(point2);
       }
}