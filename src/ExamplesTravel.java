// to represent a house 
interface IHouse {
  
}
// to represent a hut
class Hut implements IHouse {
  int capacity;
  int population;

  // constructor
  Hut(int capacity, int population) {
    this.capacity = capacity;
    this.population = population;
  }
}
// to represent a inn
class Inn implements IHouse {
  String name;
  int capacity;
  int stalls;
  int population;

  // constructor
  Inn(String name, int capacity, int population, int stalls) {
    this.population = population;
    this.capacity = capacity;
    this.name = name;
    this.stalls = stalls;
  }
}
// to represent a castle
class Castle implements IHouse {
  String name;
  String familyName;
  int carriageHouse;
  int population;
  
  // constructor
  Castle(String name, String familyName, int population, int carriageHouse) {
    this.population = population;
    this.name = name;
    this.familyName = familyName;
    this.carriageHouse = carriageHouse;
  }
}
/* TEMPLATE:
Hut Fields:
... this.capacity ...            -- int
... this.population ...          -- int

Inn Fields:
... this.name ...                -- String
... this.capacity ...            -- int
... this.stalls ...              -- int
... this.population ...          -- int

Castle Fields:
... this.name ...                -- String
... this.capacity ...            -- int
... this.stalls ...              -- int
... this.population ...          -- int
*/


//to represent a horse
class Horse {
  IHouse from;
  IHouse to;
  String name;
  String color;
  
  //constructor
  Horse(IHouse from, IHouse to, String name, String color) {
    this.from = from;
    this.to = to;
    this.name = name;
    this.color = color;
  }
}
/* TEMPLATE:
Fields:
... this.from ...            -- IHouse
... this.to ...              -- IHouse
... this.name ...            -- IHouse
... this.color ...           -- IHouse
*/

//to represent a Carriage
class Carriage {
  IHouse from;
  IHouse to;
  int tonnage;
  
  // constructor 
  Carriage(IHouse from, IHouse to, int tonnage) {
    this.from = from;
    this.to = to;
    this.tonnage = tonnage;
  }
}
/* TEMPLATE:
Fields:
... this.from ...            -- IHouse
... this.to ...              -- IHouse
... this.tonnage ...            -- IHouse
*/

// examples of Travel
class ExamplesTravel {
  ExamplesTravel() {}
  
  Hut hovel = new Hut(5, 1);
  Castle winterfell = new Castle("Winterfell", "Stark", 500, 6);
  Inn crossroads = new Inn("Inn At The Crossroads", 40, 20, 12);
  
  Inn cornerstone = new Inn("Cornerstones", 50, 25, 5);
  Hut hagrid = new Hut(2, 1);
  Castle hogwarts = new Castle("Hogwarts", "Potter", 1000, 500);
  
  Horse horse1 = new Horse(hovel, winterfell, "Horsey", "brown");
  Horse horse2 = new Horse(hogwarts, hagrid, "Black Diamond", "black");
  Carriage carriage1 = new Carriage(crossroads, hogwarts, 500);
  Carriage carriage2 = new Carriage(winterfell, cornerstone, 1000);
}
