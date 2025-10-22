package toDo;
import java.util.Scanner;
//kdv hesaplama
public class egzersizBir {

	public static void main(String[] args) {
		/* 
		 * maliyet
		 * kdv orani
		 * satis fiyati
		 * kar orani */
		Scanner kdvscan =new Scanner(System.in);
		System.out.println("urunun kdv miktarini giriniz...");
		double kdvmiktari = kdvscan.nextDouble();
		System.out.println("urunun maliyetini giriniz...");
		double maliyet = kdvscan.nextDouble();
		System.out.println("urunun satis fiyatini giriniz");
		double satisFiyat = kdvscan.nextDouble();
		
		double kdv = satisFiyat * (kdvmiktari / 100);

		double kar = (satisFiyat - maliyet);
		double karOrani = (kar / maliyet) * 100;
		System.out.println("Kar miktari: " + kar);
		System.out.println("Kar orani: %" + karOrani);

	}

}
