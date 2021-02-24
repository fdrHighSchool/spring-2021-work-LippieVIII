import java.util.Arrays;
import java.util.Scanner;

public class SuperArray {
  //Instance variables
  private int[] array;
  private int index;
  private int val;
  private int numElements;

  //Constructor
  public SuperArray() {
    this.array = new int[10];
    this.index = 0;
    this.val = 0;
    this.numElements = this.array.length;
  }

  /*
    +------------------------+
    | 2 | 4 | 10 | 3 | 7 | 0  |
    +------------------------+

  */
  public void add(int val) {

    // if there's no room...grow the array and then add
    // create a new array with one extra slot (ALL ZEROES)
    int[] bigArray = new int[this.array.length + 1];

    // copy element by element every value in the smaller to the larger
    for (int i = 0; this.array.length > i; i++) {
      bigArray[i] = this.array[i];
    }

    // the final element in bigArray is 0, so the final slot should receive the value passed in to the method
    bigArray[bigArray.length - 1] = val;

    // update the instance variable to hold ALL the data
    this.array = bigArray;
  }//End add1 method ONE

  public int getSize() {
    return this.numElements;
  }

  public void add(int index, int val) {
    //Inserting an integer value within an array while preserving the array
    if (index >= this.array.length) {
      grow(1);
    }//Array increases by one index
    for (int i = this.numElements; i > index; i--) {
      this.array[i] = this.array[i - 1];
    }
    this.array[index] = val;
    this.numElements++;
  }//End add2 method TWO
  public void grow(int n) {
    //Just increasing the array's indexes
    int[] growArray = new int[this.array.length + n];
    for (int i = 0; this.array.length > i; i++) {
      growArray[i] = this.array[i];
    }
    this.array = growArray;
    /*
    for (int i = 0; this.array.length > i; i++) {
      System.out.print(this.array[i] + " ");
    }
    */
    //Increase the array's size however I wish
    //Must be a specific number
    //Input a specific number and the output is a larger array
  }//End grow method THREE
  public void set(int i, int val) {
    this.array[i] = val;
    //Replacing the index value with another integer
  }//End set method FOUR
  public boolean isEmpty() {
    //Returns whether or not the array is empty or not
    return this.numElements == 0;
  }//End isEmpty method FIVE
  public void remove(int index) {
    //Removes a value from an index of an array then the the gaps are fille up afterwards.
    for (int i = index; i < this.numElements; i++) {
      this.array[i] = this.array[i + 1];
    }
    numElements--;
  }//End remove method SIX
  public String toString() {
    String str = "{";
    for (int i = 0; this.array.length > i; i++) {
      if (i == this.array.length - 1) {
        str += this.array[i];
      }
      else {
        str += this.array[i] + ", ";
      }
    }
    str += "}";
    return str;
  }//End toString method SEVEN

  ///////////////////////////////////////
  //THE FOLLOWING IS A DEBUGGING METHOD!
  ///////////////////////////////////////

  /*
  public String debug(){
    String s = "";
    s = "Size: " + this.array.length;
    s = s + " LastItem: " + lastItem + "  Data: ";
    for (int i = 0; i < lastItem; i++) {
      s = s + this.array[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//End debug method EIGHT
  */
}
