
import java.applet.Applet;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cirak
 */
public class Deneme extends Applet {
int x,y;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        resize(100,200);
    }
    public void paint (Graphics g){
  g.setColor(Color.BLACK);g.fillRect(10, 10, 70, 150);
  
 for(int i=0;i<2;i++){
  try {
      g.setColor(Color.RED);g.fillOval(20, 20, 50, 40);
         Thread.sleep(2000);
      
  g.setColor(Color.BLACK);g.fillOval(20, 20, 50, 40);
 //----
       g.setColor(Color.YELLOW);g.fillOval(20, 60, 50, 40);
 Thread.sleep(2000);
  g.setColor(Color.BLACK);g.fillOval(20, 60, 50, 40);
 //-----------
       g.setColor(Color.GREEN);g.fillOval(20, 100, 50, 40);
 Thread.sleep(2000);
  g.setColor(Color.BLACK);g.fillOval(20, 100, 50, 40);
 }
   catch (InterruptedException ex) {
          Logger.getLogger(Deneme.class.getName()).log(Level.SEVERE, null, ex);
      }
  
  
  
    }System.exit(x);
    }
   
         

    // TODO overwrite start(), stop() and destroy() methods
}
