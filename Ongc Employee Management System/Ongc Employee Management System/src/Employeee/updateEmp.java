package Employeee;

import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import java.awt.event.*;

class updateEmp extends addEmp implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b,b1,b2,b3; 
    String id_emp,prevLocation="",currentLocation="";
    int prev,prevCount=0,currentCount = 0;
    String location;
    updateEmp(String idaa){
        super(0);
        f=new JFrame("Update ONGC Employee Details");
        f.setVisible(true);
        f.setSize(1000,600);
        f.setLocation(500,450);
        f.setBackground(Color.white);
        f.setLayout(null);
        id_emp=idaa;    
        id15=new JLabel();
        id15.setBounds(0,0,900,500);
        id15.setLayout(null);
//        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/addEmp.jpg"));
//        id15.setIcon(img);

        id8 = new JLabel("Update Employee Details");
        id8.setBounds(180,10,800,50);
        id8.setFont(new Font("Arial",Font.ITALIC,40));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);


        id1 = new JLabel("Name:");  
        id1.setBounds(50,100,100,30);
        id1.setFont(new Font("Arial",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(250,100,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name:");
        id2.setBounds(470,100,200,30);
        id2.setFont(new Font("Arial",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(670,100,150,30);
        id15.add(t2);

        id3= new JLabel("Location:");
        id3.setBounds(50,150,150,30);
        id3.setFont(new Font("Arial",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(250,150,150,30);
        id15.add(t3);

        id4= new JLabel("Mobile No:");
        id4.setBounds(470,150,200,30);
        id4.setFont(new Font("Arial",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(670,150,150,30);   
        id15.add(t4);

        id5= new JLabel("Email Id:");
        id5.setBounds(50,200,100,30);
        id5.setFont(new Font("Arial",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(250,200,150,30);
        id15.add(t5);

        id6= new JLabel("Salary:");
        id6.setBounds(470,200,100,30);
        id6.setFont(new Font("Arial",Font.BOLD,20));    
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(670,200,150,30);
        id15.add(t6);

        id7= new JLabel("Job Post:");
        id7.setBounds(50,250,200,30);
        id7.setFont(new Font("Arial",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(250,250,150,30);
        id15.add(t7);

        id9= new JLabel("Date of Joining:");
        id9.setBounds(470,250,200,30);  
        id9.setFont(new Font("Arial",Font.BOLD,20));
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(670,250,150,30);
        id15.add(t8);

        id10= new JLabel("Employee Id:");
        id10.setBounds(50,300,150,30);
        id10.setFont(new Font("Arial",Font.BOLD,20));
        id15.add(id10);
        f.setVisible(false);
        t9=new JTextField();
        t9.setBounds(250,300,150,30);
        id15.add(t9);

        b=new JButton("update");
        b.setBounds(350,400,100,30);
        b.addActionListener(this);
        id15.add(b);

        b1=new JButton("Cancel");
        b1.setBounds(550,400,100,30);
        b1.addActionListener(this);
        id15.add(b1);
        



        showData(idaa);
    }

    int i=0;
    String age,dat;

    void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from employee where emp_id = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                f.setVisible(true);
                i=1;

                t1.setText(rs.getString(1));
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(5));
                t4.setText(rs.getString(6));
                t5.setText(rs.getString(7));
                t6.setText(rs.getString(8));
                t7.setText(rs.getString(9));
                t8.setText(rs.getString(10));
                t9.setText(rs.getString(11));
               
                
                prevLocation = t3.getText();
                String ex = "select * from ongc where location = '" + prevLocation + "'";
                ResultSet rs2 = con.s.executeQuery(ex);
              
                if(rs2.next())
                {
                	  prevCount = rs2.getInt(2);
//                      if(prevCount!=0)
                      	prevCount = prevCount - 1;
                      
//                      JOptionPane.showMessageDialog(null,""+prevCount+" "+prevLocation);
                }
                ex = "update ongc set count='"+prevCount+"' where location='"+prevLocation+"'";
                JOptionPane.showMessageDialog(null,""+prevCount+" "+prevLocation);
                con.s.executeUpdate(ex);
                age=rs.getString(3);
                dat=rs.getString(4);
                location = rs.getString(5);
              
            }
            if(i==0)
            {
                JOptionPane.showMessageDialog(null,"Id not found");
            new details();
            }
        }catch(Exception ex){}
        f.setVisible(true);
        f.setSize(1000,600);
        f.setLocation(600,250);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b && i==1){
            try{
                conn con = new conn();
               
                String temp = "update employee set name='"+t1.getText()+"',fname='"+t2.getText()+"',address='"+t3.getText()+"',phone='"+t4.getText()+"',email='"+t5.getText()+"',salary='"+t6.getText()+"',post='"+t7.getText()+"',doj='"+t8.getText()+"',doj='"+t8.getText()+"',emp_id='"+t9.getText()+"' where emp_id='"+id_emp+"'";
                con.s.executeUpdate(temp);
                currentLocation = t3.getText();
                SimpleDateFormat doj = new SimpleDateFormat("dd-mm-yyyy");
                java.util.Date udoj = doj.parse(t8.getText());
                java.sql.Date last = new java.sql.Date(udoj.getTime());
                
                temp = "insert into transfer values('"+id_emp+"','"+t3.getText()+"','"+last+"')";
                con.s.executeUpdate(temp);
                
                currentLocation = t3.getText();
                
                String ex = "select * from ongc where location = '" + currentLocation + "'";
                ResultSet rs2 = con.s.executeQuery(ex);
                
                if(rs2.next())
                {
                	currentCount = rs2.getInt(2);
                    currentCount++;
                }
                else
                {
                	currentCount = 1;
                	ex =  "insert into ongc values('"+currentLocation+"','"+currentCount+"')";
                	con.s.executeUpdate(ex);
                }
                ex = "update ongc set count='"+currentCount+"' where location='"+currentLocation+"'";
                con.s.executeUpdate(ex);
                
                JOptionPane.showMessageDialog(null,"Successfully Updated");
                f.setVisible(false);
                new Search_Employee();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            details d=new details();
        }
    }

    public static void main(String[] arg){
        new updateEmp("Update Employee");
    }
}