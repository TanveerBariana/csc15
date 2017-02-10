//this project was made by: 1019
// for csc15 project 2
import java.util.*;

public class CSCProjectTwo {
  
  
  
   public static void main( String[] args){
      
      Scanner console = new Scanner(System.in);
      int count = 0; // needed something to hold value during 
      int wDay = 0; //computations (true for both of them)
      
      System.out.print("this program finds what");//basic intro
      System.out.print("day it is according to");
      System.out.print("what you put in"); 
     
      System.out.print("Input a month(1-12) ");
      int month = console.nextInt();
      
      System.out.print("What is the day(1-31) ");
     int day = console.nextInt();
  
      System.out.print("what year is it ");
      int year = console.nextInt();
      
      int year1 = getYear(year, count); //get their respective values
      int month1 = getMonth(month, count, year);
      int day1 = getDay(day, count);
      int total = year1 + month1 + day1;
      calcDay(total, wDay); //acutally calculate what day it is
      }
      
   public static int getYear(int year,int count){
      int i = 0;
      while (i <= year){  //to account for year 1 i added the "="
         if (i % 4 != 0){ 
            count += 365;//not leap year
         }else{
            count += 366;//leap year
         }
         i++;
      }
      return count;
   }
   
   public static int getMonth(int month, int count,int year){
      int i = 0;
      while (i < month){
         if(month == 4 || month == 6 || month == 9 || month == 11){
            count = count + 30;
         }else if( month == 2){
             if ( year % 4 ==0){//leap year 
               count = count + 29;
             }else{            //not a leap year
               count = count + 28;
             }
         }else{
            count = count + 31;
         }
         i++;     
      }
      return count;
   }
      
      
   public static int getDay(int day, int count){
      count = count + day;
      return count;  
   }
   
   public static void calcDay(int total, int wDay){
      wDay =(total % 7);
      if (wDay == 0){
         System.out.print("Monday");
      }else if(wDay == 1){
         System.out.print("Tuesday");
      }else if(wDay == 2){
         System.out.print("Wednesday");
      }else if(wDay == 3){
         System.out.print("Thursday");
      }else if(wDay == 4){
         System.out.print("Friday");
      }else if(wDay == 5){
         System.out.print("Saturday");
      }else if(wDay == 6){
         System.out.print("sunday");
      }
   }
 }  