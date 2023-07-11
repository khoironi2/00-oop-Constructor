package com.tutorial;

class Mahasiswa{
    String nama;
    String nrp;
    String jenis_kelamin;
    Double IPK;
    int umur;

   Mahasiswa(String Inputnama, String Inputnrp, String Inputjenis_kelamin, Double InputIPK, int Inputumur){
        nama = Inputnama;
        nrp = Inputnrp;
        jenis_kelamin = Inputjenis_kelamin;
        IPK = InputIPK;
        umur = Inputumur;

        System.out.println(nama);
        System.out.println(nrp);
        System.out.println(jenis_kelamin);
        System.out.println(IPK);
        System.out.println(umur);
    }
}

public class Main {
    public static void main(String[] args)  {
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Jack","2131","laki-laki",3.4,22);
        Mahasiswa mahasiswa2 = new Mahasiswa("Lita","2131","Perempuan",3.4,22);
        
    }
}
