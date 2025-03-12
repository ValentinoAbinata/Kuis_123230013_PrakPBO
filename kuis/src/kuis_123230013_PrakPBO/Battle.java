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
public class Battle extends JFrame implements ActionListener{
    
    private JLabel selamat, selamat2, nama, nim, jurusan, serangan;
    private JButton selesai;
    
    public Battle(String playerM, String namaM, String nimM, String jurusanM, String seranganM){
        setTitle("FRAME GAME");
        setLayout(new GridLayout(0,1));
        
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        // if
        if(playerM.equals("seri")){
            selamat = new JLabel("Hasil Pertandingan");
            selamat2 = new JLabel("Sayangnya, kedua player sama-sama kalah/menang");
            
            selesai = new JButton("Selesai");
            
            selesai.addActionListener(this);
            
            add(selamat);
            add(selamat2);
            
            JPanel f = new JPanel(new FlowLayout(FlowLayout.LEFT));
            f.add(selesai);
            add(f);
        } else {
        
        // inisiasi
        selamat = new JLabel("Hasil Pertandingan");
        selamat2 = new JLabel("Selamat!! " + playerM + " telah memenangkan pertandingan!");
        
        nama = new JLabel("Nama : " + namaM);

        nim = new JLabel("NIM : " + nimM);
        
        jurusan = new JLabel("Jurusan : " + jurusanM);
        
        serangan = new JLabel("Serangan : " + seranganM);
        
        selesai = new JButton("Selesai");
        
        // listener
        selesai.addActionListener(this);
        
        // tampilan
        add(selamat);
        
        add(selamat2);
        
        JPanel a = new JPanel(new FlowLayout(FlowLayout.LEFT));
        a.add(nama);
        add(a);
        
        JPanel b = new JPanel(new FlowLayout(FlowLayout.LEFT));
        b.add(nim);
        add(b);

        JPanel c = new JPanel(new FlowLayout(FlowLayout.LEFT));
        c.add(jurusan);
        add(c);

        JPanel d = new JPanel(new FlowLayout(FlowLayout.LEFT));
        d.add(serangan);
        add(d);

        JPanel f = new JPanel(new FlowLayout(FlowLayout.LEFT));
        f.add(selesai);
        add(f);
    }
    }
    @Override
    public void actionPerformed(ActionEvent e){ // testing kasih error handling
        if(e.getSource() == selesai){
            JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Program Ini", "Message", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}
