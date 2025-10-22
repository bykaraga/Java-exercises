package toDo;
import java.util.Scanner;
// basic avarage.
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);

System.out.print("Kac sayi gireceksin ... ");
int n =input.nextInt();
int[] sayilar = new int[n];
int toplam = 0;
for (int i=0; i<n ;i++) {
	System.out.print((i+1)+ ". sayiyi giriniz ");
	sayilar[i] =input.nextInt();
	toplam += sayilar[i];
}
double ortalama = (double) toplam / n;
System.out.print("\nOrtalama = "+ ortalama);

input.close();
	}

}
