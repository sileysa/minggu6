public class DataDosen26 {
    Dosen26[] dataDosen = new Dosen26[10];
    int idx = 0;

    void tambah(Dosen26 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("--------------------------------------------");
        }
    }

    /*void sortingASC() {
        for (int i = 0; i < idx -1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j+1].usia) {
                    Dosen26 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j+1];
                    dataDosen[j+1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx-1; i++) {
            int maxIdx = i;
            for (int j = i+1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen26 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen26 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }*/

    void sequentialSearching26(String cari){
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (dataDosen[j].nama == cari) {
                posisi = j;
                break;
            }
        }
    }

    void tampilPosisi (int x, int pos){
        if (pos != -1) {
            System.out.println("data dosen dengan usia: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(int x, int pos) {
        if (pos != -1) {
            System.out.println("kode\t : " + dataDosen[pos].kode);
            System.out.println("nama\t : " + dataDosen[pos].nama);
            System.out.println("jenis kelamin\t : " + dataDosen[pos].jenisKelamin);
            System.out.println("usia\t : " + x);
        } else {
            System.out.println("Data dosen dengan usia " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch26(int carius, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (carius == dataDosen[mid].usia) {
                return mid;
            } else if (dataDosen[mid].usia > carius) {
                return findBinarySearch26(carius, left, mid-1);
            } else {
                return findBinarySearch26(carius, mid+1, right);
            }
        }
        return -1;
    }
}
