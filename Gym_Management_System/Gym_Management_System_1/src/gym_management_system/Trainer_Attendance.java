/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_management_system;

/**
 *
 * @author nidhi kushwaha
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Trainer_Attendance extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5;
    Choice ch1,ch2,ch3;
    Font f1,f2;
    JButton bt1,bt2;
    JPanel p1,p2;

    Trainer_Attendance(){
        super("Trainer attendance");
        setLocation(70,10);
        setSize(400,250);
        setResizable(false);

        f1=new Font("Lucida fax",Font.BOLD,25);
        f2=new Font("Ms UI Cothic",Font.BOLD,18);

        l1 = new JLabel("Trainer ID");
        l2 = new JLabel("Morning Time");
        l3 = new JLabel("Evening Time");
        l4 = new JLabel("Trainer Attendance");

        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.YELLOW);

        l4.setFont(f1);
        l4.setHorizontalAlignment(JLabel.CENTER);

        l1.setFont(f2);
        l2.setFont(f2);
        l3.setFont(f2);

        ch1 = new Choice();
        ch1.add("Absent");
        ch1.add("Present");

        ch2 = new Choice();
        ch2.add("Absent");
        ch2.add("present");

        ch3 = new Choice();
        try {
            ConnectionClass obj = new ConnectionClass();
            String q = "select tid from add_trainer";
            ResultSet rest = obj.stm.executeQuery(q);
            while (rest.next()){
                ch3.add(rest.getString("tid"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ch1.setFont(f2);
        ch2.setFont(f2);
        ch3.setFont(f2);

        bt1 = new JButton("Submit");
        bt2 = new JButton("Cancel");

        bt1.setBackground(Color.BLACK);
        bt2.setBackground(Color.BLACK);

        bt1.setForeground(Color.WHITE);
        bt2.setForeground(Color.RED);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        bt1.setFont(f2);
        bt2.setFont(f2);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(4,2,10,10));
        p1.add(l1);
        p1.add(ch3);
        p1.add(l2);
        p1.add(ch1);
        p1.add(l3);
        p1.add(ch2);
        p1.add(bt1);
        p1.add(bt2);
        p1.setBackground(Color.BLACK);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.add(l4);
        p2.setBackground(Color.BLACK);

        setLayout(new BorderLayout(0,0));
        add(p2,"North");
        add(p1,"Center");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tid = ch3.getSelectedItem();
        String morn_atte = ch1.getSelectedItem();
        String eve_atte = ch2.getSelectedItem();
        String date = new  java.util.Date().toString();
        if (e.getSource()==bt1){
            try {
                ConnectionClass obj1 = new ConnectionClass();
                String q1 = "insert into trainer_attendance values('"+tid+"','"+morn_atte+"','"+eve_atte+"','"+date+"')";
                obj1.stm.executeUpdate(q1);

                JOptionPane.showMessageDialog(null,"Insert data successfully");
                setVisible(false);

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (e.getSource()==bt2){

            JOptionPane.showMessageDialog(null,"Are You Sure......?");
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Customer_Attendance().setVisible(true);
    }
}
