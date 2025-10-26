package arrays;

public class MultiDimensionalArray {
 public static void main(String[] args){
     //cok boyutlu diziler
     //int[][]

     int[][] tablo =new int[][]{
             {1,75,10},
             {2,87,13},
             {3,95,15},
             {4,03,18},
             {5,110,19}
     };
int[][] tablo2 = new int[5][3];
tablo2[0][0]= 1;
tablo2[0][1]= 2;
tablo2[0][2]= 3;

for(int i =0; i< tablo.length;i++){
    for (int j =0 ;j< tablo[0].length;j++){
        System.out.print(tablo[i][j]+" ");
    }
    System.out.println();
}

     System.out.println("----------");

//sadece arraylerde olur bu islem
     for(int[] sutun :tablo){
         for(int value : sutun){
             System.out.print(value + " ");
         }
         System.out.println();
     }

 }

}
