package lab_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author vasya = new Author("Vasya", "vasyan@mirea.ru", 'm');
        Author tanya = new Author("Tanya", "tanya@mirea.ru", 'f');
        System.out.println(vasya.toString());
        vasya.setEmail("new_vasya@mirea.ru");
        System.out.println(vasya.toString());
        System.out.println(tanya.toString());
    }
}
