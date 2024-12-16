/**
 * Клас, що представляє об'єкт "Човен".
 */

public class Boat {
    private String name;
    private String type;
    private double speed;
    private double draft;
    private double length;

    /**
     * Конструктор для створення об'єкта човна.
     *
     * @param name назва човна
     * @param type тип човна
     * @param speed швидкість човна у вузлах
     * @param draft осадка човна у метрах
     * @param length довжина човна у метрах
     */
    public Boat(String name, String type, double speed, double draft,  double length) {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.draft = draft;
        this.length = length;
    }

    /**
     * Повертає назву човна.
     *
     * @return назва човна
     */
    public String getName() {
        return name;
    }
    /**
     * Повертає тип човна.
     *
     * @return тип човна
     */
    public String getType() {
        return type;
    }

    /**
     * Повертає швидкість човна.
     *
     * @return швидкість човна у вузлах
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Повертає осадку човна.
     *
     * @return осадка човна у метрах
     */
    public double getDraft(){
        return draft;
    }

    /**
     * Повертає довжину човна.
     *
     * @return довжина човна у метрах
     */
    public double getLength() {
        return length;
    }

    /**
     * Повертає текстове представлення об'єкта.
     *
     * @return рядок із інформацією про човен
     */
    @Override
    public String toString() {
        return "Човен{" +
                "Назва='" + name + '\'' +
                ", Тип='" + type + '\'' +
                ", Швидкість=" + speed +
                ", Осадка=" + draft +
                ", Довжина=" + length +
                '}';
    }

    /**
     * Порівнює два об'єкти на рівність.
     *
     * @param obj об'єкт для порівняння
     * @return true, якщо об'єкти ідентичні, інакше false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Boat boat = (Boat) obj;
        return Double.compare(boat.speed, speed) == 0 &&
                Double.compare(boat.draft, draft) == 0 &&
                Double.compare(boat.length, length) == 0 &&
                name.equals(boat.name) &&
                type.equals(boat.type);
    }

}
