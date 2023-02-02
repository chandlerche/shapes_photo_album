package cs5004.mvc.model.shape;

/**
 * The type Position.
 */
public class Position {
  private int x;
  private int y;

  /**
   * Instantiates a new Position.
   *
   * @param x the x
   * @param y the y
   */
  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Gets x.
   *
   * @return the x
   */
  public int getX() {
    return x;
  }

  /**
   * Gets y.
   *
   * @return the y
   */
  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ')';
  }
}
