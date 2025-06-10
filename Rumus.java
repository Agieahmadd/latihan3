public class Rumus {
    // Ahmad Agie Munawar
    // 2310010659
    // TI-4A

    // Atribut bertipe bilangan bulat
    private int sisi;
    private int panjang;
    private int lebar;
    private int hasil;

    // Constructor untuk memastikan nilai awal atribut sama dengan nol
    public Rumus() {
        this.sisi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.hasil = 0;
    }

    // Method accessor untuk mengembalikan nilai hasil
    public int getHasil() {
        return hasil;
    }

    // Method untuk menghitung luas persegi (sisi * sisi)
    public int hitungLuasPersegi(int sisi) {
        hasil = sisi * sisi;
        return hasil;
    }

    // Method untuk menghitung luas persegi panjang (panjang * lebar)
    public int hitungLuasPersegiPanjang(int panjang, int lebar) {
        hasil = panjang * lebar;
        return hasil;
    }
}
