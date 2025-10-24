package toDo;

public class metotlar {
    public static void main(String[] args){

        //f(x) = (x+2) *6;

        //fonksyion cagirma
//        f(4);
//        System.out.println("ikinci metot");
//        f(6);
   power(2,3);
power(3,3);


    }
    //    F = fonkisyon ismi (istedigin ismi yaz) PARANTEZ ICINE PARAMETRE DENIR
   static void f(int x){
int result =(x +2)*6;
        System.out.println(result);
    }


//ust altma fonksionu
    static void power(int number1,int number2){
        int result = 1;
        for(int i=1 ; i <= number2;i++){
            result *= number1;
        }
        System.out.println("Cevap : "+result);
    }





}
