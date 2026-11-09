import javax.swing.JOptionPane;

public class Soal4 {
    public static void main(String[] args) {

        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog ("Nilai 1"));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog ("Nilai 2"));
        int nilai3 = Integer.parseInt(JOptionPane.showInputDialog ("Nilai 3"));

        int hasilkali = nilai1 * nilai2;
        int hasilbagi = hasilkali / nilai3;

        String pesan = "Nilai1 :" + nilai1 + "\n"
                     + "Nilai2 :" + nilai2 + "\n"
                     + "Nilai3 :" + nilai3 + "\n"
                     + "Hasil kali  :" + hasilkali + "\n"
                     + "Hasil bagi :" + hasilbagi;
        
        JOptionPane.showMessageDialog(null, pesan); 


    }
}