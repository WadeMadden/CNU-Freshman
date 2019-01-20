
/**
 * Write a description of class MyTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import	javax.swing.*;
import	java.awt.*;
public class MyTester
{
    public static void main(String [] args)
    {
        
        int ground = 400;
        BouncingBall ball = new BouncingBall(100, 50, 40, Color.green, ground);
        BouncingBall ball2 = new BouncingBall(50, 200, 10, Color.magenta, ground);
        
        Tester myTester = new Tester();
        myTester.bounce(ball, ball2);
        
        /*Canvas myFirstCanvas = new Canvas("Wade's Canvas");
        myFirstCanvas.setVisible(true);
        
        BouncingBall myBall = new BouncingBall(50, 50, 100,(Color.black),20);
        myBall.draw(myFirstCanvas);
        
        Canvas mySecondCanvas = new Canvas("Wade's Canvas2", 420, 250);
        mySecondCanvas.setVisible(true);
         
        Canvas myThirdCanvas = new Canvas("Wade's Canvas3", 320, 200, (Color.blue));
        myThirdCanvas.setVisible(true);
        */
    }
    
}
