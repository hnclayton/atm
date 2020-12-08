/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hnclayton
 */
//Importing all necessary Packages

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class registerHC extends JFrame implements ActionListener {
    JLabel fName1HC= new JLabel ();
    JLabel lName1HC= new JLabel();
    JLabel pword1HC= new JLabel();
    JLabel aBalance1HC= new JLabel(); 
    JTextField firstNameHC= new JTextField();
    JTextField lastNameHC= new JTextField();
    JPasswordField passwordHC= new JPasswordField();
    JTextField yourBalanceHC= new JTextField();
    JButton createAccountHC= new JButton("Create Account");
    JButton logInHC= new JButton("Log In");
    
    
    JPanel panel= new JPanel();
    

public registerHC (){
        
        
        this.setTitle("Register Account");
        this.fName1HC.setText("First Name: ");
        this.lName1HC.setText("Last Name: ");
        this.pword1HC.setText("Password: ");
        this.aBalance1HC.setText("Enter your Account Balance: ");
        createAccountHC.addActionListener(this);
        
        
        
        panel.add(fName1HC);
        panel.add(firstNameHC);
        panel.add(lName1HC);
        panel.add(lastNameHC);
        panel.add(pword1HC);
        panel.add(passwordHC);
        panel.add(aBalance1HC);
        panel.add(yourBalanceHC);
        panel.add(createAccountHC);
        panel.add(logInHC);
       
  
        GridLayout nLayout= new GridLayout(4,2);
        
        panel.setLayout(nLayout);
        
        this.getContentPane().add(panel);
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String cmd= e.getActionCommand();
        System.out.println("CMD: "+cmd);
        
        JButton button= (JButton)e.getSource();
        System.out.println(button);
        
        if (cmd =="Register"){
            System.out.print("Look for Account Information Tab");
        }
        if (cmd =="Log In"){
            System.out.print("Welcome Back!");
        }
    }
}
       
  


    
