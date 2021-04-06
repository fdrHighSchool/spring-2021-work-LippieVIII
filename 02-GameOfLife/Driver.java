import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world! Enjoy the favors of life and death!");
    Board world = new Board(10, 10);
    world.displayBoard();
    Scanner s = new Scanner(System.in);
    boolean play = true;

    Board simulation = new Board(5, 5); //pass in the size of the board
    simulation.displayBoard();
    System.out.println();

    while (play){
      simulation.updateBoard();
      simulation.displayBoard();

      String next = s.nextLine();
      if (next.equals("q")){
        play = false; //sentinel loop escape
      }//end conditional
    }//end game loop
  }

}//End the main driver class

//20*20 box will be set
//>MORE PLANS<

//1. Create board (constructor) 2D array
//2. Fill up board (create new cell objects)
//3. Nested for loop to reach slot of 2D array
