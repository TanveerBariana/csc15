import java.awt.*;

public class pyramid {
   public static final int SIZE = 100;
   
   public static void main(String [] args) {
      DrawingPanel panel = new DrawingPanel (350, 250);
      Graphics g = panel.getGraphics();
      
      drawPyramid(g, Color.WHITE, 0, 0, 10);
      drawPyramid(g, Color.RED, 80, 140, 5);
      drawPyramid(g, Color.BLUE, 220, 50, 20);
   }
   
   public static void drawPyramid (Graphics g, Color c, int x, int y, int stairs) {
      g.drawRect(x, y, SIZE, SIZE);
      for (int i = 0; i <stairs; i++) {
         int stairHeight = SIZE / stairs;
         int stairWidth = stairHeight * (i + 1);
         int stairX = x + (SIZE - stairWidth) /2 ;
         int stairY = y + stairHeight * i;
         
         g.setColor(c);
         g.fillRect (stairX,stairY, stairWidth, stairHeight);
         
         g.setColor(Color.BLACK);
         g.drawRect (stairX,stairY, stairWidth, stairHeight);
         }
      }
   }