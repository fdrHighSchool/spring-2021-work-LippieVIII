public class Cell {
  //Instance variables
  private boolean deadOrAlive;

  //Constructors
  public Cell() {
    deadOrAlive = Math.random() > 0.5;
  }//End theCell method

  public boolean getdeadOrAlive() {
    return this.deadOrAlive;
  }//End getBeingAliveOrDead method

  public void setdeadOrAlive(boolean deadOrAlive) {
    this.deadOrAlive = deadOrAlive;
  }//End setBeingAliveOrDead method

  public boolean nextGeneration(int n) {
    return ((!this.deadOrAlive && n == 3) || (this.deadOrAlive && (n == 2 || n == 3)));
    //Returns either a false statement and n = 3
    //OR returns a true statement and n = 2 OR 3
  }//End nextGeneration method

}//End Cell class
