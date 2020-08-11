import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    
    List<Animal> animalList = new ArrayList<>();

    animalList.add(new Animal("Lion", 5, "Land Animal"));
    animalList.add(new Animal("Frog", 2, "Amphibian"));
    animalList.add(new Animal("Fish", 1, "Aquatic"));


    //Collections.sort(animalList);

    animalList.forEach(System.out::println);

    animalList.sort(Comparator.comparing(Animal::getEnvironment)
    .thenComparing(Animal::getKind).thenComparingInt(Animal::getSpeed));
    //.thenComparing(Animal::getKind()).thenComparing(Animal::getSpeed());
  
    animalList.sort(Comparator.comparingInt(Animal::getSpeed));
    animalList.sort(Comparator.comparing(Animal::getEnvironment));
    animalList.sort(Comparator.comparing(Animal::getKind));

    animalList.forEach(System.out::println);
    
  }
}