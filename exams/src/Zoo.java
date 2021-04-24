import java.util.Vector;

public class Zoo {
    private Vector<Animal> animals;
    private int capacity;

    public Zoo(){
        this.animals = new Vector<Animal>();
        this.capacity = 10;
    }

    public Zoo(int capacity){
        this.animals = new Vector<Animal>();
        this.capacity = capacity;
    }

    public void addAnimal(Animal newAnimal){
        this.animals.add(newAnimal);
    }

    public boolean hasAnimalWithName(String findName){
        for (Animal a : animals){
            if (a.getName().equals(findName)){
                return true;
            }
        }
        return false;
    }

    public String getAnimalWithName(String findName){
        for (Animal a : animals){
            if (a.getName().equals(findName)){
                return a.getName();
            }
        }
        return "";
    }
}
