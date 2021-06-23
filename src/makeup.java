public class makeup {
    //8 attribute
    private String brand;
    private String nama;
    private String jenis;
    private int kode;
    private int jumlah;
    private String jenisKulit;
    private String jenisTekstur;
    private double harga;

    //4 Method
    public void memilihMakeup(){
        System.out.println("Customer sedang Memilih Makeup");
    }

    public void membeliMakeup(){
        System.out.println("Customer sedang Membeli Makeup");
    }

    public void melakukanPembayaran(){
        System.out.println("Customer sedang Melakukan Pembayaran");
    }

    public void tampilkanBarang(){
        System.out.println("Menampilkan Data Barang");
    }

    public makeup() {
    }

    //Constructor
    public makeup(String brand, String nama, String jenis, int kode, int jumlah, String jenisKulit, String jenisTekstur, double harga) {
        this.brand = brand;
        this.nama = nama;
        this.jenis = jenis;
        this.kode = kode;
        this.jumlah = jumlah;
        this.jenisKulit = jenisKulit;
        this.jenisTekstur = jenisTekstur;
        this.harga = harga;
    }


    public makeup(String brand, String nama, int kode) {
        this.brand = brand;
        this.nama = nama;
        this.kode = kode;
    }

    //Get and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getJenisKulit() {
        return jenisKulit;
    }

    public void setJenisKulit(String jenisKulit) {
        this.jenisKulit = jenisKulit;
    }

    public String getJenisTekstur() {
        return jenisTekstur;
    }

    public void setJenisTekstur(String jenisTekstur) {
        this.jenisTekstur = jenisTekstur;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
