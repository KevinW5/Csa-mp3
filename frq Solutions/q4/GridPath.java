import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A
  public Location getNextLoc(int row, int col) {
    if (col + 1 < grid[0].length && (row + 1 >= grid.length || grid[row][col + 1] < grid[row + 1][col])) {
      return new Location(row, col + 1);
    } else if (row + 1 < grid.length) {
      return new Location(row + 1, col);
    }
    return null;
  }

  // PART B
  public int sumPath(int row, int col) {
    int sum = grid[row][col];
    while (row < grid.length - 1 || col < grid[0].length - 1) {
      Location nextLoc = getNextLoc(row, col);
      if (nextLoc == null) break;
      row = nextLoc.getRow();
      col = nextLoc.getCol();
      sum += grid[row][col];
    }
    return sum;
  }

  public String toString() {
    return Arrays.deepToString(grid);
  }
}
