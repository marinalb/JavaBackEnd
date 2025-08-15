import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome!");

        System.out.println("Please insert your name: ");
        String name = scanner.nextLine();

        System.out.println("Please insert your CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Please insert your age: ");
        int age = scanner.nextInt();

        System.out.println("Please insert your weight in kg: ");
        float weight = scanner.nextFloat();

        System.out.println("Please insert your height: ");
        float height = scanner.nextFloat();

        System.out.println("Data input: " + name+ " " + cpf + " " + age + " " + weight + " " + " " + height);


    }
}