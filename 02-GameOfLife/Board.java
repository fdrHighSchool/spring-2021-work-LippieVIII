public class Board {
  //Instance variables
  private int height;
  private int width;
  private Cell[][] arr;
  private int generation;
  private int amountAlive;

  //The Constructor
  public Board(int h, int w) {
    this.height = h;
    this.width = w;
    this.arr = new Cell[h][w];
    fillBoard();
    //this.totalArea = h*w;

  }//End gameofLife

  public int getHeight() {
    return this.height;
  }//End getHeight method

  public int getWidth() {
    return this.width;
  }//End getWidth method

  public void setArray() {
    this.arr = arr;
  }//End setArray method

  public void fillBoard() {
    for (int h = 0; h < arr.length; h++) {
      for (int w = 0; w < arr[h].length; w++) {
        arr[h][w] = new Cell();
      }
    }
  }

  public void displayBoard() {
    for (int h = 0; h < arr.length; h++) {
      for (int w = 0; w < arr[h].length; w++) {
        //if (arr[h][w].get>deadOrAlive <= 1) {
        if(arr[h][w].getdeadOrAlive()) {
          System.out.print(" O ");
        }
        else {
          System.out.print(" X ");
        }
      }
      System.out.println();
    }
  }//End displayBoard method

  public void updateBoard() {
    int generation = 0;
    this.generation++; //update tracker variable for generation number
    this.amountAlive = 0; //reset tracker for number of cells alive in the generation

    //create a new 2D array to store boolean values of next generation's cells
    boolean[][] newBoard = new boolean[this.arr.length][this.arr[0].length];
    for (int i = 0; i < this.arr.length; i++){
      for (int j = 0; j < this.arr[i].length; j++){
        newBoard[i][j] = this.arr[i][j].nextGeneration(neighborCount(i, j));
      }//end inner loop (j)
    }//end outer loop (i)

    //transfer next generation's data to each cell object
    for (int i = 0; i < this.arr.length; i++){
      for (int j = 0; j < this.arr[i].length; j++){
        this.arr[i][j].setdeadOrAlive(newBoard[i][j]);
        if (arr[i][j].getdeadOrAlive()){
          this.amountAlive++;
        }//end conditional
      }//end inner loop (j)
    }//end outer loop (i)
  }

  public int neighborCount(int h, int w) {
    int count = 0;
    for (int width = -1; width <= 1; width++) {
      for (int height = -1; height <= 1; height++) {
        if (width >= 0 && width < arr.length && height >= 0 && height < arr[0].length && !(height == h && width == w)) {
          if (arr[w][h].getdeadOrAlive()) {
            count++;
          }
        }
        /*
        if (arr[w+width][h+height].getdeadOrAlive()) {
          count++;
        }
        */
      }
    }
    return count;
  }//End neighborCount method

}//End Board class
