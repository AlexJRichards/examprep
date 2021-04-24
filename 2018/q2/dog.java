public class dog implements pet{
    private String breed;
    private String dogName;

    public dog(String breed, String dogName){
        this.breed = breed;
        this.dogName = dogName;
    }

    public void eat(){
        System.out.println(this.dogName + " eats");
    }

    public void talk(){
        System.out.println(this.dogName + " talks");
    }

    public String toString(){
        return "Dog Name: " + this.dogName + ". Breed: " + this.breed;
    }
}