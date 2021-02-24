public class Main {
  public static void main(String[] args) {
    SuperArray some = new SuperArray();
    some.add(1);
    some.add(2, 4);
    some.grow(2);
    some.set(5, 6);
    some.isEmpty();
    some.remove(7);
    System.out.println(some);
    String some2 = some.toString();
    System.out.println(some2);
  }
/*
    SuperArray some = new SuperArray();
    some.add(12);
    String some2 = some.toString();
    System.out.println(some2);
    System.out.println(some.toString());
    some.add(12);
    System.out.println(some);
    some.grow(2);
    some.set(1, 3);
    System.out.println(some);
*/

}
