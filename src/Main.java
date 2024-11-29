import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Boat[] boats = {
                new Boat("Вірджинія", "Крейсер", 30, 10.5, 179.0),
                new Boat("Ноосфера", "Криголам", 12, 6.3, 99.5),
                new Boat("Емма Маерск", "Вантажний", 31, 13.7, 397.2),
                new Boat("Аззам", "Яхта", 32, 15.8, 180),
                new Boat("Симфонія морів", "Круїзне", 22, 9.3, 361.1)
        };

        Arrays.sort(boats, Comparator.comparingDouble(Boat::getSpeed));
        System.out.println("Сортування за зростанням швидкості:");
        for (Boat boat : boats) {
            System.out.println(boat);
        }


        Arrays.sort(boats, Comparator.comparingDouble(Boat::getDraft).reversed());
        System.out.println("\nСортування за зменшенням осадки:");
        for (Boat boat : boats) {
            System.out.println(boat);
        }

        Boat target = new Boat("Ноосфера", "Криголам", 12, 6.3, 99.5);
        boolean found = Arrays.asList(boats).contains(target);
        System.out.println("\nЧи знайдено ідентичний об'єкт? " + found);
    }
}
