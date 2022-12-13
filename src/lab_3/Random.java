package lab_3;

//Создать массив вещественных чисел случайным образом,
//        вывести его на экран, отсортировать его, и снова вывести на экран
//        (использовать два подхода к генерации случайных чисел – метод random() класса Math и класс Random)
public class Random {
    public static void main(String[] args) {
        java.util.Random rd = new java.util.Random();
        double[] arr1 = new double[5];
        double[] arr2 = new double[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rd.nextInt();
            arr2[i] = Math.random();
            System.out.println("By Random class is " + arr1[i]);
            System.out.println("By random method in Math class is " + arr1[i]);
        }

    }
}