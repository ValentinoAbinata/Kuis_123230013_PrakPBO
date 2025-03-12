// Username : valent
// NIM : 013
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis_123230013_PrakPBO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ASUS
 */
public class Main extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    private JLabel selamat, username, password;
    private JTextField iUsername, iPassword; 
    private JButton bLogin;
    
    public Main(){
        setTitle("FRAME LOGIN");
        setLayout(new GridLayout(0,1));
        
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        // inisiasi
        selamat = new JLabel("Input Login");
        
        username = new JLabel("Username");
        iUsername = new JTextField(15);
        
        password = new JLabel("Password");
        iPassword = new JTextField(15);
        
        bLogin = new JButton("Login");
        
        // listener
        bLogin.addActionListener(this);
        
        // tampilan
        JPanel selimit = new JPanel(new FlowLayout(FlowLayout.CENTER));
        selimit.add(selamat);
        add(selimit);
        
        JPanel a = new JPanel(new FlowLayout(FlowLayout.LEFT));
        a.add(username);
        a.add(iUsername);
        add(a);
        
        JPanel b = new JPanel(new FlowLayout(FlowLayout.LEFT));
        b.add(password);
        b.add(iPassword);
        add(b);
        
        JPanel c = new JPanel(new FlowLayout());
        c.add(bLogin);
        add(c);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){ // testing iPassword
        try {
            if(e.getSource() == bLogin){
                String oiUsername = iUsername.getText();
                String oiPassword = iPassword.getText();
//                                String oiPassword = new String(iPasswordTextField.getPassword()); gabisa

                if(oiUsername.equals("valent") && oiPassword.equals("013")){
                    new InputData();
                } else {
                    JOptionPane.showMessageDialog(null, "Username dan Password tidak Valid!");
                }
            }
        } catch (Exception error){
            JOptionPane.showMessageDialog(null,error.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Main();
    }
    
}
