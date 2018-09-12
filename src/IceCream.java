interface IceCream {

}

class EmptyServing implements IceCream {
  boolean cone;

  EmptyServing(boolean cone) {
    this.cone = cone;
  }
}

class Scooped implements IceCream {
  IceCream more;
  String flavor;

  Scooped(IceCream more, String flavor) {
    this.more = more;
    this.flavor = flavor;
  }
}

class ExamplesIceCream {
  IceCream order1 = new Scooped(
      new Scooped(new Scooped(new Scooped(new EmptyServing(false), "mint chip"), "coffee"),
          "black raspberry"),
      "caramel swirl");

  IceCream order2 = new Scooped(
      new Scooped(new Scooped(new EmptyServing(true), "chocolate"), "vanilla"), "strawberry");
}
