import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>();
        ArrayList<String> names3 = new ArrayList<>();
        while (i < 10){
            System.out.println("Введите значение");
            String name = scanner.next();
            i++;
            System.out.println(name);
            System.out.println(i);
            if(i <= 5){
                names.add(name);
            }
            else if(i > 5 && i < 11){
                names2.add(name);
            }
        }
        System.out.println(names);
        System.out.println(names2);
        Collections.sort(names);
        Collections.sort(names2);
        Collections.reverse(names2);
        System.out.println(names);
        System.out.println(names2);
        names3.addAll(names);
        names3.addAll(names2);
        System.out.println(names3);
        names3.set(0, names.get(0));
        names3.set(1, names2.get(0));
        names3.set(2, names.get(1));
        names3.set(3, names2.get(1));
        names3.set(4, names.get(2));
        names3.set(5, names2.get(2));
        names3.set(6, names.get(3));
        names3.set(7, names2.get(3));
        names3.set(8, names.get(4));
        names3.set(9, names2.get(4));
        System.out.println(names3);
        Collections.sort(names3, new Sort());
        System.out.println(names3);
    }
}
// Алексей Борис Вазген Гарик Дима
// Алина Биатрис Виктория Галла Дура
