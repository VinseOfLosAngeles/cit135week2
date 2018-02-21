package javaapplication4;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class JavaApplication4 {

    public static void main(String[] args) {

        FaceComponent component = new FaceComponent();
        
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setTitle("My first frame - Anil Muhammed");
        frame.add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    
}
