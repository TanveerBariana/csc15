//programing project 1
//CSC 15 Fall 2013, 10/14/2013
//Written by: Class ID 0809
// this prints squares based on class constants 
public class ProjectOne {
    public static final int LITTLEBOX = 3;
    public static final int BIGBOX = 6;
    
    public static void main(String[] args){
        drawSquare (LITTLEBOX);
    }
    public static void drawSquare(int size){
        for (size = LITTLEBOX; size <= BIGBOX; size++) { 
            drawMidLine(size);
            drawEndLine(size);
            System.out.println();
        }
        
    }
    public static void drawLine( String ch1 , String ch2 , int length){
        System.out.print(ch1);
        for (int k = 1; k < (length-1); k++){
            System.out.print(ch2);
        }
        System.out.println(ch1);
    }
    public static void drawMidLine( int length) {
        for (int k = 1; k <= (length - 2) ; k++){ 
            System.out.print("*");
            for( int j =1; j <= (length - 2); j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    public static void drawEndLine( int length) {
        for (int k = 1; k <= length; k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
