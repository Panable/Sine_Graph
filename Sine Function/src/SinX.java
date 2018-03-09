import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import static java.lang.Math.*;

public class SinX extends Component {
    
    public void paint(Graphics g)
    {
        g.drawLine(0,350,900,350); // x-axis
        g.drawLine(450,0,450,900); // y-axis
        
        g.setColor(Color.red);
        
        for(double x=-450;x<=450;x=x+0.5)
        {
            double y = 50 * cos(x*(3.1415926/180));
            int Y = (int)y;
            int X = (int)x;
            g.drawLine(450+X,350-Y,450+X,350-Y);
        }
    }
}
