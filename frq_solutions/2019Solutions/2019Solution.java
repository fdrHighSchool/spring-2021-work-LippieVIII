class 2019Solution {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

  public boolean evaluateLight(int row, int col) {
    int numOn = 0;

    for (int r = 0; r < lights.length; r++) {
      if (lights[r][col]) {
        numOn++;
      }
    }

    if (lights[row][col] && numOn % 2 == 0) {
      return false;
    }
    if (!lights[row][col] && numOn % 3 == 0) {
      return true;
    }
    return lights[row][col];
  }

  public LightBoard(int numRows, int numCols) {
    lights = new boolean[numRows][numCols];

    for (int r = 0; r < numRows; r++) {
      for (int c = 0; c < numCols; c++) {
        double rnd = Math.random();
        lights[r][c] = rnd < 0.4;
      }
    }
  }

}
