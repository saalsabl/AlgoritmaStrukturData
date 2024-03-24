# Laporan Praktikum Pertemuan 5

Nama            : Aaisyah Nursalsabiil Ni Patriarti

NIM             : 2341720171

Kelas / absen   : 1H - TI / 01

## 4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
<img src="Percobaan1.png">

### 4.2.3 Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
Jawaban :
Kondisi if memeriksa kondisi awal apakah n sama dengan 1, jika iya maka akan mengembalikan nilai 1 karena 1 adalah faktorial dari 1. Kondisi else digunakan ketika n tidak sama dengan 1, yang kemudian akan menghitung nilai faktorial dengan mengalikan n dengan fungsi faktorialDC(n - 1). Perbedaan bagian kode ini yaitu pada kondisi if langsung mengembalikan nilai 1, sedangkan pada kondisi else akan menghitung perkalian nilai n dengan hasil rekursif dari faktorialDC(n - 1).

2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!
Jawaban : 
Selain for, bisa juga menggunakan while dan do-while.
<img src="PertanyaanP1.2.1.png">
<img src="PertanyaanP1.2.2.png">

3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
Jawaban :
fakto *= i, nilai i dikalikan dengan nilai fakto sebelumnya yang hasilnya disimpan ke variabel fakto. 
Sedangkan int fakto = n * faktorialDC(n-1), nilai n dikalikan dengan fungsi itu sendiri untuk menghitung (n-1) yang kemudian hasilnya akan dikalikan dengan n dan disimpan ke variabel fakto. 
Jadi fakto *= i; mengalikan angka i sampai dengan n untuk mendapatkan hasil faktorial sedangkan int fakto = n * faktorialDC(n-1); memecah masalah menjadi lebih kecil yaitu faktorialDC(n-1) dan mengalikannya dengan n untuk mendapatkan hasil faktorial.

## 4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
<img src="Percobaan2.png">

### 4.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
jawaban : 
Untuk method PangkatBF menggunakan perulangan sedangkan untuk method PangkatDC menggunakan fungsi rekursif

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
Jawaban : 
Iya, tahap combine sudah termasuk dalam kode
    ```return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);```
    ```return (pangkatDC(a, n/2)*pangkatDC(a, n/2));```

3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.
Jawaban : 
- Konstruktor
<img src="Konstruktorpangkatmodif.png">
- Main
<img src="Mainpangkatmodif.png">
- Hasil
<img src="Hasilpangkatmodif.png">

4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case!
Jawaban : 
- Main
<img src="Menupangkat.png">
- Hasil
<img src="HasilMenuPangkat.png">

## 4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
<img src="Percobaan3.png">

### 4.4.3 Pertanyaan
1. Mengapa terdapat formulasi return value berikut?Jelaskan!
Jawaban :
Karena method tersebut merupakan method void yang membutuhkan nilai kembalian dan return value tersebut juga digunakan sebagai tahap combine

2. Kenapa dibutuhkan variable mid pada method TotalDC()?
Jawaban :
Variable mid digunakan untuk pembagi masalah awal menjadi 2 masalah kecil yang digunakan untuk menjumlahkan elemen dari sub-array kanan dan sub array-kiri.

3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!
Jawaban : 
- Main
<img src="MainSumModif.png">
- Hasil
<img src="HasilMainSumModif.png">

## Latihan Praktikum
Tentukan: 
A. top_acceleration tertinggi menggunakan Divide and Conquer! 
B. top_acceleration terendah menggunakan Divide and Conquer! 
C. Rata-rata top_power dari seluruh mobil menggunakan Brute Force!

- Object
<img src="ObjectLatihan.png">
- Main
<img src="MainLatihan.png">
- Hasil
<img src="HasilLatihan.png">