import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so tien USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gia tri VND: " + quydoi);
            double us = 1;
            double vn;
            System.out.println("Moi ban nhap vao so tien VND: ");
            vnd = scanner.nextDouble();
            double chuyen = vnd / 23000;
            System.out.println("Gia tri usd: " + chuyen);
        }

    }
