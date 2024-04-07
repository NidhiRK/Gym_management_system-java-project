package gym_management_system;

import gym_management_system.ConnectionClass;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class FeeInformation extends JFrame implements ActionListener {
    String x[] ={"Recipt No","Name","Catagory","Fees","Month","Trainer Name"};
    JButton bt;
    JPanel p1,p2,p3;
    JLabel l1,l2;
    JTextField tf1;
    Font f1,f2;
    String y[][]= new String[50][13];
    int i=0,j=0;
    JTable t;
    Font f;

    FeeInformation()
    {
        super("Fitness Center || Customer Fee Information");
        setSize(1200,400);
        setLocation(1,1);
        f= new Font("MS UI GOTHIC",Font.BOLD,15);
        try
        {
            ConnectionClass obj = new ConnectionClass();
            String q= "select * from pay_customer";
            ResultSet rest = obj.stm.executeQuery(q);
            while (rest.next())
            {
                y[i][j++]=rest.getString("recipt_no");
                y[i][j++]=rest.getString("name");
                y[i][j++]=rest.getString("catagory");
                y[i][j++]=rest.getString("fees");
                y[i][j++]=rest.getString("month");
                y[i][j++]=rest.getString("tname");
                
                i++;
                j=0;
            }
            t= new JTable(y,x);
            t.setFont(f);
            t.setBackground(Color.BLACK);
            t.setForeground(Color.WHITE);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        JScrollPane sp= new JScrollPane(t);

        f1= new Font("Lucida Fax",Font.BOLD,25);

        l1= new JLabel("Delete any Customer Fee Structure ?");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(f1);
        l1.setForeground(Color.yellow);

        p1= new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);

        tf1= new JTextField();
        bt=new JButton("Delete Customer ");
        tf1.setFont(f);
        bt.setFont(f);

        bt.addActionListener(this);
        bt.setBackground(Color.BLACK);
        bt.setForeground(Color.RED);
        
        l2= new JLabel("Customer Recipt No ");
        l2.setFont(f1);
        l2.setForeground(Color.GRAY);

        p2= new JPanel();
        p2.setLayout(new GridLayout(1,2,10,10));
        p2.add(l2);
        p2.add(tf1);
        p2.add(bt);

        p3=new JPanel();
        p3.setLayout(new GridLayout(2,1,10,10));
        p3.add(p1);
        p3.add(p2);

        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);

        add(p3,"South");
        add(sp);

    }
    @Override
  public void actionPerformed(ActionEvent e)
  {
      int id=Integer.parseInt(tf1.getText());
      if(e.getSource()==bt)
      {
          try
          {
            ConnectionClass obj1= new ConnectionClass();
            String q=" delete from pay_customer where recipt_no='"+id+"' ";
            obj1.stm.executeUpdate(q);
            setVisible(false); 
            new FeeInformation().setVisible(true);
          }
          catch (Exception evx)
          {
              evx.printStackTrace();
          }
      }
  }
  public static void main(String args[])
  {
      new FeeInformation().setVisible(true);
  }
}










