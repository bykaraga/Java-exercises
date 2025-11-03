package Try;

public class Throw {
    public static void main(String[] args) {

        int a = 0;
        if(a == 0){
            System.out.println("Bolen 0 sa esit olamaz ");
            throw new ArithmeticException("Exception !");
        }
        System.out.println("Kodun devami");


    }
}
