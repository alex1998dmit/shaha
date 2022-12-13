package lab_4;

import java.util.Scanner;

//Аутентификация пользователя. Пользователь вводит логин и пароль с клавиатуры.
public class Shop {
    public static boolean signIn(String email, String password) {
        return email.equals("admin") && password.equals("password");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email : ");
        String email = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println(Shop.signIn(email, password) ? "correct" : "not correct");
    }
}
