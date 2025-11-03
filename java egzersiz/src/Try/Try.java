package Try;

public class Try {
    public static void main(String[] args)  {
        System.out.println("program basladi");
//        int a = 0;
//
//       try{
//          a = 2/0; //hata yakaladik
//           System.out.println(a);
//       }catch(ArithmeticException e){
//           System.out.println(e.getMessage());
//       }

        int[] arr = new int[3];
        try {
            arr[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Program bitti");
            System.out.println(e.toString());
        }


    }
}
