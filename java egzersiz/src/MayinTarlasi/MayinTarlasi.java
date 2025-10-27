package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    int rowNumber = 4, colNumber = 4, size;
    int[][] map;
    int[][] board;
    boolean game = true;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    MayinTarlasi(int rowNumber, int colNumber) {
        this.colNumber = colNumber;
        this.rowNumber = rowNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        prepareGame();
        // print(map); // mayınların yerini görmek istersen aç
        System.out.println("Oyun Basladi!");

        int success = 0;
        while (game) {
            print(board);
            int row, col;
            System.out.print("Satir : ");
            row = scan.nextInt();
            System.out.print("Sutun : ");
            col = scan.nextInt();

            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber) {
                System.out.println("Gecersiz koordinat, tekrar dene!");
                continue;
            }

            if (map[row][col] == -1) {
                game = false;
                System.out.println("Mayina bastin! Oyun bitti!");
                print(map);
            } else {
                checkMayin(row, col);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Tebrikler! Tum mayinlari bulmadan alanlari actin!");
                    game = false;
                }
            }
        }
    }

    void checkMayin(int r, int c) {
        if (board[r][c] == 0) {
            int count = 0;

            // etrafındaki 8 kareyi kontrol et
            for (int i = r - 1; i <= r + 1; i++) {
                for (int j = c - 1; j <= c + 1; j++) {
                    if (i < 0 || j < 0 || i >= rowNumber || j >= colNumber)
                        continue;
                    if (map[i][j] == -1)
                        count++;
                }
            }

            board[r][c] = count;

            // otomatik açma (etrafında mayın yoksa)
            if (count == 0) {
                for (int i = r - 1; i <= r + 1; i++) {
                    for (int j = c - 1; j <= c + 1; j++) {
                        if (i < 0 || j < 0 || i >= rowNumber || j >= colNumber)
                            continue;
                        if (board[i][j] == 0)
                            checkMayin(i, j);
                    }
                }
            }
        }
    }

    public void prepareGame() {
        int randRow, randCol, count = 0;
        while (count != (size / 4)) {
            randCol = rand.nextInt(colNumber);
            randRow = rand.nextInt(rowNumber);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr) {
        System.out.println("--------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0)
                    System.out.print(" - ");
                else if (arr[i][j] == -1)
                    System.out.print(" * ");
                else
                    System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }



}
