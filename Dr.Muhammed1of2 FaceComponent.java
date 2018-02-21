package javaapplication4;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D; //For face
import java.awt.Rectangle; //For eyes
import java.awt.geom.Line2D; //For mouth
import java.awt.Color; //For eye and mouth color
import java.awt.Graphics;
import java.awt.Graphics2D; //For drawing all shapes


public class FaceComponent extends JComponent{
    
    public void paintComponent (Graphics g){
            
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double head = new Ellipse2D.Double(5, 20, 500, 650);        
        g2.draw(head); //drawing face
    
        Rectangle eye = new Rectangle(115, 250, 50, 35);
        g2.setColor(Color.black);
        g2.fill(eye); //creating left eye
        eye.translate(250, 0);
        g2.fill(eye); //creating right eye
        
        Line2D.Double mouth = new Line2D.Double(115, 400, 400, 500);
        g2.setColor(Color.RED);
        g2.draw(mouth); //drawing mouth
        
        g2.drawString("By: Anil Muhammed", 115, 700);
    }
    
}
