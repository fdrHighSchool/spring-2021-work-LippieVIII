public class Point {
  private int x;
  private int y;

  public Point(int x, int y){
    setLocation(x, y);
  }

  public Point2(int x, int y) {
    this.x = 0;
    this.y = 0;
  }

  public setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public translate(int dx, int dy) {
    setLocation(this.x + dx, this.y + dy);
  }//End

  public double distance(Point point2) {
    return Math.sqrt(Math.pow(point2.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2));
  }

  public Point midpoint(Point point2) {
    int midx = (this.x + point2.getX()) / 2;
    int midy = (this.y + point2.getY()) / 2;
    return new Point(midx, midy);
  }

  public double slope(Point point2) {
    return (point2.getY() - this.y) / (point2.getX() - this.x);
  }

  public boolean isCollinear(Point point2, Point point3) {
    return (slope(point2) == slope(point3));
  }

  public String toString() {
    return ("(" + this.x + ", " + this.y + ")");
  }

}//End the entire class
