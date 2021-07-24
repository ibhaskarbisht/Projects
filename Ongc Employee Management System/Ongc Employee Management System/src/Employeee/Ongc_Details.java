package Employeee;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.StyleConstants;

import java.awt.event.*;
import java.sql.*;

class Ongc_Details implements ActionListener{
    JFrame f;

    Ongc_Details() throws HeadlessException, SQLException
    {
    	JFrame f;
    	JButton back;
    	int dehradun=0,delhi=0,agartala=0,ahmedabad=0,ankleshwar=0,cambay_asset=0,chennai=0,goa=0,jodhpur=0,hazira=0,
   jorhat=0,kakinada=0,karaikal=0,kolkata=0,bokaro=0,bhubaneswar=0,mehsana=0,mumbai=0,navi_mumbai=0,nazira=0,rajahmundry=0,silchar=0,uran=0,
   vadodara=0;
    	ResultSet rs=null;
        try{
            
        	conn con = new conn();
            String str = "select * from ongc where location = 'dehradun' ";
            
            rs= con.s.executeQuery(str);
            
            if(rs.next())
            {
            	dehradun = rs.getInt(2);
            }
            
            str = "select * from ongc where location = 'delhi' ";
            ResultSet rs2  = con.s.executeQuery(str);
            
            if(rs2.next())
            {
            	delhi = rs2.getInt(2);
            }
            
            str = "select * from ongc where location = 'agartala' ";
            ResultSet rs3  = con.s.executeQuery(str);
            
            if(rs3.next())
            {
            	agartala = rs3.getInt(2);
            }
            
            str = "select * from ongc where location = 'ahmedabad' ";
            ResultSet rs4  = con.s.executeQuery(str);
            
            if(rs4.next())
            {
            	ahmedabad = rs4.getInt(2);
            }
            
            str = "select * from ongc where location = 'ankleshwar' ";
            ResultSet rs5  = con.s.executeQuery(str);
            
            if(rs5.next())
            {
            	ankleshwar= rs5.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'cambay asset' ";
            ResultSet rs6  = con.s.executeQuery(str);
            
            if(rs6.next())
            {
            	cambay_asset= rs6.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'chennai' ";
            ResultSet rs7  = con.s.executeQuery(str);
            
            if(rs7.next())
            {
            	chennai= rs7.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'goa' ";
            ResultSet rs8  = con.s.executeQuery(str);
            
            if(rs8.next())
            {
            	goa= rs8.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'jodhpur' ";
            ResultSet rs9  = con.s.executeQuery(str);
            
            if(rs9.next())
            {
            	jodhpur= rs9.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'hazira' ";
            ResultSet rs10  = con.s.executeQuery(str);
            
            if(rs10.next())
            {
            	hazira= rs10.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'jorhat' ";
            ResultSet rs11  = con.s.executeQuery(str);
            
            if(rs11.next())
            {
            	jorhat= rs11.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'kakinda' ";
            ResultSet rs12  = con.s.executeQuery(str);
            
            if(rs12.next())
            {
            	kakinada= rs12.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'karaikal' ";
            ResultSet rs13  = con.s.executeQuery(str);
            
            if(rs13.next())
            {
            	karaikal= rs13.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'karaikal' ";
            ResultSet rs14  = con.s.executeQuery(str);
            
            if(rs14.next())
            {
            	karaikal= rs14.getInt(2);
            }
            
            str = "select * from ongc where location = 'kolkata' ";
            ResultSet rs15  = con.s.executeQuery(str);
            
            if(rs15.next())
            {
            	kolkata= rs15.getInt(2);
            }
            
            str = "select * from ongc where location = 'bokaro' ";
            ResultSet rs16  = con.s.executeQuery(str);
            
            if(rs16.next())
            {
            	bokaro= rs16.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'bhubneswar' ";
            ResultSet rs17  = con.s.executeQuery(str);
            
            if(rs17.next())
            {
            	bhubaneswar= rs17.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'mehsana' ";
            ResultSet rs18  = con.s.executeQuery(str);
            
            if(rs18.next())
            {
            	mehsana= rs18.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'mumbai' ";
            ResultSet rs19  = con.s.executeQuery(str);
            
            if(rs19.next())
            {
            	mumbai = rs19.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'navi mumbai' ";
            ResultSet rs20  = con.s.executeQuery(str);
            
            if(rs20.next())
            {
            	navi_mumbai= rs20.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'nazira' ";
            ResultSet rs21  = con.s.executeQuery(str);
            
            if(rs21.next())
            {
            	nazira = rs21.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'rajahmundry' ";
            ResultSet rs22  = con.s.executeQuery(str);
            
            if(rs22.next())
            {
            	rajahmundry = rs22.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'silchar' ";
            ResultSet rs23  = con.s.executeQuery(str);
            
            if(rs23.next())
            {
            	silchar = rs23.getInt(2);
            }
            
            
            str = "select * from ongc where location = 'vadodara' ";
            ResultSet rs24  = con.s.executeQuery(str);
            
            if(rs24.next())
            {
            	vadodara= rs24.getInt(2);
            }
            
            
            
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
 
        f=new JFrame("ONGC Employee Count");
//        f.setVisible(true);
//        f.setSize(2500,1500);
//        f.setLocation(0,0);
//        f.setBackground(Color.white);
//        f.setLayout(null);
//        
        
        JLabel heading = new JLabel("ONGC Employee Count per Office Location");
        heading.setBounds(750,20,1250,90);
        heading.setFont(new Font("Arial",Font.BOLD,50));
        heading.setForeground(Color.red);
        f.add(heading);
        
        
        /////////////////////////////////////////////////////////////////////Dehradun
        
        JButton temp = new JButton("DehraDun - " + Integer.toString(dehradun));
        temp.setBounds(200,200,325,50);
        temp.setFont(new Font("Arial",Font.ITALIC,30));
        temp.setHorizontalAlignment(JTextField.LEFT);
        temp.setFocusPainted(false);
        f.add(temp);

        
//        JTextField ddnt = new JTextField();
//        ddnt.setBounds(800,200,40,40);
//        f.add(ddnt);
//        
//       ddnt.setText(Integer.toString(dehradun));
//       ddnt.setFont(new Font("Arial",Font.BOLD,20));
//       ddnt.setHorizontalAlignment(JTextField.CENTER);
        
        
     
       /////////////////////////////////////////////////////////////////////////////Agra
       
        JButton DELHI = new JButton("Delhi - " + Integer.toString(delhi));
        DELHI.setBounds(200,320,325,50);
        DELHI.setFont(new Font("Arial",Font.ITALIC,30));
        DELHI.setHorizontalAlignment(JTextField.LEFT);
        DELHI.setFocusPainted(false);
        f.add(DELHI);
     
       
       /////////////////////////////////////////////////////////////////////////////
       
       
        
        
        JButton AGARTALA = new JButton("Agartala - " + Integer.toString(agartala));
        AGARTALA.setBounds(200,440,325,50);
        AGARTALA.setFont(new Font("Arial",Font.ITALIC,30));
        AGARTALA.setHorizontalAlignment(JTextField.LEFT);
        AGARTALA.setFocusPainted(false);
        f.add(AGARTALA);
        
        
        ////////////////////////////////////////////////////////////////////
       
        
        JButton AHMEDABAD = new JButton("Ahmedabad - " + Integer.toString(ahmedabad));
        AHMEDABAD.setBounds(200,560,325,50);
        AHMEDABAD.setFont(new Font("Arial",Font.ITALIC,30));
        AHMEDABAD.setHorizontalAlignment(JTextField.LEFT);
        AHMEDABAD.setFocusPainted(false);
        f.add(AHMEDABAD);
       
          
        /////////////////////////////////////////////////////////////////////
        
        
        JButton ANKLESHWAR = new JButton("Ankleshwar - " + Integer.toString(ankleshwar));
        ANKLESHWAR.setBounds(200,680,325,50);
        ANKLESHWAR.setFont(new Font("Arial",Font.ITALIC,30));
        ANKLESHWAR.setHorizontalAlignment(JTextField.LEFT);
        ANKLESHWAR.setFocusPainted(false);
        f.add(ANKLESHWAR);
        
        
        
        ///////////////////////////////////////////////////////////////////
        
        
        JButton CAMBAY_ASSET = new JButton("Cambay Asset - " + Integer.toString(cambay_asset));
        CAMBAY_ASSET.setBounds(200,800,325,50);
        CAMBAY_ASSET.setFont(new Font("Arial",Font.ITALIC,30));
        CAMBAY_ASSET.setHorizontalAlignment(JTextField.LEFT);
        CAMBAY_ASSET.setFocusPainted(false);
        f.add(CAMBAY_ASSET);
        
        
        ///////////////////////////////////////
        JButton CHENNAI = new JButton("Chennai - " + Integer.toString(chennai));
        CHENNAI.setBounds(200,920,325,50);
        CHENNAI.setFont(new Font("Arial",Font.ITALIC,30));
        CHENNAI.setHorizontalAlignment(JTextField.LEFT);
        CHENNAI.setFocusPainted(false);
        f.add(CHENNAI);
        
        /////////////////////////////////////////////////
        
        JButton GOA = new JButton("Goa - " + Integer.toString(goa));
        GOA.setBounds(200,1040,325,50);
        GOA.setFont(new Font("Arial",Font.ITALIC,30));
        GOA.setHorizontalAlignment(JTextField.LEFT);
        GOA.setFocusPainted(false);
        f.add(GOA);
        
        //////////////////////////////////////////////////
        
        
        JButton HAZIRA = new JButton("Hazira - " + Integer.toString(hazira));
        HAZIRA.setBounds(1100,200,325,50);
        HAZIRA.setFont(new Font("Arial",Font.ITALIC,30));
        HAZIRA.setHorizontalAlignment(JTextField.LEFT);
        HAZIRA.setFocusPainted(false);
        f.add(HAZIRA);
        
        
        
        //////////////////////////////////////////
        
        
        JButton JODPPUR = new JButton("Jodhpur - " + Integer.toString(jodhpur));
        JODPPUR.setBounds(1100,320,325,50);
        JODPPUR.setFont(new Font("Arial",Font.ITALIC,30));
        JODPPUR.setHorizontalAlignment(JTextField.LEFT);
        JODPPUR.setFocusPainted(false);
        f.add(JODPPUR);
        
        
        
        /////////////////////////////////////////////
        
        
        
        JButton JORHAT = new JButton("Jorhat - " + Integer.toString(jorhat));
        JORHAT.setBounds(1100,440,325,50);
        JORHAT.setFont(new Font("Arial",Font.ITALIC,30));
        JORHAT.setHorizontalAlignment(JTextField.LEFT);
        JORHAT.setFocusPainted(false);
        f.add(JORHAT);
        
        
        /////////////////////////////////////////
        
        JButton KAKINADA = new JButton("Kakinada - " + Integer.toString(kakinada));
        KAKINADA.setBounds(1100,560,325,50);
        KAKINADA.setFont(new Font("Arial",Font.ITALIC,30));
        KAKINADA.setHorizontalAlignment(JTextField.LEFT);
        KAKINADA.setFocusPainted(false);
        f.add(KAKINADA);
        
        ////////////////////////////////////////////////
        
        JButton KARAIKAL = new JButton("Karaikal - " + Integer.toString(karaikal));
        KARAIKAL.setBounds(1100,680,325,50);
        KARAIKAL.setFont(new Font("Arial",Font.ITALIC,30));
        KARAIKAL.setHorizontalAlignment(JTextField.LEFT);
        KARAIKAL.setFocusPainted(false);
        f.add(KARAIKAL);
        
        
        ////////////////////////////////////////////////////////////
        
        
        
        
        JButton KOLKATA = new JButton("Kolkata - " + Integer.toString(kolkata));
        KOLKATA.setBounds(1100,800,325,50);
        KOLKATA.setFont(new Font("Arial",Font.ITALIC,30));
        KOLKATA.setHorizontalAlignment(JTextField.LEFT);
        KOLKATA.setFocusPainted(false);
        f.add(KOLKATA);
        
        
        ////////////////////////////////////////////////////////////
        
        
        JButton BOKARO = new JButton("Bokaro - " + Integer.toString(bokaro));
        BOKARO.setBounds(1100,920,325,50);
        BOKARO.setFont(new Font("Arial",Font.ITALIC,30));
        BOKARO.setHorizontalAlignment(JTextField.LEFT);
        BOKARO.setFocusPainted(false);
        f.add(BOKARO);
        
        
        ////////////////////////////////////////////////////////////
        
        
        JButton BHUBANESWAR = new JButton("Bhubaneswar - " + Integer.toString(bhubaneswar));
        BHUBANESWAR.setBounds(1100,1040,325,50);
        BHUBANESWAR.setFont(new Font("Arial",Font.ITALIC,30));
        BHUBANESWAR.setHorizontalAlignment(JTextField.LEFT);
        BHUBANESWAR.setFocusPainted(false);
        f.add(BHUBANESWAR);
        
        
        ////////////////////////////////////////////////////////////
        
        JButton MUMBAI = new JButton("Mumbai - " + Integer.toString(mumbai));
        MUMBAI.setBounds(2000,200,325,50);
        MUMBAI.setFont(new Font("Arial",Font.ITALIC,30));
        MUMBAI.setHorizontalAlignment(JTextField.LEFT);
        MUMBAI.setFocusPainted(false);
        f.add(MUMBAI);

 ////////////////////////////////////////////////////////////
        
        JButton NAVIMUMBAI = new JButton("Navi Mumbai - " + Integer.toString(navi_mumbai));
        NAVIMUMBAI.setBounds(2000,320,325,50);
        NAVIMUMBAI.setFont(new Font("Arial",Font.ITALIC,30));
        NAVIMUMBAI.setHorizontalAlignment(JTextField.LEFT);
        NAVIMUMBAI.setFocusPainted(false);
        f.add(NAVIMUMBAI	);
        
 ////////////////////////////////////////////////////////////
        
        JButton NAZIRA = new JButton("Nazira - " + Integer.toString(nazira));
        NAZIRA.setBounds(2000,440,325,50);
        NAZIRA.setFont(new Font("Arial",Font.ITALIC,30));
        NAZIRA.setHorizontalAlignment(JTextField.LEFT);
        NAZIRA.setFocusPainted(false);
        f.add(NAZIRA);
        
 ////////////////////////////////////////////////////////////
        
        JButton RAJAHMUNDRY = new JButton("Rajamundry - " + Integer.toString(rajahmundry));
        RAJAHMUNDRY.setBounds(2000,560,325,50);
        RAJAHMUNDRY.setFont(new Font("Arial",Font.ITALIC,30));
        RAJAHMUNDRY.setHorizontalAlignment(JTextField.LEFT);
        RAJAHMUNDRY.setFocusPainted(false);
        f.add(RAJAHMUNDRY);
        
        
 ////////////////////////////////////////////////////////////
        
        JButton SILCHAR = new JButton("Silchar - " + Integer.toString(silchar));
        SILCHAR.setBounds(2000,680,325,50);
        SILCHAR.setFont(new Font("Arial",Font.ITALIC,30));
        SILCHAR.setHorizontalAlignment(JTextField.LEFT);
        SILCHAR.setFocusPainted(false);
        f.add(SILCHAR);
        
        
 ////////////////////////////////////////////////////////////
        
        JButton URAN = new JButton("Uran - " + Integer.toString(uran));
        URAN.setBounds(2000,800,325,50);
        URAN.setFont(new Font("Arial",Font.ITALIC,30));
        URAN.setHorizontalAlignment(JTextField.LEFT);
        URAN.setFocusPainted(false);
        f.add(URAN);
        
        
 ////////////////////////////////////////////////////////////
        
        JButton VADODARA = new JButton("Vadodara - " + Integer.toString(vadodara));
        VADODARA.setBounds(2000,920,325,50);
        VADODARA.setFont(new Font("Arial",Font.ITALIC,30));
        VADODARA.setHorizontalAlignment(JTextField.LEFT);
        VADODARA.setFocusPainted(false);
        f.add(VADODARA);
        
 ////////////////////////////////////////////////////////////
        
        JButton MEHSANA = new JButton("Mehsana - " + Integer.toString(mehsana));
        MEHSANA.setBounds(2000,1040,325,50);
        MEHSANA.setFont(new Font("Arial",Font.ITALIC,30));
        MEHSANA.setHorizontalAlignment(JTextField.LEFT);
        MEHSANA.setFocusPainted(false);
        f.add(MEHSANA);
        
        
        ///////////////////////////////////////////
        
        
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
        new Ongc_Details();
    }


}