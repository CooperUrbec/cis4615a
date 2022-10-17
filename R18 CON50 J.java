//Rec. 18. Concurrency (CON)
//CON50-J. Do not assume that declaring a reference volatile guarantees safe publication of the members of the referenced object

final class Foo {
  private volatile int[] arr = new int[20];
 
  public int getFirst() {
    return arr[0];
  }
 
  public void setFirst(int n) {
    arr[0] = n;
  }
 
  // ...
}