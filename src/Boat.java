

public class Boat {
    private String name;
    private String type;
    private double speed;
    private double draft;
    private double length;

    public Boat(String name, String type, double speed, double draft,  double length) {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.draft = draft;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDraft(){
        return draft;
    }

    public double getLength() {
        return length;
    }

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
