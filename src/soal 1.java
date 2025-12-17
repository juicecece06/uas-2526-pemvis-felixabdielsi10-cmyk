//Felix Siadari-12S25043//
//Jusmer Pasaribu-12S25012//
import java.util.*;
import java.lang.Math;

public class SOAL 1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, rating;
        int total, max, min, count;
        double rata;
        String daftar;

        n = Integer.parseInt(input.nextLine());
        total = 0;
        count = 0;
        daftar = "";
        for (i = 1; i <= n; i++) {
            rating = Integer.parseInt(input.nextLine());
            if (i == 1) {
                max = rating;
                min = rating;
            }
            total = total + rating;
            if (rating >= 4) {
                count = count + 1;
            }
            if (rating > max) {
                max = rating;
            }
            if (rating < min) {
                min = rating;
            }
            daftar = daftar + rating + "";
        }
        rating = hitungRata(total, n);
        System.out.println("Daftar rating:" + daftar);
        System.out.println("Rata rata:" + toFixed(rata,2));
        System.out.println("Tertinggi:" + max);
        System.out.println("Terendah:" + min);
        System.out.println("Reviewer rating>=4:" + count + "orang");
        cekkondisi(rata);
    }
    
    public static void cekkondisi(double rata) {
        if (rata >= 4) {
            System.out.println("Kondisi sangat baik.");
        } else {
            if (rata >= 3) {
                System.out.println("Kondisi cukup,masih perlu peningkatan");
            } else {
                System.out.println("Kondisi buruk");
            }
        }
    }
    
    public static int hitungRata(int total, int n) {
        int rata;

        rata = (double) total / n;
        
        return rata;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
