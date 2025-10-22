package toDo;
import java.util.Scanner;
public class BiletFiyat {

	public static void main(String[] args) {
		/*
		 * km birim fiyati : 0.10
		 * 12 yasindan kucukse toplam fiyata %50 indirim
		 * 12 24 yas arasindayda toplam fiyata %10 indirim
		 * 65 yasindan buyukse %30 indirim
		 * gidis donus alirsa %20 indirim 
		 * bu kosullara gore ucak bileti hesapliyan program
		 */
Scanner scan =new Scanner(System.in);

int km,yas,tip;
double fiyat,indirimliFiyat,tipIndirimi;

System.out.println("Enter your distance with km : ");
 km =scan.nextInt();
 
 
System.out.println("enter your age : ");
 yas = scan.nextInt();
System.out.println("yolculuk tipini seciniz (1 tek gidis,2 gidis gelis)");
tip =scan.nextInt();

if(km >0 &&yas>0 && (tip ==1 || tip ==2)) {
	System.out.println("girdiler dogru");
	 fiyat = km*0.10;
	if(yas <=12) {
		indirimliFiyat = fiyat * 0.5;
		fiyat = fiyat - indirimliFiyat;
		
	}
	else if (yas >12 &&yas <=24) {
		System.out.println("yas 12 den buyuk 24 e esit yada kuck");
		indirimliFiyat = fiyat * 0.1;
		fiyat = fiyat - indirimliFiyat;
	}
	else if(yas >=65) {
		System.out.println("65 yas ve uzeri %30 indirimli");
		indirimliFiyat = fiyat * 0.3;
		fiyat = fiyat - indirimliFiyat;
	}else {
		indirimliFiyat = 0;
		
	}
	
	fiyat = fiyat - indirimliFiyat;
	if(tip ==2) {
		tipIndirimi = fiyat *0.2;
		fiyat = (fiyat-tipIndirimi)*2;
	}
	System.out.println(" Bilet tutari :" + fiyat+"$");
}
else
{
	System.out.println("girdiler yanlis");
}

		
	}

}
