//Rec. 18. Concurrency (CON)
//CON50-J. Do not assume that declaring a reference volatile guarantees safe publication of the members of the referenced object

final class Foo {
  private final AtomicIntegerArray atomicArray =
    new AtomicIntegerArray(20);
 
  public int getFirst() {
    return atomicArray.get(0);
  }
 
  public void setFirst(int n) {
    atomicArray.set(0, 10);
  }
 
  // ...
}