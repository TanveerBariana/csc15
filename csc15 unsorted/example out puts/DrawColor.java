import java.awt.*;

public class DrawColor {
public static final  int RECTS = 32; 
   public static void main(String [] args) {
      DrawingPanel board = new DrawingPanel(256,256);
      board.setBackground(new Color(225,128,0));
      
      Graphics g = board.getGraphics();
      
      for (int i = 0; i <RECTS;i++) {
         int shift = i * 256 /RECTS;
         g.setColor( new Color(shift ,shift ,shift));
         g.fillRect(shift, shift, 20, 20);
         }
      }

 }        
      