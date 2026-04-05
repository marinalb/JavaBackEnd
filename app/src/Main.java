import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        module9();
    }

    public static void module9() {
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.print("Inter a number for times table: ");
        int num = sc.nextInt();
        int cont = 1;

        while (cont <= 10) {
            System.out.println(num + " x " + cont + " = " + (num * cont));
            cont++;
        }
        do {
            System.out.println("Please insert 1 to Continue or 2 to Exit: ");
            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.println("Please enter a statement: ");
                String statement = sc.nextLine();
                System.out.println(statement);
            } else if (option != 2) {
                System.out.println("Invalid option");
            }
        } while (option != 2);
        System.out.println("Thanks for using the app! Hope you like it :) ");

    }

    public static void module8() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, insert your name: ");
        String nome = sc.nextLine();
        System.out.println("Insert a number: ");

        while (!sc.hasNextInt()) {
            System.out.println("Needs to be a number");
            sc.next();
        }
        int num = sc.nextInt();

        for(int i=0; i <= num; i++) {
            System.out.println(i);
        }

        for(int i = num; i >= 0; i--) {
            System.out.println(i);
        }

      if (nome.length() > 6) {
          System.out.println(nome);
      }else {
          for (int i=0; i< nome.length(); i++) {
              System.out.println(nome);
          }
      }
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