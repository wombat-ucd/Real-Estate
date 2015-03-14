/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realEstate1;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author User
 */
public class RealEstate {
      JFrame frame1=new JFrame();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JLabel label1,label2,label3,label4,label5,label6;
    JTextField textfield1,textfield2,textfield3,textfield4,textfield5,textfield6;
    JButton btn1,btn2,btn3,btn4,btn5,btn6;
    
    
    public void createUserInterface(){
        frame1.add(panel1);
        panel1.add(panel2);
        panel2.setLayout(new GridLayout(200,100));
        
        label1=new JLabel("         Lot Number          ");
        panel2.add(label1);
        textfield1=new JTextField();
        panel2.add(textfield1);
        
         label2=new JLabel("        First Name          ");
        panel2.add(label2);
        textfield2=new JTextField("                 ");
        panel2.add(textfield2);
         label3=new JLabel("        Last Name       ");
        panel2.add(label3);
        textfield3=new JTextField("                 ");
        panel2.add(textfield3);
         label4=new JLabel("        Price           ");
        panel2.add(label4);
        textfield4=new JTextField("                 ");
        panel2.add(textfield4);
         label5=new JLabel("        Square Feet         ");
        panel2.add(label5);
        textfield5=new JTextField("                 ");
        panel2.add(textfield5);
         label6=new JLabel("        Number Of Bedrooms          ");
        panel2.add(label6);
        textfield6=new JTextField("                 ");
        panel2.add(textfield6);
        
        
        
        
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(450, 400);
        panel1.setBackground(Color.LIGHT_GRAY);
        panel2.setSize(500, 100);
        frame1.setVisible(true);
        
        
        
   // }
    //public void addButton(){
        panel2.add(panel3);
        panel3.setLayout(new GridLayout());
        
        btn1=new JButton("Reset");
        panel3.add(btn1);
        btn2=new JButton("Add");
        panel3.add(btn2);
        btn3=new JButton("Clear");
        panel3.add(btn3);
        btn4=new JButton("Next");
        panel3.add(btn4);
        btn5=new JButton("Delete");
        panel3.add(btn5);
        btn6=new JButton("Find");
        panel3.add(btn6);
        
        
      
   // public void createActionListenerbtn1(){
        btn1.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            RealEstate rs1=new RealEstate();
                            rs1.Reset();
                        }
                        });
    
   // public void createActionListenerbtn2(){
        btn2.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
//                            RealEstate rs2=new RealEstate();
//                            rs2.Add();
                            textfield1.getText();
                            textfield2.getText();
                            textfield3.getText();
                            textfield4.getText();
                            textfield5.getText();
                            textfield6.getText();
                        }
                        });
    
    // public void createActionListenerbtn3(){
        btn3.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            
                            textfield1.setText("");
                            textfield2.setText("");
                            textfield3.setText("");
                            textfield4.setText("");
                            textfield5.setText("");
                            textfield6.setText("");
        
                            
                        }
                        });
    
     // public void createActionListenerbtn4(){
        btn4.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            RealEstate rs4=new RealEstate();
                            rs4.Next();
                        }
                        });
    
      // public void createActionListenerbtn5(){
        btn5.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            RealEstate rs5=new RealEstate();
                            rs5.Delete();
                        }
                        });
    
        //public void createActionListenerbtn6(){
        btn6.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            RealEstate rs6=new RealEstate();
                            rs6.Find();
                        }
                        });
    
    }
    public void Reset(){
           
    }
    public void Add(){
//        textfield1.getText();
//        textfield2.getText();
//        textfield3.getText();
//        textfield4.getText();
//        textfield5.getText();
//        textfield6.getText();
        
    }
    public void Clear(){
//       
//        textfield1.setText("abc");
//        textfield2.setText("");
//        textfield3.setText("");
//        textfield4.setText("");
//        textfield5.setText("");
//        textfield6.setText("");
//        
    }
    public void Next(){
        
    }
    public void Delete(){
        
    }
    public void Find(){
        
    }
    
    

public static void main(String[] args){
    RealEstate re=new RealEstate();
    re.createUserInterface();
   // re.addButton();


}
    
}
