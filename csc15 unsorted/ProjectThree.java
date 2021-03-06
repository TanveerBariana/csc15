//1019
//for project 3
import java.util.*;
import java.io.*;


public class ProjectThree{
    
    public static void main(String[] args)
    throws FileNotFoundException{
        double[] minGrade = {100.0, 100.0, 100.0}; //set all values to 100%
        testFile(minGrade); //test to see if file is valid, 
                            //and put them into array fileScore
        
        reportGrades(minGrade);
    }
    
    public static void testFile(double[] minGrade)
    throws FileNotFoundException {//throws excpetion
        int count=0;
        Scanner Scanscan = new Scanner(System.in);//set up first scanner
        System.out.print("Input filename:");//prompts them for file
        String filename1 = Scanscan.nextLine();//records filename
        File fileName = new File(filename1);
        if(fileName.canRead()){
            Scanner input = new Scanner(fileName);//reads file
            Scanner input1 = new Scanner(fileName);
            while(input.hasNextDouble()){
                count++;
                input.nextDouble();//increment it up one
            }
            double [] fileScore = new double [count];//sets up array to hold scores
            for(int i=0; i< fileScore.length; i++){
                fileScore[i]= input1.nextDouble(); //if there is a double record it
                
            }
            changeGrades(minGrade, fileScore); //use info from file to change lowest 
                                               //percent for certain grades
            
        }else{
            System.out.println("BAD FILE! RETYPE!");
            testFile(minGrade);
        }
    }
    
    public static void changeGrades(double[] minGrade, double[] fileScore){
        Arrays.sort(fileScore);//sort grades to find highest one
        minGrade[0]= Math.min(minGrade[0],fileScore[fileScore.length-1]*0.9);//score for a
        minGrade[1]= Math.min(minGrade[1],fileScore[fileScore.length-1]*0.8);//score for b
        minGrade[2]= Math.min(minGrade[2],fileScore[fileScore.length-1]*0.7);//score for c
    }
    
    public static void reportGrades (double[] minGrade){
        System.out.println("an a is "+ minGrade[0]);
        System.out.println("a b is "+ minGrade[1]);
        System.out.println("a c is "+ minGrade[2]);
    }
}
