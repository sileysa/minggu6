
import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Scanner leli = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = leli.nextInt();
        leli.nextLine();

        Mahasiswa26[] listMhs = new Mahasiswa26[jumlah];
        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26();
        /*Mahasiswa26 m1 = new Mahasiswa26("123", "Zidan", "2A", 3.2);
        Mahasiswa26 m2 = new Mahasiswa26("124", "Ayu", "2A", 3.5);
        Mahasiswa26 m3 = new Mahasiswa26("125", "Sofi", "2A", 3.1);
        Mahasiswa26 m4 = new Mahasiswa26("126", "Sita", "2A", 3.9);
        Mahasiswa26 m5 = new Mahasiswa26("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);*/

        System.out.println("Data mahasiswa sebelum sorting: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": ");
            System.out.print("NIM: ");
            String nim = leli.nextLine();
            System.out.print("Nama: ");
            String nama = leli.nextLine();
            System.out.print("Kelas: ");
            String kelas = leli.nextLine();
            System.out.print("IPK: ");
            String dummy = leli.nextLine();
            double ipk = Double.parseDouble(dummy);
            System.out.println("---------------------------------------------------");

            listMhs[i] = new Mahasiswa26(nim, nama, kelas, ipk);
        }
        //list.tampil();
        /*list.bubbleSort(listMhs);
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        for (Mahasiswa26 mahasiswa : listMhs) {
            mahasiswa.tampilInformasi();
            System.out.println("---------------------------------------------------");
        }
        //list.bubbleSort();
        //list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort(listMhs);
        for (Mahasiswa26 mahasiswa : listMhs) {
            mahasiswa.tampilInformasi();
            System.out.println("---------------------------------------------------");
        }*/

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSort(listMhs);
        for (Mahasiswa26 mahasiswa : listMhs) {
            mahasiswa.tampilInformasi();
            System.out.println("---------------------------------------------------");
        }        
    }
}
