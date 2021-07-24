package Employeee;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.StyleConstants;

import java.awt.event.*;
import java.sql.*;

class showData implements ActionListener{
    JFrame f;
	JButton back;
	String t1="",t2="",t3="",t4="",t5="",t6="",t7="",t8="",t9="",t10="",doj1="",doj2="",doj3="",doj4="",doj5="",
	doj6="",doj7="",doj8="",doj9="",doj10="";
	int dehradun=0,delhi=0,agartala=0,ahmedabad=0,ankleshwar=0,cambay_asset=0,chennai=0,goa=0,jodhpur=0,hazira=0,
jorhat=0,kakinada=0,karaikal=0,kolkata=0,bokaro=0,bhubaneswar=0,mehsana=0,mumbai=0,navi_mumbai=0,nazira=0,rajahmundry=0,silchar=0,uran=0,
vadodara=0;
	ResultSet rs=null;
    showData(String emp_id) throws HeadlessException, SQLException
    {
    	
        try{
            
        	conn con = new conn();
//            String temp = "select * from transfer where id = '"+emp_id+"'";
            String temp = "select * from transfer where id = '"+emp_id+"'order by doj asc";
//        	String temp = "select *from transfer where id = ?";
//        	
//          	 String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
//     	    String DB_URL = "jdbc:mysql://localhost:3306/bb";
//     	    String USER = "root";
//     	    String PASS = "insert_password"; 
//
//     	  Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
//     	  
//     	  PreparedStatement stmt = connection.prepareStatement(temp);
//     	  stmt.setInt(1,Integer.parseInt(emp_id));
            rs = con.s.executeQuery(temp);
           
           

            int current = 1;
            while(rs.next())
            {

 
            		if(current==1)
            		{
            			t1 = rs.getString(2);
            			doj1 = rs.getString(3);
            		}
            		else if(current==2)
            		{
            			t2 = rs.getString(2);
                		doj2 = rs.getString(3);
            		}
            		else if(current==3)
            		{
                		t3 = rs.getString(2);
            		doj3 = rs.getString(3);
            		}
            		else if(current==4)
            		{
            			t4 = rs.getString(2);
            			doj4 = rs.getString(3);
            		}
            		
            		else if(current==5)
            		{
            			t5 = rs.getString(2);
                		doj5 = rs.getString(3);
            		}
            		else if(current==6)
            		{
            			t6 = rs.getString(2);
                		doj6 = rs.getString(3);
            		}
            		else if(current==7)
            		{
            			t7 = rs.getString(2);
                		doj7 = rs.getString(3);
            		}
            		else if(current==8)
            		{
            			t8 = rs.getString(2);
                		doj8 = rs.getString(3);
            		}
            		else if(current==9)
            		{
            			t9 = rs.getString(2);
                		doj9 = rs.getString(3);
            		}
            		else if(current==10)
            		{
            			t10 = rs.getString(2);
                		doj10 = rs.getString(3);
            		}
            		current++;
            	
            }
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
 
        f=new JFrame("ONGC Employee Transfer Details");
      
        
        JLabel heading = new JLabel("ONGC Employee Transfer Details ID = "+emp_id);
        heading.setBounds(750,20,1250,90);
        heading.setFont(new Font("Arial",Font.ITALIC,50));
        heading.setForeground(Color.red);
        f.add(heading);
        
        
        /////////////////////////////////////////////////////////////////////Dehradun
        
        JLabel a = new JLabel("Transfer - 1 ");
        a.setBounds(600,200,400,50);
        a.setFont(new Font("Arial",Font.BOLD,50));
        a.setHorizontalAlignment(JTextField.LEFT);
        f.add(a);
        
        
        JTextField at = new JTextField();
        at.setBounds(1400,200,300,50);
        f.add(at);
        at.setText(t1);
        
//       ddnt.setText(Integer.toString(dehradun));
       at.setFont(new Font("Arial",Font.ITALIC,25));
       at.setHorizontalAlignment(JTextField.CENTER);
       
       
       JTextField att = new JTextField();
       att.setBounds(1800,200,300,50);
       f.add(att);
       att.setText(doj1);
       
//      ddnt.setText(Integer.toString(dehradun));
      att.setFont(new Font("Arial",Font.ITALIC,25));
      att.setHorizontalAlignment(JTextField.CENTER);
        
        
       JLabel a2 = new JLabel("Transfer - 2 ");
       a2.setBounds(600,300,400,50);
       a2.setFont(new Font("Arial",Font.BOLD,50));
       a2.setHorizontalAlignment(JTextField.LEFT);
       f.add(a2);

       
       JTextField at2 = new JTextField();
       at2.setBounds(1400,300,300,50);
       f.add(at2);
       at2.setText(t2);
       
      at2.setFont(new Font("Arial",Font.ITALIC,25));
      at2.setHorizontalAlignment(JTextField.CENTER);
      
      
      JTextField att2 = new JTextField();
      att2.setBounds(1800,300,300,50);
      f.add(att2);
      att2.setText(doj2);
      
//     ddnt.setText(Integer.toString(dehradun));
     att2.setFont(new Font("Arial",Font.ITALIC,25));
     att2.setHorizontalAlignment(JTextField.CENTER);
     
     
      
      JLabel a3 = new JLabel("Transfer - 3 ");
      a3.setBounds(600,400,400,50);
      a3.setFont(new Font("Arial",Font.BOLD,50));
      a3.setHorizontalAlignment(JTextField.LEFT);
      f.add(a3);

      
      JTextField at3 = new JTextField();
      at3.setBounds(1400,400,300,50);
      f.add(at3);
      at3.setText(t3);
     at3.setFont(new Font("Arial",Font.ITALIC,25));
     at3.setHorizontalAlignment(JTextField.CENTER);
      
     
     JTextField att3 = new JTextField();
     att3.setBounds(1800,400,300,50);
     f.add(att3);
     att3.setText(doj3);
     
//    ddnt.setText(Integer.toString(dehradun));
    att3.setFont(new Font("Arial",Font.ITALIC,25));
    att3.setHorizontalAlignment(JTextField.CENTER);
    
    
     
     JLabel a4 = new JLabel("Transfer - 4 ");
     a4.setBounds(600,500,400,50);
     a4.setFont(new Font("Arial",Font.BOLD,50));
     a4.setHorizontalAlignment(JTextField.LEFT);
     f.add(a4);

     
     JTextField at4 = new JTextField();
     at4.setBounds(1400,500,300,50);
     f.add(at4);
     
    at4.setFont(new Font("Arial",Font.ITALIC,25));
    at4.setHorizontalAlignment(JTextField.CENTER);
    at4.setText(t4);
    
    
    JTextField att4 = new JTextField();
    att4.setBounds(1800,500,300,50);
    f.add(att4);
    att4.setText(doj4);
    
//   ddnt.setText(Integer.toString(dehradun));
   att4.setFont(new Font("Arial",Font.ITALIC,25));
   att4.setHorizontalAlignment(JTextField.CENTER);
    
    JLabel a5 = new JLabel("Transfer - 5 ");
    a5.setBounds(600,600,400,50);
    a5.setFont(new Font("Arial",Font.BOLD,50));
    a5.setHorizontalAlignment(JTextField.LEFT);
    f.add(a5);

    
    JTextField at5 = new JTextField();
    at5.setBounds(1400,600,300,50);
    f.add(at5);
    
   at5.setFont(new Font("Arial",Font.ITALIC,25));
   at5.setHorizontalAlignment(JTextField.CENTER);
   at5.setText(t5);
   

   JTextField att5 = new JTextField();
   att5.setBounds(1800,600,300,50);
   f.add(att5);
   att5.setText(doj5);
   
//  ddnt.setText(Integer.toString(dehradun));
  att5.setFont(new Font("Arial",Font.ITALIC,25));
  att5.setHorizontalAlignment(JTextField.CENTER);
  
   
   
   JLabel a6 = new JLabel("Transfer - 6 ");
   a6.setBounds(600,700,400,50);
   a6.setFont(new Font("Arial",Font.BOLD,50));
   a6.setHorizontalAlignment(JTextField.LEFT);
   f.add(a6);

   
   JTextField at6 = new JTextField();
   at6.setBounds(1400,700,300,50);
   f.add(at6);
   
  at6.setFont(new Font("Arial",Font.ITALIC,25));
  at6.setHorizontalAlignment(JTextField.CENTER);
   
  at6.setText(t6);
  
  
  JTextField att6 = new JTextField();
  att6.setBounds(1800,700,300,50);
  f.add(att6);
  att6.setText(doj6);
  
// ddnt.setText(Integer.toString(dehradun));
 att6.setFont(new Font("Arial",Font.ITALIC,25));
 att6.setHorizontalAlignment(JTextField.CENTER);
 
 
  
  
  
  JLabel a7 = new JLabel("Transfer - 7 ");
  a7.setBounds(600,800,400,50);
  a7.setFont(new Font("Arial",Font.BOLD,50));
  a7.setHorizontalAlignment(JTextField.LEFT);
  f.add(a7);

  
  JTextField at7 = new JTextField();
  at7.setBounds(1400,800,300,50);
  f.add(at7);
  
 at7.setFont(new Font("Arial",Font.ITALIC,25));
 at7.setHorizontalAlignment(JTextField.CENTER);
 at7.setText(t7);
 
 
 JTextField att7 = new JTextField();
 att7.setBounds(1800,800,300,50);
 f.add(att7);
 att7.setText(doj7);
 
//ddnt.setText(Integer.toString(dehradun));
att7.setFont(new Font("Arial",Font.ITALIC,25));
att7.setHorizontalAlignment(JTextField.CENTER);
 
 
 
 JLabel a8 = new JLabel("Transfer - 8 ");
 a8.setBounds(600,900,400,50);
 a8.setFont(new Font("Arial",Font.BOLD,50));
 a8.setHorizontalAlignment(JTextField.LEFT);
 f.add(a8);

 
 JTextField at8 = new JTextField();
 at8.setBounds(1400,900,300,50);
 f.add(at8);
 
at8.setFont(new Font("Arial",Font.ITALIC,25));
at8.setHorizontalAlignment(JTextField.CENTER);
 
at8.setText(t8);

JTextField att8 = new JTextField();
att8.setBounds(1800,900,300,50);
f.add(att8);
att8.setText(doj8);

//ddnt.setText(Integer.toString(dehradun));
att8.setFont(new Font("Arial",Font.ITALIC,25));
att8.setHorizontalAlignment(JTextField.CENTER);





JLabel a9 = new JLabel("Transfer - 9 ");
a9.setBounds(600,1000,400,50);
a9.setFont(new Font("Arial",Font.BOLD,50));
a9.setHorizontalAlignment(JTextField.LEFT);
f.add(a9);


JTextField at9 = new JTextField();
at9.setBounds(1400,1000,300,50);
f.add(at9);

at9.setFont(new Font("Arial",Font.ITALIC,25));
at9.setHorizontalAlignment(JTextField.CENTER);


at9.setText(t9);

JTextField att9 = new JTextField();
att9.setBounds(1800,1000,300,50);
f.add(att9);
att9.setText(doj9);

//ddnt.setText(Integer.toString(dehradun));
att9.setFont(new Font("Arial",Font.ITALIC,25));
att9.setHorizontalAlignment(JTextField.CENTER);






JLabel a10 = new JLabel("Transfer - 10 ");
a10.setBounds(600,1100,400,50);
a10.setFont(new Font("Arial",Font.BOLD,50));
a10.setHorizontalAlignment(JTextField.LEFT);
f.add(a10);


JTextField at10 = new JTextField();
at10.setBounds(1400,1100,300,50);
f.add(at10);

at10.setFont(new Font("Arial",Font.ITALIC,25));
at10.setHorizontalAlignment(JTextField.CENTER);

at10.setText(t10);


JTextField att10 = new JTextField();
att10.setBounds(1800,1100,300,50);
f.add(att10);
att10.setText(doj10);

//ddnt.setText(Integer.toString(dehradun));
att7.setFont(new Font("Arial",Font.ITALIC,25));
att7.setHorizontalAlignment(JTextField.CENTER);
      
      
       

 
       
        
        
        JButton RAMPUR = new JButton("Mehsana - " + Integer.toString(dehradun));
        RAMPUR.setBounds(2000,1000,325,50);
        RAMPUR.setFont(new Font("Arial",Font.ITALIC,30));
        RAMPUR.setHorizontalAlignment(JTextField.LEFT);
        RAMPUR.setFocusPainted(false);
        f.add(RAMPUR);
        
        
        
        f.setVisible(true);
        f.setSize(2500,1900);
        f.setLocation(0,0);
        f.setBackground(Color.white);
        f.setLayout(null);

    }
    
public void actionPerformed(ActionEvent args) {
		
	
	}

    public static void main(String[] args) throws HeadlessException, SQLException{
        new showData("printForMe2");
    }


}