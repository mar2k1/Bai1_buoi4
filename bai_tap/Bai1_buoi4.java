package bai_tap;

import java.util.Scanner;

public class Bai1_buoi4 {
    String point;
    // hoành độ
    int x;

    // tung độ
    int y;

    // a) phương thức get/set:
    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /*
     * b) Phương thức khởi tạo (constructor)
     * i) Gán cho hoành độ và tung độ = 0, tên điểm mặc định là "A"
     */
    public Bai1_buoi4() {
        this.x = 0;
        this.y = 0;
        this.point = "A";
    }

    // ii) nhận hai số thực làm tham số:
    public Bai1_buoi4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // iii) nhận 1 xâu ký tự và 2 số thực làm tham số
    public Bai1_buoi4(String point, int x, int y) {
        this.point = point;
        this.x = x;
        this.y = y;
    }

    // c) Viết phương thức nhập vào một điểm từ bàn phím: Nhập tung độ và hoành độ
    // từ bàn phím).
    public void input(Scanner scan) {
        System.out.println("Tên điểm:");
        this.point = scan.nextLine();
        System.out.println("Hoành độ (x):");
        this.x = scan.nextInt();
        System.out.println("Tung độ (y):");
        this.y = scan.nextInt();
    }

    // d) in thông tin một điểm ra màn hình dưới dạng: Tên_điểm(Tung_độ, Hoành_độ).
    // Ví dụ: A(2, 4).
    public void infoPrint() {
        System.out.println(this.point + "(" + this.y + "," + this.x + ")");
    }

    // e) Viết hàm main kiểm tra các phương thức đã cài đặt cho lớp.
    public static void main(String[] args) {
        // trường hợp x,y =0
        Bai1_buoi4 p1 = new Bai1_buoi4();
        p1.infoPrint();

        // x và y 2 số nguyên
        Bai1_buoi4 p2 = new Bai1_buoi4(2, 4);
        p2.infoPrint();

        // Tên_điểm(Tung_độ, Hoành_độ). Ví dụ: A(2, 4)
        Bai1_buoi4 p3 = new Bai1_buoi4("A", 2, 4);
        p3.infoPrint();
    }
}
