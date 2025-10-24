package toDo;

public class overloading {
  // add(int ,int)
    static int add(int a,int b){
        System.out.println("birinci mettot");
        return a+b;
    }
    static int add(int a,int b ,int c){
        System.out.println("ikinci mettot");
        return a+b+c;
    }
static double add(int a, int b ,double c){
    System.out.println("ucuncu mettot");
        return a+b+c;
}
    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,9.0));
    }

}
