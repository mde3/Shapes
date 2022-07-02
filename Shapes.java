import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Shapes extends JFrame{

    public Shapes(){
        setTitle("DRAWING SHAPES IN JAVA");
        setSize(800,600); //sets frame size 
        setLocationRelativeTo(null); //centers GUI
        setResizable(false); //sets window size to be unminimizable
        setDefaultCloseOperation(EXIT_ON_CLOSE); //closes the window
        setVisible(true); //displays frame on the screen
    }

    public void paint(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        
        int options = Integer.parseInt(JOptionPane.showInputDialog(null, "SELECT ANY OPTION BELOW \n 1. RECTANGLE \n 2. CIRCLE \n 3. SQUARE \n 4. TRIANGLE \n 5. EXIT \n"));
        
        switch (options) {

            //rectangle
            case 1:
                int width = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER THE WIDTH \n RANGE 1 - 20"));
                if(width>20){
                    JOptionPane.showMessageDialog(null, "ENTER THE WIDTH IN THE GIVEN RANGE");
                    System.exit(0);
                }
                if(width<1){
                    JOptionPane.showMessageDialog(null, "WIDTH CAN'T BE LESS THAN 1cm");
                    System.exit(0);
                }
                int height = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER THE HEIGHT \n RANGE 1 - 15"));
                if(height>15){
                    JOptionPane.showMessageDialog(null, "ENTER THE HEIGHT IN THE GIVEN RANGE");
                    System.exit(0);
                }
                if(height<1){
                    JOptionPane.showMessageDialog(null, "HEIGHT CAN'T BE LESS THAN 1cm");
                    System.exit(0);
                }
                if(width == height){
                    JOptionPane.showMessageDialog(null, "HEIGHT CAN'T BE EQUAL TO WIDTH");
                    JOptionPane.showMessageDialog(null, "HINT: \n \n CHOOSE THE OPTION TO DRAW A SQUARE");
                    System.exit(0);
                }
                g2d.setStroke(new BasicStroke(10));
                g2d.setColor(new Color(200,150,30));
                g2d.fillRect((800-(width*38))/2, (600-(height*38))/2, width*38, height*38);
            break;

            //circle
            case 2:
                int diameter = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER THE DIAMETER \n Rangle 1 - 15"));
                if(diameter>15){
                    JOptionPane.showMessageDialog(null, "ENTER THE DIAMETER IN THE GIVEN RANGE");
                    System.exit(0);
                }
                if(diameter<1){
                    JOptionPane.showMessageDialog(null, "DIAMETER CAN'T BE LESS THAN 1cm");
                    System.exit(0);
                }
                g2d.setColor(Color.BLUE);
                g2d.fillOval((800-(diameter*38))/2, (600-(diameter*38))/2, diameter*38, diameter*38);
            break;

            //sqaure
            case 3:
                int widthsquare = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER THE WIDTH \n RANGE 1 - 20"));
                if(widthsquare>20){
                    JOptionPane.showMessageDialog(null, "ENTER THE WIDTH IN THE GIVEN RANGE");
                    System.exit(0);
                }
                if(widthsquare<1){
                    JOptionPane.showMessageDialog(null, "WIDTH CAN'T BE LESS THAN 1cm");
                    System.exit(0);
                }
                int heightsquare = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER THE HEIGHT \n RANGE 1 - 20"));
                if(heightsquare>20){
                    JOptionPane.showMessageDialog(null, "ENTER THE HEIGHT IN THE GIVEN RANGE");
                    System.exit(0);
                }
                if(heightsquare<1){
                    JOptionPane.showMessageDialog(null, "HEIGHT CAN'T BE LESS THAN 1cm");
                    System.exit(0);
                }
                if(widthsquare != heightsquare){
                    JOptionPane.showMessageDialog(null, "WIDTH AND HEIGHT HAVE TO BE EQUAL");
                    JOptionPane.showMessageDialog(null, "HINT: \n \n CHOOSE THE OPTION TO DRAW A RECTANGLE");
                    System.exit(0);
                }
                g2d.setColor(new Color(255,0,0));
                g2d.fillRect((800-(widthsquare*38))/2, (600-(heightsquare*38))/2, widthsquare*38, heightsquare*38);  
            break;

            //triangle
            case 4:
                int base = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER THE BASE \n Range 1 - 20"));
                int Height = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER THE HEIGHT \n Range 1 - 20"));
                int [] x ={266-((base*38)/2), 400-(base*38), 800-(base*38)};
                int [] y ={233-((Height*38)/2), 350-((Height*38)/2), (700-(Height*38))/2};
                int npoints = 3;
                g2d.setColor(new Color(100,250,30));
                g2d.setStroke(new BasicStroke(10));
                g2d.fillPolygon(x, y, npoints);    
            break;
            
            //exit button to close the input dialog box
            case 5:
                System.exit(0);
            break;
                
            //error message incase user types a number that's unavailable
            default:
                JOptionPane.showMessageDialog(null, "ENTER THE CORRECT OPTION");
                System.exit(0);
            break;
        }
    }

    public static void main(String[] args) {
        new Shapes();
    }

}
