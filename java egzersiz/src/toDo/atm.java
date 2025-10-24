package toDo;
import java.util.Scanner;
public class atm {
    public static void main(String []args){
int bakiye =1000,input;
Scanner scan = new Scanner(System.in);
System.out.println("terminal banka hosgeldin  ");
System.out.println("Guncel bakiyeniz :"+bakiye);

while (bakiye >= 0){
System.out.println("1- para cek");
System.out.println("2 - para yatir");
System.out.println("3 - bakiye sorgulama");
System.out.println("4 * cıkıs yap");
System.out.println("Yapmak ıstegınız ıslemı secınız ");

input =scan.nextInt();
switch (input) {
    case 1:
        System.out.println("hesabinizdan cekmek istediginiz miktari giriniz ");
        input = scan.nextInt();
        if (input > bakiye) {
            System.out.print("yetersiz bakiye");

        } else {

       bakiye=      bakiye - input;
            System.out.print("hesabinizdan cekilen tutar : "+input+  " kalan bakiye : " +bakiye);

        }break;
    case 2:
        System.out.println("yatirmak istedigin tutari gir : ");
        input = scan.nextInt();
      bakiye=  input + bakiye ;
        System.out.print("hesabinizdan yatirilan tutar : "+input+" guncel bakiye : "+bakiye);
break;
    case 3:
        System.out.println("Güncel bakiyeniz: " + bakiye + " ₺");
        break;

    case 4:
        System.out.println("Çıkış yapılıyor... Hoşçakalın!");
        scan.close();
        System.exit(0);
        break;

    default:
        System.out.println("Geçersiz seçim! Lütfen 1-4 arasında bir sayı giriniz.");
        break;
}
}



    }
}
