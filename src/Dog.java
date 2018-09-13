import tester.main;

/*
  +---------------------------+
  | Dog                       | 
  +---------------------------+
  | String name               |
  | String breed              |
  | int yob                   |
  | String state              |
  | boolean hypoallergenic    |
  +---------------------------+  
*/


// to represent a dog
public class Dog {
  String name;
  String breed;
  int yob;
  String state;
  boolean hypoallergenic;
  
  // the constructor
  Dog(String name, String breed, int yob, String state, boolean hypoallergenic) {
    this.name = name;
    this.breed = breed;
    this.yob = yob;
    this.state = state;
    this.hypoallergenic = hypoallergenic;
  }
  
  /* TEMPLATE:
  Fields:
  ... this.name ...            -- String
  ... this.breed ...           -- String
  ... this.yob ...             -- int
  ... this.state ...           -- String
  ... this.hypoallergenic ...  -- boolean
*/
}

//examples for the class that represent dogs
class ExamplesDog {
  ExampleDogs(){}
  
  // examples of dogs
  Dog huffle = new Dog("Hufflepuff", "Wheaten Terrier", 2012, "TX", true);
  Dog pearl = new Dog("Pearl", "Labrador Retriever", 2016, "MA", false);
  Dog spot = new Dog("Spot", "Beagle", 2017, "WA", false);
}
