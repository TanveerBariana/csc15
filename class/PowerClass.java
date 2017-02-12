import java.util.*;
public class PowerClass{
   public static void main(String args[]){
      Scanner num = new Scanner(System.in);
      double x = num.nextDouble();
      Scanner exp = new Scanner(System.in);
      double y = exp.nextDouble();
      System.out.print(Math.pow(x,y));
   }
} 