package Employeee;
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class starting implements ActionListener{
    JFrame f; 
    JLabel id,l1;
    JButton b;

    starting(){
 
        f=new JFrame("ONGC Employee Management System");
        f.setBackground(Color.pink);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/ongc.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,480,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);     
        l1.setBounds(240,100,1000,530);
        f.add(l1);
        
        
        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Arial",Font.BOLD,30));
        b.setBounds(430,630,600,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("ONGC EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("Arial",Font.BOLD,55));
        lid.setForeground(Color.pink);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
//        f.getContentPane().setBackground(Color.WHITE);

        
//next 3 lines are for setting up the frame
        f.setVisible(true);
        f.setSize(1500,800);
        f.setLocation(530,200);

        while(true){
            lid.setVisible(false); // lid =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){} 
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }

    public static void main(String[] args){
        starting f = new starting();
    }
}