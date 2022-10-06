import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // while
        // do while
        // for
        // foreach -> for

        int x = 10;
        while(x>0) {
            x--;
        }
        do {
            // выполнится 1 раз всегда
        } while(x>0);
        int i = 0;
        int j = 1;
        for(i=0,j=1;i<100;i++,j--) {
            // какой-то
        }
        int[] a = new int[4]; // 0 0 0 0
        for(int k=0;k>a.length;i++) {
            System.out.print(a[k] + " ");
        }
        int[] b = {5,6,7,2}; // length=4; max index = 3
        // foreach
        for(Integer it: b) {
            System.out.print(it);
        }
        System.out.println();
        int[] v = new int[10];
        Random r = new Random();
        for(int p=0;p<v.length;p++) {
            v[p] = r.nextInt(100);
            System.out.print(v[p] + " ");
        }
        int[][] d = new int[5][6];
        d[4][3] = 7;
        System.out.println();
        //print2D(d);
        toSnake();
    }
    public static void print2D(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0; j<x[i].length;j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*
      int x = 10;
        while(x>0) {
            x--;// x=x-1
            x++;// x=x++
            x-=2;// x=x-2
        }
        int x1 = 10;
        int x2 = x1++;
        // x1 = 11; x2 = 10
        int y1 = 10;
        int y2 = ++y1;
        // y1 = 11; y2 = 11
     */
    public static void sumGlDiag() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] x = new int[n][m];
        int sum = 0;
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                x[i][j] = scanner.nextInt();
                if(i==j) sum += x[i][j];
            }
        }
        /*
        1(0,0) 2 (0,1) 3 (0,2)
        4(1,0) 5 (1,1) 6 (1,2)
        7(2,0) 8 (2,1) 9 (2,2)
         */
    }

    /*
  0 | 1  2  3  4
  1 | 8  7  6  5
  2 | 9  10 11 12
  3 | 16 15 14 13
     */

    public static void toSnake() {
        int[][] b = new int[4][4];
        int counter = 1;
        for(int i=0;i<b.length;i++) {
            if(i % 2 == 0) {
                for(int j=0;j< b[i].length;j++) {
                    b[i][j] = counter;
                    counter++;
                    // 1 2 3 4
                }
            } else {
                    // 8(j=0) 7 6 5
                for(int j=3;j>=0;j--) {
                    b[i][j] = counter;
                    counter++;
                }
            }
        }
        for(int i=0;i<b.length;i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}