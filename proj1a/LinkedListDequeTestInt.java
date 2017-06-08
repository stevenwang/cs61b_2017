public class LinkedListDequeTestInt{
  /* Utility method for printing out empty checks. */
  public static boolean checkEmpty(boolean expected, boolean actual) {
    if (expected != actual) {
      System.out.println("isEmpty() returned " + actual + ", but expected: " + expected);
      return false;
    }
    return true;
  }

  /* Utility method for printing out empty checks. */
  public static boolean checkSize(int expected, int actual) {
    if (expected != actual) {
      System.out.println("size() returned " + actual + ", but expected: " + expected);
      return false;
    }
    return true;
  }

  public static void addIsEmptySizeTest() {
    System.out.println("Running add/isEmpty/Size test.");

    LinkedListDeque lld1 = new LinkedListDeque();

    boolean passed = checkEmpty(true, lld1.isEmpty());

    lld1.addFirst(1);

    passed = checkSize(1, lld1.size()) && passed;
    passed = checkEmpty(false, lld1.isEmpty()) && passed;

    lld1.addLast(2);
    passed = checkSize(2, lld1.size()) && passed;

    lld1.addLast(3);
    passed = checkSize(3, lld1.size()) && passed;

    System.out.printf("test over size get item: %d \n", lld1.get(10));

    System.out.println("Printing out deque: ");
    lld1.printDeque();


    printTestStatus(passed);
  }

  /** Adds an item, then removes an item, and ensures that dll is empty afterwards. */
  public static void addRemoveTest() {

    System.out.println("Running add/remove test.");

    LinkedListDeque lld1 = new LinkedListDeque();
    lld1.printDeque();
    // should be empty
    boolean passed = checkEmpty(true, lld1.isEmpty());

    lld1.addFirst(10);
    System.out.println("check if list has items.");
    lld1.printDeque();

    // should not be empty
    passed = checkEmpty(false, lld1.isEmpty()) && passed;

    lld1.removeFirst();
    System.out.println("check if list has items.");
    lld1.printDeque();
    // should be empty
    passed = checkEmpty(true, lld1.isEmpty()) && passed;

    printTestStatus(passed);

  }


  /* Prints a nice message based on whether a test passed.
   * The \n means newline. */
  public static void printTestStatus(boolean passed) {
    if (passed) {
      System.out.println("Test passed!\n");
    } else {
      System.out.println("Test failed!\n");
    }
  }




  public static void main(String[] args) {
    System.out.println("Running tests.\n");
		addIsEmptySizeTest();
    addRemoveTest() ;
  }


}
