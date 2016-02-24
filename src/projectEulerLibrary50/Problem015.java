package projectEulerLibrary50;

import projectEulerLibrary.Problem;

public class Problem015 implements Problem {

	@Override
	public void ProblemSolver() {
		final int gridSize = 20;
		long[][] grid = new long[gridSize + 1][gridSize + 1];

		// Initialize the grid with boundary conditions
		for (int row = 0; row < gridSize; row++) {
			grid[row][gridSize] = 1;
			grid[gridSize][row] = 1;
		}
		for (int row = gridSize - 1; row >= 0; row--) {
			for (int col = gridSize - 1; col >= 0; col--) {
				grid[row][col] = grid[row + 1][col] + grid[row][col + 1];
			}
		}
		System.out.println("Grid size - " + gridSize + " x " + gridSize + " : Available paths - " + grid[0][0]);
	}
}