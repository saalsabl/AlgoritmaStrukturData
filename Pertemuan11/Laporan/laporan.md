# Laporan Praktikum Pertemuan 12
Nama          : Aaisyah Nursalsabiil

NIM           : 2341720171

Kelas / absen : 1H - TI / 01

## 12.2 Percobaan 1
<img src="Percobaan1.png">

### 12.2.3 Pertanyaan
1. Jelaskan perbedaan antara single linked list dengan double linked lists!
Jawab : 
Single Linked List : Hanya memiliki pointer next, memori lebih hemat karena hanya memiliki 1 pointer pada setiap node.
Double Linked List : Memiliki 2 pointer yaitu next dan preview, menggunakan memori lebih banyak karena memiliki 2 pointer pada setiap node.

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?
Jawab : 
Atribut next digunakan untuk menunjukkan node selanjutnya dalam data yang ada.
Atribut prev digunakan untuk menunjukkan node sebelumnya dalam data yang ada.

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?
<img src="Pertanyaan3.1.png">


4.  Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?
``` Node newNode = new Node(null, item, head); ```
Jawab : 
Dalam double linked list, method addFirst() menambahkan node baru di awal daftar. Node baru menjadi head, sehingga pointer prev diinisialisasi dengan null karena tidak ada node sebelumnya. Pointer next node baru diatur ke node yang saat ini menjadi head, dan jika daftar tidak kosong, prev dari head lama diatur ke node baru. Terakhir, head diperbarui ke node baru.

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
Jawab : 
Statement head.prev = newNode digunakan untuk memastikan bahwa node lama yang menjadi head sekarang mengenali node baru sebagai node sebelumnya, dan memastikan bahwa pointer next dan retv dapat diakses.

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?
``` Node newNode = new Node(current, item, null); ```
Jawab : 


7. Pada method add(), terdapat potongan kode program sebagai berikut:
<img src="Pertanyaan7.1.png">
jelaskan maksud dari bagian yang ditandai dengan kotak kuning.
Jawab : 


## 12.3 Percobaan 2
<img src="Percobaan2.png">

### 12.3.3 Pertanyaan
1. Apakah maksud statement berikut pada method removeFirst()?
head = head.next;
head.prev = null;
Jawab : 
`head = head.next` digunakan untuk mengubah head menjadi node berikutnya setelah node pertama dihapus.
`head.prev = null` digunakan untuk memastikan bahwa tidak ada node sebelumny (prev) yang terhubung dengan head baru.

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
Jawab : 


3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
<img src="Pertanyaan3.2.png">
4. Jelaskan fungsi kode program berikut ini pada fungsi remove!
<img src="Pertanyaan4.2.png">

## 12.4 Percobaan 3
<img src="Percobaan3.png">

### 12.4.3 Pertanyaan
1. Jelaskan method size() pada class DoubleLinkedLists!
Jawab : 
Dengan ada nya method size() kita bisa mengetahui berapa banyak elemen yang ada dalam double linked list.

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1!
Jawab :


3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!
Jawab : 
- Single Linked List : hanya memiliki pointer next sehingga hanya perlu menembukan node terakhir dan menambahkan node baru di belakangnya.
- Double Linked List : memiliki 2 pointer next dan prev sehingga harus mencaru node di posisi yang diinginkan, kemudian memperbarui pointer 'next' untuk menambahkan node baru.

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!
    a. <img src="Pertanyaan4a.png">
    b. <img src="Pertanyaan4b.png">