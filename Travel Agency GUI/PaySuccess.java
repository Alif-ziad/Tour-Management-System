import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PaySuccess extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel;
    private Font f1, f2;
    private ImageIcon logo;
    private JButton btn1, nBtn;
    private Cursor cursor;
    JLabel background;
    ImageIcon image;
    

    PaySuccess() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tour Management");
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // // Logo
        // logo = new ImageIcon(getClass().getResource("/images/paymentdone.png"));
        // imgLabel = new JLabel(logo);
        // imgLabel.setBounds(40, 40, logo.getIconWidth(), logo.getIconHeight());
        // c.add(imgLabel);

        // logo = new ImageIcon(getClass().getResource("/images/happy.jpg"));
        // imgLabel = new JLabel(logo);
        // imgLabel.setBounds(20, 40, logo.getIconWidth(), logo.getIconHeight());
        // c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        // label1 = new JLabel();
        // label1.setText("Your Payment Has");
        // label1.setBounds(380, 80, 500, 50);
        // label1.setFont(f1);
        // c.add(label1);

        // label1 = new JLabel();
        // label1.setText("Successfully Completed.");
        // label1.setBounds(380, 130, 500, 50);
        // label1.setFont(f1);
        // c.add(label1);

        // label1 = new JLabel();
        // label1.setText("Happy Travel🧳✈️");
        // label1.setBounds(420, 250, 500, 50);
        // label1.setFont(f1);
        // c.add(label1);
        
        // image = new ImageIcon("./images/pp.jpeg");
        // background = new JLabel();
        // background.setBounds(0, 0, 900, 450);
        // background.setIcon(image);
        // c.add(background);
        
        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        btn1 = new JButton("Finish");
        btn1.setBounds(350, 360, 300, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.decode("#2E75B6"));
        c.add(btn1);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        image = new ImageIcon("./images/happy1.jpeg");
        background = new JLabel();
        background.setBounds(0, 0, 1000, 500);
        background.setIcon(image);
        c.add(background);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {

        PaySuccess frame = new PaySuccess();
        frame.setVisible(true);
    }
}
