public class Projectfive {
   public static final int LITTLEBOX = 3;
   public static final int BIGBOX = 6;
  
   public static void main(String[] args){
      drawSquare (LITTLEBOX);
   }
   public static void drawSquare(int size){
      for (size = LITTLEBOX; size <= BIGBOX; size++) { //loop program to make multiple sqaures from small to big
      drawLine( "*" , " " , size);
      }
   }
   public static void drawline( String ch1 , String ch2 , int length){
      System.out.print(ch1);
      for (int k = 1; k < length; k++){
         Sytem.out.print(ch2);
      }
      System.out.println(ch1);
   }
}