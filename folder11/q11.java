import java.applet.*;
import java.awt.*;

public class q11 extends Applet {

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.fillOval(100, 100, 200, 200);
    g.setColor(Color.black);
    g.fillOval(150, 150, 20, 20);
    g.fillOval(230, 150, 20, 20);
    g.setColor(Color.red);
    g.fillOval(170, 200, 60, 30);
    g.setColor(Color.black);
    g.drawArc(170, 200, 60, 30, 180, 180);
    g.setColor(Color.black);
    g.drawLine(200, 200, 200, 250);
    g.setColor(Color.black);
    g.drawArc(150, 150, 100, 100, 0, 180);
  }

  public static void main(String[] args) {
    // initialize
    Frame f = new Frame("q11");
    q11 applet = new q11();
    f.add(applet);
    f.setSize(400, 400);
    f.setVisible(true);
    // applet.showStatus("Applet for active web page");
    applet.init();
    applet.start();
  }
}
