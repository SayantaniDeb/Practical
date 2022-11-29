package folder12;

import java.applet.Applet;
import java.awt.Graphics;

public class Javaapp extends Applet {
   
    public void paint(Graphics g)
    {
        g.drawString("Applet started.", 100, 100);
        showStatus("This is shown in the status window.");
    }
}
