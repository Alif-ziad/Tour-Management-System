import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Welcome extends JFrame {

    private Container c;
    private ImageIcon icon, logo, welcome;
    private JLabel imgLabel,label1;
    private Font f1,f2;
    private JButton btn1, btn2,nBtn;
    private Cursor cursor;
    JLabel background;
    ImageIcon image;

    Welcome() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tour Management");
        this.setSize(900, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // // Logo and Images
        // logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        // imgLabel = new JLabel(logo);
        // imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
        // c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 25);
        f2 = new Font("Tahoma", Font.BOLD, 40);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

         // Title
         label1 = new JLabel();
         label1.setText("Welcome to our");
         label1.setBounds(150, 50, 500, 65);
         
         label1.setFont(f2);
         c.add(label1);
 
         label1 = new JLabel();
         label1.setText(" Travel Agency");
         label1.setBounds(210, 100, 500, 65);
         label1.setFont(f2);
         c.add(label1);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(150, 325, 215, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.black);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);


        btn2 = new JButton("Next");
        btn2.setBounds(440, 325, 215, 50);
        btn2.setFont(f1);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.black);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        
        image = new ImageIcon("./images/rah1.jpeg");
        background = new JLabel();
        background.setBounds(0, 0, 900, 450);
        background.setIcon(image);
        c.add(background);
        
        // Action Listener for JButtons
        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

       

        // Next Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        Welcome frame = new Welcome();
        frame.setVisible(true);
    }
}
