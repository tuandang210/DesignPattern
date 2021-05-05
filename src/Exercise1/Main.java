package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập loại cần vẽ");
            String type = scanner.nextLine();
            ShapeFactory.getShape(type).draw();
        } while (true);
    }
}
