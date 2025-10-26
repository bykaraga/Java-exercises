package arrays;

import java.util.Scanner;

public class MultiDimArrayExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 5;
        int cols = 6;


        int[][] seats = new int[rows][cols];

        while (true) {

            System.out.println("Koltuk Durumu (0=Boş, 1=Dolu):");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }


            System.out.print("Rezerve etmek istediğiniz koltuğun satırını girin (1-5, çıkmak için 0): ");
            int row = scanner.nextInt();
            if (row == 0) break;
            System.out.print("Rezerve etmek istediğiniz koltuğun sütununu girin (1-6): ");
            int col = scanner.nextInt();


            row--;
            col--;


            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                if (seats[row][col] == 0) {
                    seats[row][col] = 1;
                    System.out.println("Koltuk başarıyla rezerve edildi!");
                } else {
                    System.out.println("Bu koltuk dolu, başka koltuk seçin.");
                }
            } else {
                System.out.println("Geçersiz koltuk numarası.");
            }

            System.out.println();
        }

        System.out.println("Programdan çıkılıyor.");
        scanner.close();
    }
}

