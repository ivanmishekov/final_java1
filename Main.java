import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Laptop> set = new HashSet<>();
        set.add(new Laptop("Laptop 1", 8, "Windows8", 80000, "Acer"));
        set.add(new Laptop("Laptop 2", 16, "Windows10", 88000, "hp"));
        set.add(new Laptop("Laptop 3", 32, "Linux", 75000, "Lenovo"));
        set.add(new Laptop("Laptop 4", 64, "MacOS", 100000, "Apple"));

        OperationWithLaptop operation = new OperationWithLaptop(set);
        operation.start();

    }
}