import javax.swing.JOptionPane;

public class Soal3 {
    public static void main(String[] args) {
        
        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog ("Nilai 1"));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog ("Nilai 2"));
        int nilai3 = Integer.parseInt(JOptionPane.showInputDialog ("Nilai 3"));

        double rata = (nilai1 + nilai2 + nilai3) / 3.0;
    
        
        String hasil = (rata >=60)? "LULUS" : "GAGAL";

        String pesan = "Nilai 1 :" + nilai1 + "\n"
                     + "Nilai 2 :" + nilai2 + "\n"
                     + "Nilai 3 :" + nilai3 + "\n"
                     + "Rata    :" + String.format("%.2f", rata) + "\n"
                     + "Hasil   :" + hasil;
            
        
        JOptionPane.showMessageDialog(null, pesan);

    }



}