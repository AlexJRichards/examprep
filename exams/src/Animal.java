public class Animal {
    private String name;
    private int totalNumAnimals;

    public Animal(String name, int totalNumAnimals){
        this.name = name;
        this.totalNumAnimals = totalNumAnimals;
    }

    public String getName(){
        return this.name;
    }

    public int getTotalNumAnimals(){
        return this.totalNumAnimals;
    }
}
