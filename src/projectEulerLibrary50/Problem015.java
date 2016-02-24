package projectEulerLibrary50;

import projectEulerLibrary.Problem;

public class Problem015 implements Problem {

	@Override
	public void ProblemSolver() {
		int gridSize = 15;
		int pathsCount = GetPathCount(gridSize);

	}

	private int GetPathCount(int gridSize) {
		int pathCount = 0;

		pathCount = GetPathCount(gridSize, gridSize);
		System.out.println("Path count - " + pathCount);
		return 0;
	}

	private int GetPathCount(int xPos, int yPos) {

		if (xPos == 0 && yPos == 0)
			return 1;
		int paths = 0;

		if (xPos > 0)
			paths += GetPathCount(xPos - 1, yPos);

		if (yPos > 0)
			paths += GetPathCount(xPos, yPos - 1);

		return paths;
	}

}
