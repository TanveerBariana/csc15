//1019
//for project 3
import java.util.*;
import java.io.*;


public class ProjectThreeALT{
    
    public static void main(String[] args)
        throws FileNotFoundException{
        double[] minGrade = {100.0, 100.0, 100.0}; //set all values to 100%
        
        testFile(); //test to see if file is valid, and put them into array fileScore
        changeGrades(minGrade, fileScore); //use info from file to change lowest percent for certain grades

        reportGrades(minGrade);
    }
    
    public static void testFile()
    throws FileNotFoundException {//throws excpetion
        Scanner Scanscan = new Scanner(System.in);//set up first scanner
        System.out.print("Input filename:");//prompts them for file
        String fileName = Scanscan.nextLine();//records filename
        Scanner input = new Scanner(new File(fileName));//reads fil
        double [] fileScore = new double [input.length];//sets up array to hold scores
        for(int i=0; i< input.length; i++){
            if(input.hasNextDouble){
                fileScore[i]= input.nextDouble; //if there is a double record it
            }
        }
               
    }
    
    public static void changeGrades(double[] minGrade, double[] fileScore){
        Arrays.sort(fileScore);//sort grades to find highest one
        minGrade[0]= Math.min(minGrade[0],fileScore[fileScore.length-1]*0.9);//score for a
        minGrade[1]= Math.min(minGrade[1],fileScore[fileScore.length-1]*0.8);//score for b
        minGrade[2]= Math.min(minGrade[2],fileScore[fileScore.length-1]*0.7);//score for c
    }
    
    public static void reportGrades (double[] minGrade){
        System.out.println("an a is "+ Arrays.toString(minGrade[0]));
        System.out.println("a b is "+ Arrays.toString(minGrade[1]));
        System.out.println("a c is "+ Arrays.toString(minGrade[2]));
    }
}
