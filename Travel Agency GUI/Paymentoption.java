import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Handler;

public class Paymentoption extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, label2, label3, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private ImageIcon logo, img1, img2,img3,img4;
    private JTextField tf1, tf2, tf3;
    private JPasswordField pf;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton Card, MobileBanking;
    private ButtonGroup radioButtonGroup;
    private int defPack = 0;

    Paymentoption() {
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

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/payment.jpeg"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // img1 = new ImageIcon(getClass().getResource("/images/VisaCard.png"));
        // imgLabel = new JLabel(img1);
        // imgLabel.setBounds(620, 90, img1.getIconWidth(), img1.getIconHeight());
        // c.add(imgLabel);

        // img2 = new ImageIcon(getClass().getResource("/images/MasterCard.png"));
        // imgLabel = new JLabel(img2);
        // imgLabel.setBounds(705, 90, img2.getIconWidth(), img2.getIconHeight());
        // c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);
        f4 = new Font("Segoe UI", Font.PLAIN, 15);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 15);
        f6 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Selct your Payment Option");
        label1.setBounds(400, 20, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        //Card redio Button
        Card = new JRadioButton("Card");
        Card.setBounds(400, 120, 150, 50);
        Card.setFont(f2);
        Card.setCursor(cursor);
        Card.setBackground(Color.decode("#F2F2F2"));
        c.add(Card);

        // MobileBanking Radio Button
        MobileBanking = new JRadioButton("MobileBanking ");
        MobileBanking.setBounds(400, 200, 211, 50);
        MobileBanking.setFont(f2);
        MobileBanking.setCursor(cursor);
        MobileBanking.setBackground(Color.decode("#F2F2F2"));
        c.add(MobileBanking);

        // To group radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(Card);
        radioButtonGroup.add(MobileBanking);

        img1 = new ImageIcon(getClass().getResource("/images/VisaCard.png"));
        imgLabel = new JLabel(img1);
        imgLabel.setBounds(610, 120, img1.getIconWidth(), img1.getIconHeight());
        c.add(imgLabel);

        img2 = new ImageIcon(getClass().getResource("/images/MasterCard.png"));
        imgLabel = new JLabel(img2);
        imgLabel.setBounds(715, 120, img2.getIconWidth(), img2.getIconHeight());
        c.add(imgLabel);

        img3 = new ImageIcon(getClass().getResource("/images/bkash1.png"));
        imgLabel = new JLabel(img3);
        imgLabel.setBounds(610, 200, img1.getIconWidth(), img1.getIconHeight());
        c.add(imgLabel);

        img4 = new ImageIcon(getClass().getResource("/images/nagad1.png"));
        imgLabel = new JLabel(img4);
        imgLabel.setBounds(715, 200, img2.getIconWidth(), img2.getIconHeight());
        c.add(imgLabel);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(75, 325, 190, 50);
        btn1.setFont(f6);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(300, 325, 190, 50);
        btn2.setFont(f6);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.BLACK);
        btn2.setBackground(Color.decode("#2E75B6"));
        btn2.setEnabled (true);
        c.add(btn2);

        btn3 = new JButton("Next");
        btn3.setBounds(524, 325, 300, 50);
        btn3.setFont(f6);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        Handler handler = new Handler();
        Card.addActionListener(handler);
        MobileBanking.addActionListener(handler);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

         //back
         btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                DefPackTypes frame = new DefPackTypes();
                frame.setVisible(true);
            }
        });

        // next button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (defPack == 1) {
                    CardPayment frame = new CardPayment();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else if (defPack == 2) {
                    MobileBanking frame = new MobileBanking();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select tour type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Card) {
                defPack = 1;
            } else if (e.getSource() == MobileBanking) {
                defPack = 2;
            }
        }
    }


    public static void main(String[] args) {

        Paymentoption frame = new Paymentoption();
        frame.setVisible(true);
    }
}

