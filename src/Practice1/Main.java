package Practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập loại cần tạo");
        String type =sc.nextLine();
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        System.out.println(factoryAnimal.getAnimal(type).makeSound());;

    }
}
