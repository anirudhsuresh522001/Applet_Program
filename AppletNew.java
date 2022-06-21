import java.applet.*;
import java.awt.*;

/*

    <applet code="AppletNew.class" height="300" width="500">
        <param name="name" value="Anirudh Suresh" />
        <param name="age" value="21" />
    </applet>

 */

public class AppletNew extends Applet {
    String n;
    String a;

    public void init() {
        n = getParameter("name");
        a = getParameter("age");
    }

    public void paint(Graphics g) {
        g.drawString("Hello World!", 20, 20);
        g.drawString("My Name is " + n, 20, 40);
        g.drawString("My age is " + a, 20, 60);
    }

}