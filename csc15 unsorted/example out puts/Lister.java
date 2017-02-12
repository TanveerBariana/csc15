import java.util.*;
public class Lister {

   public static void main(String [] args){
      String[] names = getNames();
      names = sortNames(names);
      printNames(names);
   }
   
   public static String[] getNames() {
      Scanner in = new Scanner(System.in);
      System.out.print("ho wmany names");
      int numNames = in.nextInt;
      in.nextLine();
      String[] names = new String[numNames];
      for (int i=0 ;i <names.length; i++){ 
         System.out.print("next name");
         names[i] = in.nextLine();
      }
      return names;
   }
   
   public static String[] sortNames(String[] arr){
      return null;
   }
   

   
   public static void printNames (String[] arr){
      for (int = 0; i< arr.length; i++){
         system.out.printlm(arr[i]);
   }

  }   