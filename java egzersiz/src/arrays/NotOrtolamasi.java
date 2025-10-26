package arrays;

import java.util.Scanner;

public class NotOrtolamasi {
    public static void main(String[] args){
        int[] notlar = new int[7];
        Scanner scan = new Scanner(System.in);

        int toplam=0;

        System.out.println("hosgeldin ! lutfen notlarinizi sirayla giriniz ");
        System.out.println("Mat 1 : ");
        notlar[0] = scan.nextInt();
        System.out.println("Turkce : ");
        notlar[1] = scan.nextInt();
        System.out.println("fizik : ");
        notlar[2] = scan.nextInt();
        System.out.println("tarih : ");
        notlar[3] = scan.nextInt();
        System.out.println("kimya : ");
        notlar[4] = scan.nextInt();
        System.out.println("beden : ");
        notlar[5] = scan.nextInt();
        System.out.println("muzik : ");
        notlar[6] = scan.nextInt();

        for(int not : notlar){
            toplam += not;
        }
        System.out.println("Ortalamaniz :"+(toplam/ notlar.length));
    }
}
