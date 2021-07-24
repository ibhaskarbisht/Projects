package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class login  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    login(){

        f=new JFrame("Login");

        f.setBackground(null);
        f.setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(400,220,300,30);
        l1.setFont(new Font("Arial",Font.BOLD,20));
        f.add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(400,270,300,30);
        l2.setFont(new Font("Arial",Font.BOLD,20));
        f.add(l2);
 
        t1=new JTextField();
        t1.setBounds(550,220,150,30);
        t1.setFont(new Font("Arial",Font.BOLD,15));
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(550,270,150,30);
        f.add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
//        f.add(l3);


        b1 = new JButton("Login");
        b1.setBounds(500,340,120,50);
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.addActionListener(this);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.WHITE);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(640,340,120,50);
        b2.setFont(new Font("Arial",Font.BOLD,20));
        b2.setBackground(Color.blue);
        b2.setForeground(Color.WHITE);
        f.add(b2);

        b2.addActionListener(this);
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1200,700);
        f.setLocation(600,400);

    }

    public void actionPerformed(ActionEvent ae){

        try{
            conn c1 = new conn();
            String u = t1.getText();
           
			String v = t2.getText();
            
            String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){
                new details().f.setVisible(true);
                JOptionPane.showMessageDialog(null,"Login Succesfull !");
                f.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Wrong Password or Username");
                f.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        login l=new login();
        
    }
}