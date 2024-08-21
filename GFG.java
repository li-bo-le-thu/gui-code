// Java program using label (swing)
// to display the message “GFG WEB Site Click”
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.*;
import javax.swing.*;




// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)throws Exception 
    {
        // its complicated  and creating two jframes 
        ///MyIcon();  
        
		
        // Creating instance of JFrame
        JFrame frame = new JFrame();

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             //// title 
        frame.setTitle("Flappy Bird");
        /// icon 
        Image icon = Toolkit.getDefaultToolkit().getImage("flappyimg.jpg");  
        frame.setIconImage(icon);  
        


        // Creating instance of JButton
        JButton button = new JButton(" Shop");

        // x axis, y axis, width, height
        button.setBounds(300,500,100,60);

        ///  customizing the buttoon. 
        button.setFont(new Font("Arial",Font.BOLD,18));

        // adding button in JFrame
        frame.add(button);
        //././


        JButton button2 = new JButton(" Settings");

        // x axis, y axis, width, height
        button2.setBounds(100,500 , 100, 60);


        // customizing the button 
        button2.setFont(new Font("Arial",Font.BOLD,18));

        // adding button in JFrame
        frame.add(button2);

        //// jdialog for help button 
		// creating  a play button 
		JButton button3 = new JButton ("Play");
		
		//x axis, y axis, width, height
		button3.setBounds(200,250,100,60);
		
		// customizing button3 
		button3.setFont(new Font("Arial",Font.BOLD,18));
		frame.add(button3);
		

        



        // 400 width and 500 height
        frame.setSize(500, 700);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);





        //// backgrounddddd 

        //read the image
        BufferedImage image = ImageIO.read(new File("flappyimg2.jpg"));
        //get the Graphics object
        Graphics g = image.getGraphics();
        //set font
        g.setFont(g.getFont().deriveFont(25f));
        //display the text at the coordinates(x=50, y=150)
        g.drawString("Welcome To WayToLearnX!", 50, 150);
        g.dispose();
        //write the image
        ImageIO.write(image, "jpg", new File("flappyimg2.jpg"));

    }
    public void actionPerformed(ActionEvent e) {

    }

   

    


    



}
