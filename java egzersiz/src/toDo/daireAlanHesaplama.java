package toDo;
import java.util.Scanner;
public class daireAlanHesaplama {

	public static void main(String[] args) {
		int r;
		double alan,hacim,pi =3.14;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Daire yari capini giriniz \n");
		r= input.nextInt();
		alan = 2*pi *r;
		hacim = pi *(r*r);
		System.out.println("daire alani " +alan);
		System.out.print("dairenin hacmi "+hacim);
		input.close();
	}

}
