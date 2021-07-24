package Employeee;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


class addEmp implements ActionListener{

    private static final boolean SELECT = false;
	JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;

    addEmp(int i){}
    
    addEmp(){
        f = new JFrame("ONGC Add Employee");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
//        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/addEmp.jpg"));
//        id15.setIcon(img);

        id8 = new JLabel("ONGC ADD EMPLOYEE");
        id8.setBounds(380,30,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(250,150,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(500,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(750,150,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(250,200,150,30);
        id15.add(t3);

        id4= new JLabel("Date Of Birth");  
        id4.setBounds(500,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(750,200,150,30);
        id15.add(t4);

        id5= new JLabel("Location");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(250,250,150,30);
        id15.add(t5);

        id6= new JLabel("Mobile Number");
        id6.setBounds(500,250,200,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(750,250,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(250,300,150,30);
        id15.add(t7);

        id9= new JLabel("Salary");
        id9.setBounds(500,300,200,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(750,300,150,30);
        id15.add(t8);

        id10= new JLabel("Employee Post");
        id10.setBounds(50,350,200,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(250,350,150,30);
        id15.add(t9);


        id11= new JLabel("Date of Joining");
        id11.setBounds(500,350,200,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);
        
        t10=new JTextField();
        t10.setBounds(750,350,150,30);
        id15.add(t10);
        
        t10.setText("DD-MM-YYYY");

        id12= new JLabel("Employee Id");
        id12.setBounds(50,400,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(250,400,150,30);
        id15.add(t11);

        

        lab=new JLabel();
        lab.setBounds(200,450,250,200);
	id15.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
        id15.add(lab1);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(330,550,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(530,550,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(1100,800);
        f.setLocation(700,250);
    }

    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        e = e.toLowerCase();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into employee values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
                
                String check = "select * from ongc where location = '" + e + "'";
                
                SimpleDateFormat doj = new SimpleDateFormat("dd-mm-yyyy");
                java.util.Date udoj = doj.parse(j);
                java.sql.Date last = new java.sql.Date(udoj.getTime());
                String check3 = "insert into transfer values( '"+Integer.parseInt(k)+"', '"+e+"','"+last+"')";
                cc.s.executeUpdate(q);
                cc.s.executeUpdate(check3);
                ResultSet abc = cc.s.executeQuery(check);
                if(abc.next())
                {
                	
                	int prevCount = abc.getInt(2);
                	int ans = prevCount+1;
        String check2 = "update ongc set count = '" + ans + "'" + "where location = '" +e + "'";
                	cc.s.executeUpdate(check2);
                	
                }
                else
                {
                	int mmm = 1;
                	String forongc = "insert into ongc values('"+e+"','"+mmm+"')";
                	cc.s.executeUpdate(forongc);
                }
                JOptionPane.showMessageDialog(null,"Details Successfully Added");
                f.setVisible(false);
                new details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new details();
        }
    }
    public static void main(String[ ] arg){
        new addEmp();
    }
}