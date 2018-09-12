interface House {
  
}

class Hut implements House {
  int capacity;
  int population;

  Hut(int capacity, int population) {
    this.capacity = capacity;
    this.population = population;
  }
}

class Inn implements House {
  String name;
  int capacity;
  int stalls;
  int population;

  Inn(String name, int capacity, int population, int stalls) {
    this.population = population;
    this.capacity = capacity;
    this.name = name;
    this.stalls = stalls;
  }
}

class Castle implements House {
  String name;
  String familyName;
  int carriageHouse;
  int population;
  
  Castle(String name, String familyName, int population, int carriageHouse) {
    this.population = population;
    this.name = name;
    this.familyName = familyName;
    this.carriageHouse = carriageHouse;
  }
}

class Horse {
  House from;
  House to;
  String name;
  String color;
  
  Horse(House from, House to, String name, String color) {
    this.from = from;
    this.to = to;
    this.name = name;
    this.color = color;
  }
}

class Carriage {
  House from;
  House to;
  int tonnage;
  
  Carriage(House from, House to, int tonnage) {
    this.from = from;
    this.to = to;
    this.tonnage = tonnage;
  }
}

class ExamplesTravel {
  Hut hovel = new Hut(5, 1);
  Castle winterfell = new Castle("Winterfell", "Stark", 500, 6);
  Inn crossroads = new Inn("Inn at the crossroads", 40, 20, 12);
  
  Inn cornerstone = new Inn("Cornerstones", 50, 25, 5);
  Hut hagrid = new Hut(2, 1);
  Castle hogwarts = new Castle("Hogwarts", "Potter", 1000, 500);
  
  Horse horse1 = new Horse(hovel, winterfell, "Horsey", "brown");
  Horse horse2 = new Horse(hogwarts, hagrid, "Black Diamond", "black");
  Carriage carriage1 = new Carriage(crossroads, hogwarts, 500);
  Carriage carriage2 = new Carriage(winterfell, cornerstone, 1000);
}
