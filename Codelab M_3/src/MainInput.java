import java.util.Scanner;

public class MainInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama kamu: ");
        String nama = sc.nextLine();
        System.out.println("Halo, " + nama + "! Selamat belajar di UMM!");
        sc.close();
    }
}