package gym_management_system;

import gym_management_system.ConnectionClass;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class TrainerFeeStructure extends JFrame implements ActionListener {
    String x[] ={"Trainer Id","Name","Catagory","Fees"};
    JButton bt;
    JPanel p1,p2,p3;
    JLabel l1,l2;
    JTextField tf1;
    Font f1,f2;
    String y[][]= new String[50][13];
    int i=0,j=0;
    JTable t;
    Font f;

    TrainerFeeStructure()
    {
        super("Fitness Center || Trainer Fee Information");
        setSize(1000,400);
        setLocation(1,1);
        f= new Font("MS UI GOTHIC",Font.BOLD,15);
        try
        {
            ConnectionClass obj = new ConnectionClass();
            String q= "select * from fee_trainer";
            ResultSet rest = obj.stm.executeQuery(q);
            while (rest.next())
            {
                y[i][j++]=rest.getString("tid");
                y[i][j++]=rest.getString("name");
                y[i][j++]=rest.getString("catagory");
                y[i][j++]=rest.getString("fees");
                
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

        l1= new JLabel("Delete any Trainer Fee Structure ?");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(f1);
        l1.setForeground(Color.yellow);

        p1= new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);

        tf1= new JTextField();
        bt=new JButton("Delete Trainer");
        tf1.setFont(f);
        bt.setFont(f);

        bt.addActionListener(this);
        bt.setBackground(Color.BLACK);
        bt.setForeground(Color.RED);
        
        l2= new JLabel("Trainer ID");
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

    /**
     *
     * @param e
     */
    @Override
  public void actionPerformed(ActionEvent e)
  {
      int id=Integer.parseInt(tf1.getText());
      if(e.getSource()==bt)
      {
          try
          {
            ConnectionClass obj1= new ConnectionClass();
            String q=" delete from fee_trainer where tid='"+id+"' ";
            obj1.stm.executeUpdate(q);
            setVisible(false); 
            new TrainerFeeStructure().setVisible(true);
          }
          catch (SQLException evx)
          {
          }
      }
  }
  public static void main(String args[])
  {
      new TrainerFeeStructure().setVisible(true);
  }
}










