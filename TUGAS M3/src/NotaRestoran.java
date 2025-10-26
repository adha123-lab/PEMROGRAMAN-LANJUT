import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Program NotaRestoran versi Tugas 3.
 * Menambahkan fitur: menu minuman dan menyimpan nota ke file .txt.
 * @author Adha
 * @version 2.0
 */
public class NotaRestoran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaMakanan, namaMinuman;
        int hargaMakanan, jumlahMakanan, hargaMinuman, jumlahMinuman;
        double total, totalMakanan, totalMinuman;

        System.out.print("Masukkan nama makanan: ");
        namaMakanan = input.nextLine();

        System.out.print("Masukkan harga makanan: ");
        hargaMakanan = input.nextInt();

        System.out.print("Masukkan jumlah makanan: ");
        jumlahMakanan = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Masukkan nama minuman: ");
        namaMinuman = input.nextLine();

        System.out.print("Masukkan harga minuman: ");
        hargaMinuman = input.nextInt();

        System.out.print("Masukkan jumlah minuman: ");
        jumlahMinuman = input.nextInt();

        totalMakanan = hargaMakanan * jumlahMakanan;
        totalMinuman = hargaMinuman * jumlahMinuman;
        total = totalMakanan + totalMinuman;

        System.out.println("\n===== NOTA PEMESANAN =====");
        System.out.println("Makanan : " + namaMakanan + " x" + jumlahMakanan + " = Rp" + totalMakanan);
        System.out.println("Minuman : " + namaMinuman + " x" + jumlahMinuman + " = Rp" + totalMinuman);
        System.out.println("---------------------------");
        System.out.println("Total Bayar : Rp" + total);
        System.out.println("===========================");

        // Simpan ke file nota.txt
        try {
            FileWriter writer = new FileWriter("nota.txt");
            writer.write("===== NOTA PEMESANAN =====\n");
            writer.write("Makanan : " + namaMakanan + " x" + jumlahMakanan + " = Rp" + totalMakanan + "\n");
            writer.write("Minuman : " + namaMinuman + " x" + jumlahMinuman + " = Rp" + totalMinuman + "\n");
            writer.write("---------------------------\n");
            writer.write("Total Bayar : Rp" + total + "\n");
            writer.write("===========================\n");
            writer.close();
            System.out.println("Nota berhasil disimpan ke file nota.txt!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan nota.");
        }
    }
}
