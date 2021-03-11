class 2018Solution {
  public static void main(String[] args) {
    int[][] arr2D = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {9, 5, 3}};
    //Arraytester someArrayTester = new arrayTester(arr2D);
    int[] result = someArrayTester.getColumn(someArray, 1);
    System.out.println(result);
    isLatin a = new isLatin();
    System.out.println(a);
  }//End Main method

  public static int[] getColumn(int[][] arr2D, int c) {
    int[] someArray = new int[arr2D.length];
    for (int r = 0; arr2D.length > r; r++) {
      someArray[r] = arr2D[r][c];
    }
    return someArray;
  }//End getColumn method

  public static boolean isLatin(int[][] square) {
    if (containsDuplicates(square[0])) {
      return false;
    }
    for (int r = 1; r < square.length; r++) {
      if (!hasAllValues(square[0], square[r])) {
        return false;
      }
    }
    for (int c = 0; c < square[0].length; c++) {
      if (!hasAllValues(square[0], getColumn(square, c))) {
        return false;
      }
    }
    return true;
  }

}
