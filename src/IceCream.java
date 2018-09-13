// to represent an icecream 
interface IIceCream {

}
// to represent an empty scoop
class EmptyServing implements IIceCream {
  boolean cone;

  //constructor
  EmptyServing(boolean cone) {
    this.cone = cone;
  }
}
// to represent a scoop of icream 
class Scooped implements IIceCream {
  IIceCream more;
  String flavor;

  // constructor
  Scooped(IIceCream more, String flavor) {
    this.more = more;
    this.flavor = flavor;
  }
}
/* TEMPLATE:
EmptyServicng Fields:
... this.cone ...            -- boolean

Scooped Fields:
... this.more ...            -- IIceCream
... this.flavour ...           -- String
*/

// Examples for interface IIcreCream
class ExamplesIceCream {
  ExamplesIceCream (){}
  
  //examples of IIcream
  IIceCream order1 = new Scooped(
      new Scooped(new Scooped(new Scooped(new EmptyServing(false), "mint chip"), "coffee"),
          "black raspberry"),
      "caramel swirl");

  IIceCream order2 = new Scooped(
      new Scooped(new Scooped(new EmptyServing(true), "chocolate"), "vanilla"), "strawberry");
}
