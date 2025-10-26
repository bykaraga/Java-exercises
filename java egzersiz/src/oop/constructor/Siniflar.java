package oop.constructor;
import java.util.Scanner;
public class Siniflar {
    public static void main(String[] args){
        //object oriented Programming
        //sinifAdi objeAdi = new SinifAdi();
        // Constructor (yapici)

//        HesapMakinesi makine1;
//        makine1 = new HesapMakinesi(1,2);//varsayilan deger atama
//
//
//        makine1.sayi1 =5; // varsayilan degeri degistirme
//        System.out.println(makine1.sayi1 + "-"+ makine1.sayi2);
Scanner scan = new Scanner(System.in);

        HesapMakinesi m1 =new HesapMakinesi(10,5,"siyah");


        System.out.println("birinci hesap makinesi islem sonucu : "+m1.toplama()+ " hesap makinesi rengi "+m1.renk);

        HesapMakinesi m2 = new HesapMakinesi(20,3,"mavi");



        System.out.println("ikinci hesap makinesi islem sonucu : "+m2.toplama()+" hesap makinesi rengi "+m2.renk);
    }
}
