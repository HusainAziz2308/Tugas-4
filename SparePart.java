public class SparePart {
    // Atribut
    String nama;
    String kode;
    int harga;
    int stok;

    // Method untuk menampilkan informasi spare part
    public void tampilkanInfo() {
        System.out.println("Nama Spare Part: " + nama);
        System.out.println("Kode: " + kode);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

    // Method untuk memperbarui stok spare part
    public void updateStok(int stokBaru) {
        stok = stokBaru;
        System.out.println("Stok diperbarui menjadi: " + stok);
    }

    public static void main(String[] args) {
        SparePart sp1 = new SparePart();
        sp1.nama = "kopling";
        sp1.kode = "193709e81039";
        sp1.harga = 3000000;
        sp1.stok = 5;

        sp1.tampilkanInfo();
        sp1.updateStok(5);
    }
}