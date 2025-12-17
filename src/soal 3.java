//Felix Siadari-12S25043//
//Jusmer Pasaribu-12S25012//


import java.util.*;
import java.lang.Math;

public class SOAL 3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j, jumlah, x, konsumsi, totalkamar;
        String nama;

        totalkamar = 0;
        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            jumlah = Integer.parseInt(input.nextLine());
            konsumsi = 0;
        }
        for (j = 1; j <= jumlah; j++) {
            x = Integer.parseInt(input.nextLine());
            konsumsi = konsumsi + x;
        }
        totalkamar = totalkamar + konsumsi;
        System.out.println("nama = konsumsi wh");
        System.out.println("Total konsumsi kamar = totalKamar wh");
        if (totalkamar <= 1000) {
            System.out.println("Konsumsi masih dalam batas wajar");
        }
    }
}

