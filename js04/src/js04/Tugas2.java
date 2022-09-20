/*
 * Created by : 21343031_Muhammad Reviza Dekry
 */
package js04;

/**
 *
 * @author FarhanNvl
 */
public class Tugas2 {
    public static void main(String[] args) {

        int a = 10; 
        int b = 23;
        int c = 5;

        int max;

        System.out.println("number 1 = " + a);
        System.out.println("number 2 = " + b);
        System.out.println("number 3 = " + c);
        // mencari nilai tertinggi dengan operator kondisi
        max = (b >= a) ? b : a;
        max = (c >= max) ? c : max;
        System.out.println("Nilai Tertingginya adalah angka = " + max);

    }

}
