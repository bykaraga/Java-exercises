package toDo;

public class returnMetot {
    public static void main(String[] args){

     int r2 = power(10,2);
        System.out.println(r2);
    }

    static int power (int a ,int b){
        int result =1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
}
