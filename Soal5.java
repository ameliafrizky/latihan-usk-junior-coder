public class Soal5 {
    public static void main(String[] args) {
        int baris = 5;

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
} 