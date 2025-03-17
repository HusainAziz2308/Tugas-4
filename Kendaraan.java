public class Kendaraan {
    // Atribut
    String nama;
    String merek;
    int tahun;
    int harga;

    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan  : " + nama);
        System.out.println("Merek           : " + merek);
        System.out.println("Tahun           : " + tahun);
        System.out.println("Harga           : " + harga);
    }

    // Method untuk memperbarui harga kendaraan
    public void updateHarga(int hargaBaru) {
        harga = hargaBaru;
        System.out.println("Harga kendaraan diperbarui menjadi: " + harga);
    }

    public static void main(String[] args) {
        Kendaraan mobil1 = new Kendaraan();
        mobil1.nama = "Avanza";
        mobil1.merek = "Toyota";
        mobil1.tahun = 2022;
        mobil1.harga = 125000000;

        mobil1.tampilkanInfo();
        mobil1.updateHarga(135000000);
    }
}