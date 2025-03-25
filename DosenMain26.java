
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
            System.out.println("5. Sequential Searching");
            System.out.println("6. Binary Search");
            System.out.println("7. Keluar");
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
                /*case 3:
                    dataDosen.sortingASC();
                    dataDosen.tampil();
                    break;
                case 4:
                    dataDosen.sortingDSC();
                    dataDosen.tampil();
                    break;*/
                case 5:
                    System.out.println("---------------------------------------------------");
                    System.out.println("Pencarian data");
                    System.out.println("---------------------------------------------------");
                    System.out.println("masukkan nama dosen yang dicari");
                    System.out.print("Nama: ");
                    String cari = leli.nextLine();
                    dataDosen.sequentialSearching26(cari);
                    break;
                case 6:
                    System.out.println("--------------------------------------");
                    System.out.println("menggunakan binary search");
                    System.out.println("--------------------------------------");
                    System.out.println("masukkan usia dosen yang dicari");
                    System.out.print("Usia: ");
                    int carius = leli.nextInt();
                    int posisi2 = dataDosen.findBinarySearch26(carius, 0, jumlah-1);
                    int pss2 = (int) posisi2;
                    dataDosen.tampilPosisi(carius, pss2);
                    dataDosen.tampilDataSearch(posisi2, pss2);
                    break;
                case 7:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    break;
            }
        } while (pilihan != 7);
        
    }
}
