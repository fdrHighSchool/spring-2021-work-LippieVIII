class 2012Solution {

  public static void main(String[] args) {
    countWhitePixels a = new countWhitePixels();
    processImage b = new processImage();
    System.out.println(a);
    System.out.println(b);
  }

  public int countWhitePixels() {
    int whitePixelCount = 0;
      for (int[] row : this.pixelValues) {
        for (int pv : row) {
          if (pv == this.WHITE) {
            whitePixelCount++;
          }
        }
      }
    return whitePixelCount;
  }

  public void processImage() {
    for (int row = 0; row < this.pixelValues.length - 2; row++) {
      for (int col = 0; col < this.pixelValues[0].length - 2; col++) {
        this.pixelValues[row][col] -= this.pixelValues[row + 2][col + 2];
        if (this.pixelValues[row][col] < BLACK) {
          this.pixelValues[row][col] = BLACK;
        }
      }
    }
  }

}
