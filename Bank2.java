import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;

public class depWithPageHC extends JFrame implements ActionListener  {

    static void showFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    JLabel title1HC= new JLabel();
    JLabel title2HC= new JLabel();
    JLabel title3HC= new JLabel(); 
    JTextField accountBalanceHC= new JTextField();
    JTextField enterValueHC= new JTextField();
    JTextField updatedBalanceHC= new JTextField();
    JButton exitButtonHC= new JButton("Exit");
    JButton withButtonHC= new JButton("Withdraw");
    JButton depButtonHC= new JButton("Deposit");
    
    JPanel panel= new JPanel();

    public depWithPageHC (){
        
        
        this.setTitle("Account Information");
        this.title1HC.setText("Account Balance: ");
        this.title2HC.setText("Enter Amount: ");
        this.title3HC.setText("Updated Account Balance: ");
        exitButtonHC.addActionListener(this);
        withButtonHC.addActionListener(this);
        depButtonHC.addActionListener(this);
        
        
        panel.add(title1HC);
        panel.add(title2HC);
        panel.add(title3HC);
        panel.add(accountBalanceHC);
        panel.add(enterValueHC);
        panel.add(updatedBalanceHC);
        panel.add(exitButtonHC);
        panel.add(withButtonHC);
        panel.add(depButtonHC);
       
  
        GridLayout nLayout= new GridLayout(3,3);
        
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
        
        if (cmd =="Withdraw"){
                int num1= Integer.parseInt(accountBalanceHC.getText());
                int num2= Integer.parseInt(enterValueHC.getText());
                int r= num1-num2;
                updatedBalanceHC.setText(r+"");
        }
        else if (cmd =="Deposit"){
                int num1= Integer.parseInt(accountBalanceHC.getText());
                int num2= Integer.parseInt(enterValueHC.getText());
                int r= num1+num2;
                updatedBalanceHC.setText(r+"");
        } 
        else if (cmd =="Exit"){
               System.exit(0);
    
      }
       
    }
   
   }
