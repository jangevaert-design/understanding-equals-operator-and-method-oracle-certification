package edu.cnm.deepdive;

public class ObjectEquality {

  public static void main(String[] args) {
    //comparing objects
    Integer myInteger = 127;
    Integer anotherInteger = 127;
    System.out.println(myInteger == anotherInteger);//prints true

    System.out.println("128 == 128: " + (128 == 128));//prints true
    myInteger = 128;
    anotherInteger = 128;
    System.out.println("MyInteger = " + myInteger);
    System.out.println("anotherInteger = " + anotherInteger);
    System.out.println(myInteger == anotherInteger);//prints false
  }
}
