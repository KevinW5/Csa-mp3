import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A
  public Location getNextLoc(int row, int col) {
    // check if moving right wont go off grid and determine going left or right (go to smallest)
    if (col + 1 < grid[0].length && (row + 1 >= grid.length || grid[row][col + 1] < grid[row + 1][col])) {
      return new Location(row, col + 1);
    } else if (row + 1 < grid.length) {
      // checks if it’s valid to move down in the grid
      return new Location(row + 1, col);
    }
    // return null if no place to go
    return null;
  }

  // PART B
 public int sumPath(int row, int col) {
    int sum = grid[row][col];
    Location nextLoc = getNextLoc(row, col);
    // loop if nextloc is valid and not the last on the grid
    while (nextLoc != null && (row < grid.length - 1 || col < grid[0].length - 1)) {
      // get row and col
        row = nextLoc.getRow();
        col = nextLoc.getCol();
      // add the path it took
        sum += grid[row][col];
      // update nextloc make sure its valid
        nextLoc = getNextLoc(row, col);
    }
    
    return sum;
}

  public String toString() {
    return Arrays.deepToString(grid);
  }
}
