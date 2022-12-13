package lab_4;

enum Seasons {
    WINTER ("Зима"),
    SPRING ("Весна"),
    SUMMER ("Лето"),
    AUTUMN ("Осень");
    private final String rusName;
    private  Seasons(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return this.rusName;
    }
}
public class Season {
    public static void main(String[] args) {
        Seasons summer = Seasons.SUMMER;
        System.out.println("Мое любимое время года это " + summer.getRusName());
    }
}