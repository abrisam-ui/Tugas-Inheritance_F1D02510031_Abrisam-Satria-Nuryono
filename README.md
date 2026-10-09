Tugas PBO - Inheritance dan Polymorphism

Data Mahasiswa

Nama: Abrisam Satria Nuryono

NIM: F1D02510031

Kelas: PBO - 5 Inheritance dan Polymorphism

Deskripsi Program

## 🎯 Gambaran Umum Program

Program ini dirancang untuk mengelola dan menghitung atribut geometri dari beberapa bentuk dasar:
- **`Bentuk`** *(Superclass)*: Menjadi kelas induk utama yang mengapsulasi atribut warna umum untuk semua turunan bentuk geometri.
- **`BujurSangkar`** *(Subclass dari Bentuk)*: Menghitung luas persegi berdasarkan nilai `sisi` yang diinputkan.
- **`Lingkaran`** *(Subclass dari Bentuk)*: Menghitung luas lingkaran berdasarkan `radius` dengan menggunakan konstanta `PHI` (`Math.PI`).
- **`Silinder`** *(Subclass dari Lingkaran)*: Menghitung volume bangun ruang silinder berdasarkan luas alas (inherit dari `Lingkaran`) dikalikan dengan `tinggi`.

Program dilengkapi dengan antarmuka **Menu Interaktif CLI** pada `Main.java` yang memudahkan pengguna untuk menguji perhitungan geometri secara dinamis maupun menjalankan demonstrasi instansiasi objek secara otomatis.

---

## 🚀 Fitur Utama

1. **Demo Otomatis (Demo All Shapes)**: Menampilkan instansiasi dan pemanggilan method `printInfo()` dari seluruh kelas geometri secara serentak.
2. **Kustomisasi Bujur Sangkar**: Input interaktif panjang sisi dan warna untuk menghitung luas bujur sangkar.
3. **Kustomisasi Lingkaran**: Input interaktif jari-jari (radius) dan warna untuk menghitung luas lingkaran.
4. **Kustomisasi Silinder**: Input interaktif jari-jari alas, tinggi, dan warna untuk menghitung volume silinder.

## 📁 Struktur File

```text
src/
├── Bentuk.java        # Superclass utama yang menyimpan atribut warna
├── BujurSangkar.java  # Subclass turunan Bentuk untuk menghitung luas bujur sangkar
├── Lingkaran.java     # Subclass turunan Bentuk untuk menghitung luas lingkaran
├── Silinder.java      # Subclass turunan Lingkaran untuk menghitung volume silinder
└── Main.java          # Program utama dengan menu interaktif CLI
```
