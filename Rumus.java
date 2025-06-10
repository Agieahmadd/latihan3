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
    public void hitungLuasPersegi(int sisi) {
        this.hasil = sisi * sisi;
    }

    // Method untuk menghitung luas persegi panjang (panjang * lebar)
    public void hitungLuasPersegiPanjang(int panjang, int lebar) {
        this.hasil = panjang * lebar;
    }
}

// class main
public class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek Agie dari kelas Rumus
        Rumus Agie = new Rumus();

        // Menjalankan method untuk menghitung luas persegi
        Agie.hitungLuasPersegi(Agie.sisi);

        // Menampilkan hasil luas persegi
        System.out.println("Luas Persegi: " + Agie.getHasil());

        // Menjalankan method untuk menghitung luas persegi panjang
        Agie.hitungLuasPersegiPanjang(Agie.panjang, Agie.lebar);

        // Menampilkan hasil luas persegi panjang
        System.out.println("Luas Persegi Panjang: " + Agie.getHasil());
    }
}
