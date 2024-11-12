package AnimalShelter;

public class Animal {
    private String name;
    private int arrivalNum;

    public Animal(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArrivalNum() {
        return arrivalNum;
    }

    public void setArrivalNum(int arrivalNum) {
        this.arrivalNum = arrivalNum;
    }

    // Oldest animal check
    public boolean isOlderThan(Animal other) {
        return this.arrivalNum < other.arrivalNum;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", arrivalNum=" + arrivalNum +
                '}';
    }
}
