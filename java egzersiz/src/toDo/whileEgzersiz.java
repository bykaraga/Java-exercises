package toDo;
import java.util.Scanner;
public class whileEgzersiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1 den 100 e cift saiylar
	/*	int i = 1;
		while (i <=100){
		if(i %2 ==0) {	
			System.out.println(i);
			
			}
		i++; 
		} */
		
	/*	// negetif deger gelene kadar girdileri kabul etme
		
	
		System.out.println("deger gir");
		
		
		while(true) {
			int i = scan.nextInt();
			if(i <0) {
				break;
				}
			System.out.println("sayi");
			System.out.println(i);
		} 
		*/

	/*	
		//x sayisina kadar olan 2 nin kuvvetleri 
	int input;
	int k=1;
System.out.print("sayi girin");
input = scan.nextInt();
while(k < input)
{
	System.out.println(k);
	k = k*2;
}

	
	
	*/
	
	
	//faktoriyel 
	/*	
	System.out.println("sayi giriniz");
	
	int f;
	int sonuc = 1 ;
	f = scan.nextInt();
	while(f > 0)
	{
		
		sonuc *=f;
		f--;
	}System.out.print(sonuc);
	
	
	*/
	//asal sayı bulma
		System.out.println("Asal sayi bulmak icin sayi giriniz:");
		int sayi = scan.nextInt();

		boolean asal = true; 

		if (sayi < 2) {
		    asal = false; 
		} else {
		    for (int i = 2; i <= sayi / 2; i++) { 
		        if (sayi % i == 0) {
		            asal = false;
		            break;
		        }
		    }
		}

		if (asal) {
		    System.out.println(sayi + " asal sayidir.");
		} else {
		    System.out.println(sayi + " asal sayi degildir.");
		}
		
		
		
		
		
		
		
	}

}
