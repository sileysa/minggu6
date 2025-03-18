
import java.util.Scanner;

public class DosenMain26 {
    public static void main(String[] args) {
        Scanner leli = new Scanner(System.in);
        DataDosen26 dataDosen = new DataDosen26();
        int pilihan, jumlah = 0;

        do {
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = leli.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Jumlah Dosen: ");
                    jumlah = leli.nextInt();
                    leli.nextLine();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("Data Dosen ke-" + (i+1) + ": ");
                        System.out.print("Kode: ");
                        String kode = leli.nextLine();
                        System.out.print("Nama: ");
                        String nama = leli.nextLine();
                        System.out.print("Jenis Kelamin (true = laki-laki, false = perempuan): ");
                        boolean jk = leli.nextBoolean();
                        leli.nextLine();
                        System.out.print("Usia: ");
                        String dummy = leli.nextLine();
                        int usia = Integer.parseInt(dummy);
                        Dosen26 dosenBaru = new Dosen26(kode,nama,jk,usia);
                        dataDosen.tambah(dosenBaru);
                        
                    }
                    break;
                case 2:
                    dataDosen.tampil();
                    break;
                case 3:
                    dataDosen.sortingASC();
                    dataDosen.tampil();
                    break;
                case 4:
                    dataDosen.sortingDSC();
                    dataDosen.tampil();
                    break;
                case 5:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    break;
            }
        } while (pilihan != 5);
        
    }
}
