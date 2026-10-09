Tugas PBO - Inheritance dan Polymorphism

Data Mahasiswa

Nama: Abrisam Satria Nuryono

NIM: F1D02510031

Kelas: PBO - 5 Inheritance dan Polymorphism

Deskripsi Program

# Tugas Praktikum PBO: Implementasi Abstraction, Encapsulation, Inheritance, dan Polymorphism

Proyek ini dibuat untuk memenuhi tugas mata kuliah Pemrograman Berbasis Objek (PBO) yang mengimplementasikan struktur hirarki geometri bangun datar dan bangun ruang menggunakan bahasa pemrograman **Java**.

---

## 📌 Penerapan Konsep OOP pada Kode

### 1. Encapsulation (Pengkapsulan)
* **Penerapan**: Variabel/atribut pada setiap kelas diset dengan akses modifier `private` atau `protected` untuk melindungi integritas data dari akses langsung luar kelas.
* **Akses Data**: Pengambilan dan pengubahan data dilakukan secara terartikulasi menggunakan method **Getter** dan **Setter**.
  * *Contoh*: Variabel `sisi` di kelas `BujurSangkar`, `radius` di kelas `Lingkaran`, dan `tinggi` di kelas `Silinder` berstatus `private` dengan setter/getter masing-masing (`getSisi()`, `setSisi()`, dsb.).

### 2. Inheritance (Pewarisan)
* **Penerapan**: Menggunakan kata kunci `extends` untuk mewariskan atribut dan method dari kelas induk (*superclass*) ke kelas anak (*subclass*).
* **Hirarki Pewarisan**:
  * `BujurSangkar` mewarisi kelas `Bentuk` (mendapatkan atribut `warna`).
  * `Lingkaran` mewarisi kelas `Bentuk` (mendapatkan atribut `warna`).
  * `Silinder` mewarisi kelas `Lingkaran` (mendapatkan atribut `warna`, `radius`, serta method `hitungLuas()`).

### 3. Polymorphism (Polimorfisme)
* **Penerapan**: Menggunakan **Method Overriding** (`@Override`) di mana subclass mendefinisikan ulang perilaku method `printInfo()` sesuai spesifikasi bentuk masing-masing.
* **Perilaku Output**:
  * `Bentuk.printInfo()` $\rightarrow$ Menampilkan warna bentuk.
  * `BujurSangkar.printInfo()` $\rightarrow$ Menampilkan warna dan hasil `hitungLuas()` bujur sangkar.
  * `Lingkaran.printInfo()` $\rightarrow$ Menampilkan warna dan hasil `hitungLuas()` lingkaran.
  * `Silinder.printInfo()` $\rightarrow$ Menampilkan warna dan hasil `hitungVolume()` silinder.

---

## 📚 Library Tambahan

* **`java.util.Scanner`**: Digunakan pada `Main.java` untuk menerima input interaktif dari pengguna melalui terminal/CLI.
* **`java.lang.Math`**: Digunakan pada kelas `Lingkaran` (`Math.PI`) untuk mendapatkan nilai konstan $\pi$ (PHI) yang akurat.

---

## 📸 Screenshot Output Program

| Menu / Fitur | Screenshot Output |
| :--- | :--- |
| **1. Demo Otomatis (All Shapes)** | ![Tampilkan Contoh](Tampilkan%20Contoh.png) |
| **2. Buat Bujur Sangkar** | ![Buat Bujur Sangkar](Buat%20Bujur%20Sangkar.png) |
| **3. Buat Lingkaran** | ![Buat Lingkaran](Buat%20Lingkaran.png) |
| **4. Buat Silinder** | ![Buat Silinder](Buat%20Silinder.png) |
| **5. Keluar Program** | ![Keluar](Keluar.png) |

---

## 📁 Struktur File Repositori

```text
src/
├── Bentuk.java        # Superclass (Encapsulation warna)
├── BujurSangkar.java  # Subclass dari Bentuk (Luas BujurSangkar)
├── Lingkaran.java     # Subclass dari Bentuk (Luas Lingkaran & Math.PI)
├── Silinder.java      # Subclass dari Lingkaran (Volume Silinder)
└── Main.java          # Program utama dengan Scanner & Menu CLI
```