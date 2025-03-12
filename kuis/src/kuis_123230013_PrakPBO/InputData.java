/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis_123230013_PrakPBO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ASUS
 */
public class InputData extends JFrame implements ActionListener{
    
    private JLabel selamat, nama, nim, jurusan, serangan;
    private JTextField iNama, iNim, iJurusan;
    private JRadioButton gunting, batu, kertas;
    private ButtonGroup group ;
    private JButton next;
    
    public InputData(){
        setTitle("FRAME PLAYER 1");
        setLayout(new GridLayout(0,1));
        
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        // inisiasi
        selamat = new JLabel("Input Data Player 1");
        
        nama = new JLabel("Nama");
        iNama = new JTextField(15);

        nim = new JLabel("NIM");
        iNim = new JTextField(15);
        
        jurusan = new JLabel("Jurusan");
        iJurusan = new JTextField(15);
        
        serangan = new JLabel("Serangan");
        gunting = new JRadioButton("Gunting", true);
        batu = new JRadioButton("Batu");
        kertas = new JRadioButton("Kertas");
        
        group = new ButtonGroup();
        group.add(gunting);
        group.add(batu);
        group.add(kertas);
        
        next = new JButton("Next");
        
        // listener
        next.addActionListener(this);
        
        // tampilan
        JPanel selimit = new JPanel(new FlowLayout(FlowLayout.CENTER));
        selimit.add(selamat);
        add(selimit);
        
        JPanel a = new JPanel(new FlowLayout(FlowLayout.LEFT));
        a.add(nama);
        a.add(iNama);
        add(a);
        
        JPanel b = new JPanel(new FlowLayout(FlowLayout.LEFT));
        b.add(nim);
        b.add(iNim);
        add(b);

        JPanel c = new JPanel(new FlowLayout(FlowLayout.LEFT));
        c.add(jurusan);
        c.add(iJurusan);
        add(c);

        JPanel d = new JPanel(new FlowLayout(FlowLayout.LEFT));
        d.add(serangan);
        d.add(gunting);
        d.add(batu);
        d.add(kertas);
        add(d);

        JPanel e = new JPanel(new FlowLayout(FlowLayout.LEFT));
        e.add(next);
        add(e);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == next){
            String pilihan1 = "" ;
            if(gunting.isSelected()){
                pilihan1 = "gunting" ;
            }
            if(batu.isSelected()){
                pilihan1 = "batu" ;
            }
            if(kertas.isSelected()){
                pilihan1 = "kertas" ;
            }
            String nama1 = iNama.getText();
            String nim1 = iNim.getText();
            String jurusan1 = iJurusan.getText();
            
            new InputData2(pilihan1, nama1, nim1, jurusan1) ;
        }
    }

    
}
