//Felix Siadari-12S25043//
//Jusmer Pasaribu-12S25012//


import java.util.*;
import java.lang.Math;

public class SOAL 5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, gaji, pengalaman;
        String nama;
        double ipk;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            ipk = Double.parseDouble(input.nextLine());
            gaji = Integer.parseInt(input.nextLine());
            pengalaman = Integer.parseInt(input.nextLine());
            if (ipk >= 3.0 && gaji <= 3000000 && pengalaman >= 3) {
                System.out.println("Lolos");
            } else {
                System.out.println("Tidak Lolos");
            }
        }
    }
}
