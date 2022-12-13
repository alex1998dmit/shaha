package lab_4;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;


//Аутентификация пользователя. Пользователь вводит логин и пароль с клавиатуры.
public class Shop {
    public static boolean signIn(String email, char[] password) {
        char[] correctPassword = { 'p', 'a', 's', 's' };
        return email == "admin" && Arrays.equals(password, correctPassword);
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String email = console.readLine("Enter email : ");
        char[] password = console.readPassword("Enter password : ");
        System.out.println(password.toString());
        System.out.println(Shop.signIn(email, password) ? "correct" : "not correct");
    }
}
