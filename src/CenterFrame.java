import javax.swing.*;
import java.awt.*;
public class CenterFrame extends JFrame{
    CenterFrame(){
        Toolkit k=Toolkit.getDefaultToolkit();
        Dimension d=k.getScreenSize();
        int w=d.width;
        int h=d.height;
        System.out.println(w+" "+h);
        setSize(w/2,h/2);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CenterFrame();
    }
}