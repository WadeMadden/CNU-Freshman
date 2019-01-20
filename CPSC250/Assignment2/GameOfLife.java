package Assignment2;

public class GameOfLife {
	private boolean[][] life = new boolean[0][0];
	private int rounds;

	// default constructor creates a grid of 10x10
	public GameOfLife() {
		life = new boolean[10][10];
		rounds = 0;
	}

	// constructor of user wanted rows and columns
	public GameOfLife(int row, int col) {
		if (row > 0 && col > 0) {
			life = new boolean[row][col];
		} else if (col > 0 && row <= 0) {
			life = new boolean[10][col];
		} else if (row > 0 && col <= 0) {
			life = new boolean[row][10];
		} else {
			life = new boolean[10][10];
		}
		rounds = 0;
	}

	// retrieves the grid
	public boolean[][] getGrid() {
		boolean[][] newGrid = new boolean[life.length][life[0].length];
		for (int i = 0; i < life.length; i++) {
			for (int j = 0; j < life[i].length; j++) {
				newGrid[i][j] = life[i][j];
			}
		}
		return newGrid;
	}

	// retrieves the number of rounds
	public int getTime() {
		return rounds;
	}

	// clears the grid
	public void clearGrid() {
		rounds = 0;
		for (int i = 0; i < life.length; i++) {
			for (int j = 0; j < life[i].length; j++) {
				life[i][j] = false;
			}
		}
	}

	public boolean simpleSetUpHelper(int row, int col, boolean[][] fakeLife) {
		// test if off board
		if (row < 0 || row > fakeLife.length - 1 || col < 0 || col > fakeLife[row].length - 1) {
			return false;
		} else {

			return true;
		}

	}

	// sets up the starting board
	public void simpleSetUp(int[][] truePositions) {
		for (int i = 0; i < truePositions.length; i++) {
			int j = 0;
			int lifeRow = truePositions[i][j];
			int lifeCol = truePositions[i][j + 1];
			//makes sure positions only have 2 numbers
			if (truePositions[i].length == 2) {
				boolean answer = simpleSetUpHelper(lifeRow, lifeCol, life);
				//continues if the cell is off the board
				if (answer == false) {
					continue;
				}
				life[lifeRow][lifeCol] = answer;
			}
		}
	}

	// checks the neighbors surrounding the specified slot
	public int checkNeighbors(int row, int col, boolean[][] fakeLife) {
		int count = 0;
		if (row < 0 || row > life.length - 1 || col < 0 || col > life[row].length - 1) {
			return count;
		}
		if (fakeLife[row][col] == true) {
			count++;
		}

		return count;
	}

	// runs one round based on the specifications
	public void runRound() {
		rounds++;
		boolean[][] newLife = new boolean[life.length][life[0].length];
		for (int i = 0; i < life.length; i++) {

			for (int k = 0; k < life[i].length; k++) {
				int count = 0;
				// the eight surrounding cells
				count = count + checkNeighbors(i - 1, k - 1, life);
				count = count + checkNeighbors(i - 1, k, life);
				count = count + checkNeighbors(i - 1, k + 1, life);
				count = count + checkNeighbors(i, k + 1, life);
				count = count + checkNeighbors(i + 1, k + 1, life);
				count = count + checkNeighbors(i + 1, k, life);
				count = count + checkNeighbors(i + 1, k - 1, life);
				count = count + checkNeighbors(i, k - 1, life);
				// the specifications
				if (life[i][k] == true) {
					if (count <= 1 || count >= 4) {
						newLife[i][k] = false;
					} else if (count == 2 || count == 3) {
						newLife[i][k] = true;
					}
				} else if (life[i][k] == false) {
					if (count == 3)
						newLife[i][k] = true;
				}
			}
		}
		// transfers data back into original array
		for (int i = 0; i < life.length; i++) {
			for (int k = 0; k < life[i].length; k++) {
				life[i][k] = newLife[i][k];
			}
		}
	}

	// runs the game a specified number of rounds
	public void runGame(int numRounds) {
		for (int i = 0; i < numRounds; i++) {
			runRound();
		}
	}
}
