import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A 
  public Location getNextLoc(int row, int col) {
    boolean hasRight = false;
    boolean hasBelow = false;
    int rightValue = Integer.MAX_VALUE;
    int belowValue = Integer.MAX_VALUE;
    int rightRow = row;
    int rightCol = col + 1;
    int belowRow = row + 1;
    int belowCol = col;
    if (col + 1 < grid[0].length) {
      hasRight = true;
      rightValue = grid[row][col + 1];
    }
    if (row + 1 < grid.length) {
      hasBelow = true;
      belowValue = grid[row + 1][col];
    }
        if (hasRight && hasBelow) {
      if (rightValue < belowValue) {
        return new Location(rightRow, rightCol);
      } else {
        return new Location(belowRow, belowCol);
      }
    } else if (hasRight) {
      return new Location(rightRow, rightCol);
    } else {
      return new Location(belowRow, belowCol);
    }
   }


  
  // PART B
  public int sumPath(int row, int col) {
   int sum = grid[row][col];

    while (row < grid.length - 1 && col < grid[0].length - 1) {
      Location nextLoc = getNextLoc(row, col);
      row = nextLoc.getRow();
      col = nextLoc.getCol();
      sum += grid[row][col];
    }

    return sum;
}

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
