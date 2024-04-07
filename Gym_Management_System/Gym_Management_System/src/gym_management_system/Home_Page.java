package gym_management_system;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Home_Page extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Font f,f1,f2;
    JPanel p1;
    Home_Page() {
        
        super("Home Page");
        setSize(1600, 900);
        setLocation(0, 0);
        f = new Font("Lucida Fax", Font.BOLD, 20);
        f2 = new Font("Gadugi", Font.BOLD, 35);
        f1 = new Font("MS UI Gothic", Font.BOLD, 18);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Home_Page.class.getResource("/images/ic5.png")));

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("gym_management_system/Icons/bg9.jpg"));
        Image img = ic.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);

        ImageIcon ic1 = new ImageIcon(img);
        l1 = new JLabel(ic1);

        JMenuBar m1 = new JMenuBar();
        JMenu men1 = new JMenu("Master");
        JMenuItem ment1 = new JMenuItem("Add Trainer");
        JMenuItem ment2 = new JMenuItem("Add Customer");

        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("images/member.png"));
        Image img2 = ic2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon ic3 = new ImageIcon(img2);
        ment1.setIcon(ic3);
        ment1.setMnemonic('T');
        ment1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));

        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource("images/add user.png"));
        Image img3 = ic4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ment2.setIcon(new ImageIcon(img3));
        ment2.setMnemonic('C');
        ment2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));


        JMenu men2 = new JMenu("Attendance");
        JMenuItem ment3 = new JMenuItem("Trainer Attendance");
        JMenuItem ment4 = new JMenuItem("Customer Attendance");
//
        ImageIcon ic5 = new ImageIcon(ClassLoader.getSystemResource("images/account.png"));
        Image img4 = ic5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment3.setIcon(new ImageIcon(img4));
        ment3.setMnemonic('A');
        ment3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
//
        ImageIcon ic6 = new ImageIcon(ClassLoader.getSystemResource("images/man.png"));
        Image img5 = ic6.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment4.setIcon(new ImageIcon(img5));
        ment4.setMnemonic('U');
        ment4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));


        JMenu men3 = new JMenu("Personal Information");
        JMenuItem ment5 = new JMenuItem("Trainer Information");
        JMenuItem ment6 = new JMenuItem("Customer Information");

        ImageIcon ic7 = new ImageIcon(ClassLoader.getSystemResource("images/update member.png"));
        Image img6 = ic7.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment5.setIcon(new ImageIcon(img6));
        ment5.setMnemonic('p');
        ment5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        ImageIcon ic8 = new ImageIcon(ClassLoader.getSystemResource("images/view pay.png"));
        Image img7 = ic8.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment6.setIcon(new ImageIcon(img7));
        ment6.setMnemonic('S');
        ment6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        JMenu men4 = new JMenu("Update Information");
        JMenuItem ment7 = new JMenuItem("Update Trainer");
        JMenuItem ment8 = new JMenuItem("Update Customer");

        ImageIcon ic9 = new ImageIcon(ClassLoader.getSystemResource("images/update.png"));
        Image img8 = ic9.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment7.setIcon(new ImageIcon(img8));
        ment7.setMnemonic('D');
        ment7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));

        ImageIcon ic10 = new ImageIcon(ClassLoader.getSystemResource("images/update member.png"));
        Image img9 = ic10.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment8.setIcon(new ImageIcon(img9));
        ment8.setMnemonic('M');
        ment8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));

        JMenu men5 = new JMenu("Fees Information");
        JMenuItem ment9 = new JMenuItem("Trainer Fees");
        JMenuItem ment10 = new JMenuItem("Customer Fees");

        ImageIcon ic11 = new ImageIcon(ClassLoader.getSystemResource("images/add fee.png"));
        Image img10 = ic11.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment9.setIcon(new ImageIcon(img10));
        ment9.setMnemonic('F');
        ment9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));

        ImageIcon ic12 = new ImageIcon(ClassLoader.getSystemResource("images/fees.png"));
        Image img11 = ic12.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment10.setIcon(new ImageIcon(img11));
        ment10.setMnemonic('T');
        ment10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));

        JMenu men6 = new JMenu("All Details");
        JMenuItem ment11 = new JMenuItem("Customer Fee Detail");
        JMenuItem ment12 = new JMenuItem("Trainer Fee Structure");
        JMenuItem ment14 = new JMenuItem("Trainer Attendence Detail");
        JMenuItem ment15 = new JMenuItem("Customer Attendence Detail");
        JMenuItem ment21 = new JMenuItem("View Fee Report");
        JMenuItem ment22 = new JMenuItem("View Member Report");

        ImageIcon ic13 = new ImageIcon(ClassLoader.getSystemResource("images/paymente.png"));
        Image img12 = ic13.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment11.setIcon(new ImageIcon(img12));
        ment11.setMnemonic('D');
        ment11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
//
        ImageIcon ic14 = new ImageIcon(ClassLoader.getSystemResource("images/pyment.png"));
        Image img13 = ic14.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment12.setIcon(new ImageIcon(img13));
        ment12.setMnemonic('y');
        ment12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
        
        ImageIcon ic20 = new ImageIcon(ClassLoader.getSystemResource("images/account.png"));
        Image img19 = ic20.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment14.setIcon(new ImageIcon(img19));
        ment14.setMnemonic('R');
        ment14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
//
        ImageIcon ic21 = new ImageIcon(ClassLoader.getSystemResource("images/man.png"));
        Image img20 = ic21.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment15.setIcon(new ImageIcon(img20));
        ment15.setMnemonic('O');
        ment15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

        ImageIcon ic22 = new ImageIcon(ClassLoader.getSystemResource("images/mothnly_fee.png"));
        Image img21 = ic22.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment21.setIcon(new ImageIcon(img21));
        ment21.setMnemonic('W');
        ment21.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
//
        ImageIcon ic23 = new ImageIcon(ClassLoader.getSystemResource("images/view reports.png"));
        Image img22 = ic23.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment22.setIcon(new ImageIcon(img22));
        ment22.setMnemonic('F');
        ment22.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));

        JMenu men7 = new JMenu("Exit");
        JMenuItem ment13 = new JMenuItem("Exit");
        ImageIcon ic15 = new ImageIcon(ClassLoader.getSystemResource("images/cancel.png"));
        Image img14 = ic15.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment13.setIcon(new ImageIcon(img14));
        ment13.setMnemonic('M');
        ment13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));

        JMenu men8 = new JMenu("Receipt Generat");
        JMenuItem ment16 = new JMenuItem("Receipt");
        JMenuItem ment17 = new JMenuItem("Message");

        ImageIcon ic16 = new ImageIcon(ClassLoader.getSystemResource("images/ediit.png"));
        Image img15 = ic16.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment16.setIcon(new ImageIcon(img15));
        ment16.setMnemonic('E');
        ment16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));

        ImageIcon ic17 = new ImageIcon(ClassLoader.getSystemResource("images/send Msz.png"));
        Image img16 = ic17.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment17.setIcon(new ImageIcon(img16));
        ment17.setMnemonic('B');
        ment17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        
        JMenu men9 = new JMenu("Products");
        JMenuItem ment18 = new JMenuItem("Show All");
        JMenuItem ment19 = new JMenuItem("Sell");
        JMenuItem ment20 = new JMenuItem("Add");

        ImageIcon ic18 = new ImageIcon(ClassLoader.getSystemResource("images/show.png"));
        Image img17 = ic18.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment18.setIcon(new ImageIcon(img17));
        ment18.setMnemonic('P');
        ment18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
//
        ImageIcon ic19 = new ImageIcon(ClassLoader.getSystemResource("images/sell.png"));
        Image img18 = ic19.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment19.setIcon(new ImageIcon(img18));
        ment19.setMnemonic('S');
        ment19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        
        ImageIcon ic24 = new ImageIcon(ClassLoader.getSystemResource("images/add product.png"));
        Image img23 = ic24.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment20.setIcon(new ImageIcon(img23));
        ment20.setMnemonic('S');
        ment20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        
        men1.add(ment1);
        men1.add(ment2);

        men2.add(ment3);
        men2.add(ment4);

        men3.add(ment5);
        men3.add(ment6);

        men4.add(ment7);
        men4.add(ment8);

        men5.add(ment9);
        men5.add(ment10);

        men6.add(ment11);
        men6.add(ment12);
        men6.add(ment14);
        men6.add(ment15);
        men6.add(ment21);
        men6.add(ment22);
        
        men7.add(ment13);

        men8.add(ment16);
        men8.add(ment17);

        men9.add(ment18);
        men9.add(ment19);
        men9.add(ment20);

        
        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men4);
        m1.add(men5);
        m1.add(men6);
        m1.add(men8);
        m1.add(men9);
        m1.add(men7);

        men1.setFont(f);
        men2.setFont(f);
        men3.setFont(f);
        men4.setFont(f);
        men5.setFont(f);
        men6.setFont(f);
        men7.setFont(f);
        men8.setFont(f);
        men9.setFont(f);

        ment1.setFont(f1);
        ment2.setFont(f1);
        ment3.setFont(f1);
        ment4.setFont(f1);
        ment5.setFont(f1);
        ment6.setFont(f1);
        ment7.setFont(f1);
        ment8.setFont(f1);
        ment9.setFont(f1);
        ment10.setFont(f1);
        ment11.setFont(f1);
        ment12.setFont(f1);
        ment13.setFont(f1);
        ment14.setFont(f1);
        ment15.setFont(f1);
        ment16.setFont(f1);
        ment17.setFont(f1);
        ment18.setFont(f1);
        ment19.setFont(f1);
        ment20.setFont(f1);
        ment21.setFont(f1);
        ment22.setFont(f1);
        
        m1.setBackground(Color.black);

        men1.setForeground(Color.WHITE);
        men2.setForeground(Color.WHITE);
        men3.setForeground(Color.WHITE);
        men4.setForeground(Color.WHITE);
        men5.setForeground(Color.WHITE);
        men6.setForeground(Color.WHITE);
        men7.setForeground(Color.RED);
        men8.setForeground(Color.WHITE);
        men9.setForeground(Color.WHITE);

        ment1.setBackground(Color.black);
        ment2.setBackground(Color.black);
        ment3.setBackground(Color.black);
        ment4.setBackground(Color.black);
        ment5.setBackground(Color.black);
        ment6.setBackground(Color.black);
        ment7.setBackground(Color.black);
        ment8.setBackground(Color.black);
        ment9.setBackground(Color.black);
        ment10.setBackground(Color.black);
        ment11.setBackground(Color.black);
        ment12.setBackground(Color.black);
        ment13.setBackground(Color.black);
        ment14.setBackground(Color.black);
        ment15.setBackground(Color.black);
        ment16.setBackground(Color.black);
        ment17.setBackground(Color.black);
        ment18.setBackground(Color.black);
        ment19.setBackground(Color.black);
        ment20.setBackground(Color.black);
        ment21.setBackground(Color.black);
        ment22.setBackground(Color.black);

        ment1.setForeground(Color.yellow);
        ment2.setForeground(Color.yellow);
        ment3.setForeground(Color.yellow);
        ment4.setForeground(Color.yellow);
        ment5.setForeground(Color.yellow);
        ment6.setForeground(Color.yellow);
        ment7.setForeground(Color.yellow);
        ment8.setForeground(Color.yellow);
        ment9.setForeground(Color.yellow);
        ment10.setForeground(Color.yellow);
        ment11.setForeground(Color.yellow);
        ment12.setForeground(Color.yellow);
        ment13.setForeground(Color.RED);
        ment14.setForeground(Color.yellow);
        ment15.setForeground(Color.yellow);
        ment16.setForeground(Color.yellow);
        ment17.setForeground(Color.yellow);
        ment18.setForeground(Color.yellow);
        ment19.setForeground(Color.yellow);
        ment20.setForeground(Color.yellow);
        ment21.setForeground(Color.yellow);
        ment22.setForeground(Color.yellow);
        
        ment1.addActionListener(this);
        ment2.addActionListener(this);
        ment3.addActionListener(this);
        ment4.addActionListener(this);
        ment5.addActionListener(this);
        ment6.addActionListener(this);
        ment7.addActionListener(this);
        ment8.addActionListener(this);
        ment9.addActionListener(this);
        ment10.addActionListener(this);
        ment11.addActionListener(this);
        ment12.addActionListener(this);
        ment13.addActionListener(this);
        ment14.addActionListener(this);
        ment15.addActionListener(this);
        ment16.addActionListener(this);
        ment17.addActionListener(this);
        ment18.addActionListener(this);
        ment19.addActionListener(this);
        ment20.addActionListener(this);
        ment21.addActionListener(this);
        ment22.addActionListener(this);
        
        setJMenuBar(m1);
        add(l1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String comnd = e.getActionCommand();
        if (comnd.equals("Add Trainer")) {
            new Add_Trainer().setVisible(true);
        } 
       else if (comnd.equals("Add Customer")) 
        {
            new Add_Customer().setVisible(true);
        } 
       else if (comnd.equals("Trainer Attendance"))
        {
            new Trainer_Attendance().setVisible(true);
        }
       else if (comnd.equals("Customer Attendance")) {
            new Customer_Attendance().setVisible(true);
        }
       else if 
              (comnd.equals("Trainer Information")) {
            new Trainer_Information().setVisible(true);
        } 
       else if (comnd.equals("Customer Information")) {
            new Customer_Information().setVisible(true);
        } 
       else if (comnd.equals("Update Trainer")) {
            new Update_Trainer().setVisible(true);
        }
       else if (comnd.equals("Update Customer")) {
            new Update_Customer().setVisible(true);
        }
       else if (comnd.equals("Trainer Fees")) {
            new Trainer_Fees().setVisible(true);
        } 
       else if (comnd.equals("Customer Fees")) {
            new Customer_Fees().setVisible(true);
        }
       else if (comnd.equals("Customer Fee Detail")) 
        {
            new FeeInformation().setVisible(true);
        } 
       else if (comnd.equals("Trainer Fee Structure"))
        {
            new TrainerFeeStructure().setVisible(true);
        } 
       else if (comnd.equals("Trainer Attendence Detail")) {
            new TrainerAttendence().setVisible(true);
        }  
       else if (comnd.equals("Customer Attendence Detail")) {
            new  Customerattendence().setVisible(true);
        }
       else if (comnd.equals("View Fee Report")) {
            new  Fee_Report().setVisible(true);
        }
       else if (comnd.equals("View Member Report")) {
            new  Member_Report().setVisible(true);
        }
       else if (comnd.equals("Receipt")) {
            new  receipt().setVisible(true);
        }
       else if (comnd.equals("Message")) {
            new  Message().setVisible(true);
        }
       else if (comnd.equals("Show All")) {
            new  Show_All_Product().setVisible(true);
        }
       else if (comnd.equals("Sell")) {
            new Sell_Product().setVisible(true);
        }
       else if (comnd.equals("Add")) {
            new  Add_Product().setVisible(true);
        }
       else if(comnd.equals("Exit")) {
            System.exit(0);
       }
    }


    public static void main(String[] args)
    {
        new Home_Page().setVisible(true);
    }
}
