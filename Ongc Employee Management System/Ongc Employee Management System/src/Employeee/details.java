package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;

class details  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6;

    details(){
        f=new JFrame("ONGC Employee Details");
        f.setBackground(Color.black);
        f.setLayout(null);
        l1 = new JLabel();
        l1.setBounds(0,0,800,500);
        l1.setLayout(null);
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/details1.jpg"));
//        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("Employee Details");
        l2.setBounds(320,50,300,40);
        l2.setFont(new Font("Arial",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Add");
        b1.setBounds(220,100,200,40);
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("Search");
        b2.setBounds(430,100,200,40);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(220,160,200,40);
        b3.setFont(new Font("Arial",Font.BOLD,20));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(430,160,200,40);
        b4.setFont(new Font("Arial",Font.BOLD,20));
        b4.addActionListener(this);
        l1.add(b4);
        
        
        b5=new JButton("ONGC Offices");
        b5.setBounds(220,220,200,40);
        b5.setFont(new Font("Arial",Font.BOLD,20));
        b5.addActionListener(this);
        l1.add(b5);
        
        b6=new JButton("Transfer Details");
        b6.setBounds(430,220,220,40);
        b6.setFont(new Font("Arial",Font.BOLD,20));
        b6.addActionListener(this);
        l1.add(b6);

        f.setVisible(true);
        f.setSize(1000,600);
        f.setLocation(800,450);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new addEmp();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Search_Employee();
        }
        if(ae.getSource()==b5)
        {
//        	f.setVisible(false);
        	try {
				new Ongc_Details();
			} catch (HeadlessException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        if(ae.getSource()==b6){
            f.setVisible(false);
            new View_Employee2();
        }
    }

    public static void main(String[ ] arg){
        details d = new details();
    }
}
