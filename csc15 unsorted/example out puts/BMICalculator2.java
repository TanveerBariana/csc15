public class BMICalculator2 {
   public static void main(String[] args) {
      //variable declaration
      double height; 
      double weight;
      double bmi;
      
      //bmi 1
      height= 70;
      weight= 195;
      bmi= (int)(weight/(height*height)*703);
      
      //type 1
      System.out.print("past bmi:");
      System.out.println(bmi);
      
      //bmi 2
      height= 70;
      weight= 180;
      bmi= (int)(weight/(height*height)*703);
      
      //type 2
      System.out.print("current bmi:");
      System.out.print(bmi);
      }
   }