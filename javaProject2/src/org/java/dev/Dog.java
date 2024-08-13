package org.java.dev;

public class Dog {
	String name;
	String breed;
	Dog(String name,String breed){
		this.name = name;
		this.breed = breed;
	}
	//setter
    void setName(String name) {
        this.name = name;
    }
    void setBreed(String breed) {
        this.breed = breed;
    }
    // Getter 
    String getName() {
        return this.name;
    }
 String getBreed() {
        return this.breed;
    }
    public static void main(String[] args) {
        Dog d1 = new Dog("Fido", "Golden Retriever");
        Dog d2 = new Dog("Rex", "German Shepherd");

        System.out.println("Dog Names & Breeds:");
        System.out.println("Dog1: " + d1.getName() + ", Breed of Dog 1: " + d1.getBreed());
        System.out.println("Dog2: " + d2.getName() + ", Breed of of Dog 2: " + d2.getBreed());

        d1.setName("Buddy");
        d2.setName("Agi");
        d1.setBreed("Labrador");
        d2.setBreed("American BullDog");

        System.out.println("Updated Dog Names & Breeds:");
        System.out.println("Updated name of Dog1: " + d1.getName() + ", Updated Breed of Dog 1: " + d1.getBreed());
        System.out.println("Updated name of Dog2: " + d2.getName() + ", Updated Breed of Dog 2: " + d2.getBreed());
    }
}


