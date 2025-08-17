import java.util.Scanner;

public class Main {
    public void main(String[] args) {

        module7();
    }

    public void module7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert an int: ");
        int numOne = scanner.nextInt();

        System.out.println("Please insert another int: ");
        int numTwo = scanner.nextInt();

        if (numOne > numTwo) {
            System.out.println("Num 1 is bigger" + numOne);
        } else if (numOne < numTwo) {
            System.out.println("Num 2 is bigger: " + numTwo);
        } else System.out.println("Both are the same number");


    }

    public void module5() {
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

        System.out.println("Data input: " + name + " " + cpf + " " + age + " " + weight + " " + " " + height);
    }
}