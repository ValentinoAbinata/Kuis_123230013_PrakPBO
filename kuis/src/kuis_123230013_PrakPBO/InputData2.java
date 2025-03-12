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
public class InputData2 extends JFrame implements ActionListener{
    
    private JLabel selamat, nama, nim, jurusan, serangan;
    private JTextField iNama, iNim, iJurusan;
    private JRadioButton gunting, batu, kertas;
    private ButtonGroup group ;
    private JButton next;
    
    private String pilihan11, nama11, nim11, jurusan11;
    
    public InputData2(String pilihan1, String nama1, String nim1, String jurusan1){
        setTitle("FRAME PLAYER 2");
        setLayout(new GridLayout(0,1));
        
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        // inisiasi
        selamat = new JLabel("Input Data Player 2");
        
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
        
        // testing
        pilihan11 = pilihan1 ;
        nama11 = nama1;
        nim11 = nim1; 
        jurusan11 = jurusan1;
    }
    @Override
    public void actionPerformed(ActionEvent e){ // testing kasih error handling

        if(e.getSource() == next){
            String pilihan2 = "" ;
            String nama22 = iNama.getText();
            String nim22 = iNim.getText();
            String jurusan22 = iJurusan.getText();
        if(gunting.isSelected()){
            if(pilihan11.equals("gunting")){
                new Battle("seri", "seri", "seri", "seri", "seri");// seri
            }
            if(pilihan11.equals("batu")){
                new Battle("player1", nama11, nim11, jurusan11, pilihan11);// player1 win
            }
            if(pilihan11.equals("kertas")){
                new Battle("player2", nama22, nim22, jurusan22, "gunting");// player2 win
            }
        }
        if(batu.isSelected()){
            if(pilihan11.equals("gunting")){
                new Battle("player2", nama22, nim22, jurusan22, "batu");// player2 win
            }
            if(pilihan11.equals("batu")){
                new Battle("seri", "seri", "seri", "seri", "seri");// seri
            }
            if(pilihan11.equals("kertas")){
                new Battle("player1", nama11, nim11, jurusan11, pilihan11);// player1 win
            }
        }
        if(kertas.isSelected()){
            if(pilihan11.equals("gunting")){
                new Battle("player1", nama11, nim11, jurusan11, pilihan11);// player1 win
            }
            if(pilihan11.equals("batu")){
                new Battle("player2", nama22, nim22, jurusan22, "kertas");// player2 win
            }
            if(pilihan11.equals("kertas")){
                new Battle("seri", "seri", "seri", "seri", "seri");// seri
            }
        }
            
//            String hasil ;
            
//            // player 1 gunting
//            if(pilihan11 == "gunting"  && pilihan2 == "gunting"){
//                hasil = "seri" ;
//                new Battle();
//            }
//            if(pilihan11 == "gunting"  && pilihan2 == "batu"){
//                hasil = "player2 win" ;
//            }
//            if(pilihan11 == "gunting"  && pilihan2 == "kertas"){
//                hasil = "player1 win" ;
//            }
//            // player 1 batu
//            if(pilihan11 == "batu"  && pilihan2 == "gunting"){
//                hasil = "player1 win" ;
//            }
//            if(pilihan11 == "batu"  && pilihan2 == "batu"){
//                hasil = "seri" ;
//            }
//            if(pilihan11 == "batu"  && pilihan2 == "kertas"){
//                hasil = "player2 win" ;
//            }
//            
//            // player 1 kertas
//            if(pilihan11 == "gunting"  && pilihan2 == "gunting"){
//                hasil = "seri" ;
//            }
//            if(pilihan11 == "gunting"  && pilihan2 == "batu"){
//                hasil = "player2 win" ;
//            }
//            if(pilihan11 == "gunting"  && pilihan2 == "kertas"){
//                hasil = "player1 win" ;
//            }
        }
    }

    
}
