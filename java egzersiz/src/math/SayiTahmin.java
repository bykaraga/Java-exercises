package math;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int tahmin =0, can = 3,i=0;
        boolean oyunDurum = false;
        int sayi = rand.nextInt(10);
int[] tahminler =new int[3];

        System.out.println("Sayi tahmine hosgeldin");
        System.out.println("3 tane tahmin hakkin var rasgele bir sayiyi tahmin et 1 ila 10 arasinda");

        while (can > 0) {

            System.out.println("tahmin : ");
            tahmin = scan.nextInt();
            tahminler[i++]=tahmin;
            if (tahmin < 0 || tahmin > 10) {
                System.out.println("lutfen 1-10 arasinda bir deger giriniz ...");
                continue;
            }
            if (tahmin == sayi) {
                oyunDurum = true;
                break;

            } else {
                System.out.println("yanlis secim tekrar dene ..." + "kalan can " + --can);
            }
        }
        if (oyunDurum) {
            System.out.println("bildin la helal ");
            System.out.println("sayiniz : " + tahmin);
            System.out.println("Kalan can :" + can);
        } else {
            System.out.println("basaramadin sayi :" + sayi);
        }
        System.out.println("tahminleriniz : ");
        for (int value : tahminler){
            System.out.print(value+",");
        }
    }


}
