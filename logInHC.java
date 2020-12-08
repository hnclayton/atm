/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hnclayton
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class logInHC extends JFrame implements ActionListener {
   JPanel panel;
   JLabel fNameHC_label, lNameHC_label, passwordHC_label, message, yourBalanceHC_label;
   JTextField fNameHC_text, lNameHC_text, yourBalanceHC_text;
   JPasswordField passwordHC_text;
   JButton submitHC, cancel;
   
   
   logInHC() {
      
      JLabel yourBalanceHC = new JLabel();
      yourBalanceHC_label.setText("Your Account Balance: ");
      yourBalanceHC_text = new JTextField ();
              
      JLabel fNameHC = new JLabel();
      fNameHC_label.setText("First Name :");
      fNameHC_text = new JTextField();
      
      JLabel lNameHC= new JLabel();
      lNameHC_label.setText("Last Name :");
      lNameHC_text = new JTextField();
      
      
      passwordHC_label = new JLabel();
      passwordHC_label.setText("Password :");
      passwordHC_text = new JPasswordField();
      
      
      submitHC = new JButton("SUBMIT");
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(fNameHC_label);
      panel.add(fNameHC_text);
      panel.add(lNameHC_label);
      panel.add(lNameHC_text);
      panel.add(passwordHC_label);
      panel.add(passwordHC_text);
     // panel.add(yourBalanceHC_label);
      //panel.add(yourBalanceHC);
      message = new JLabel();
      panel.add(message);
      panel.add(submitHC);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submitHC.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Login");
      setSize(450,350);
      setVisible(true);
   }
   public static void main(String[] args) {
      new logInHC();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      String fNameHC = fNameHC_text.getText();
      String lNameHC = lNameHC_text.getText();
      String passwordHC = passwordHC_text.getText();
      String yourBalanceHC= yourBalanceHC_text.getText();
     
        if (fNameHC.trim().equals("John")||
            lNameHC.trim().equals("Doe") ||
            passwordHC.trim().equals("passwordDoe")){
    
            System.out.print(yourBalanceHC="10000");}
            
        
        else if (fNameHC.trim().equals("Jane")||
                lNameHC.trim().equals("Doe")||      
                passwordHC.trim().equals("passwordJane")){
                
            System.out.print(yourBalanceHC="500");}
        
        
        else if (fNameHC.trim().equals("Sarah") ||
            lNameHC.trim().equals("Conner")|| 
            passwordHC.trim().equals("helloword2000")){
          
            System.out.print(yourBalanceHC= "600");}
        
       else
    {
      JOptionPane.showMessageDialog(this,"Incorrect login or password",
      "Error",JOptionPane.ERROR_MESSAGE);  }
            
    System.out.println(" Hello " + fNameHC + lNameHC); //". Your account balance is $" + yourBalanceHC);
      } 
  
  }
   

