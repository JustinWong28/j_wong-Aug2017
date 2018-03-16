package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {

	private Cell [][] grid= new Cell [12][20];
	public Spreadsheet() {
		for (int r= 0; r < 12; r++) {
			for(int c = 0; c < 20; c++) {
				grid[r][c] = new EmptyCell();
			}
		}
	}
	public String processCommand(String command) {
		return "";
	}

	@Override
	public int getRows() {
		return 20;
	}

	@Override
	public int getCols()
	{
		return 12;
	}

	@Override
	public Cell getCell(Location loc) {
		
		return grid[loc.getRow];
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
