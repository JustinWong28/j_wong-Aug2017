package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {

	private int numRow = 20;
	private int numCol = 12;
	private Cell [][] grid= new Cell [20][12];
	public Spreadsheet() {
		for (int r= 0; r < 20; r++) {
			for(int c = 0; c < 12; c++) {
				grid[r][c] = new EmptyCell();
			}
		}
	}
	
	public String processCommand(String command) {
		String[] parsedCommand = command.split(" ");
		if(parsedCommand.length == 2 && parsedCommand[0].toLowerCase().equals("clear")) {
			clearCell(parsedCommand[0]);
			return getGridText();
		}else if (parsedCommand.length == 3) { 
			assignValue(parsedCommand[0], parsedCommand[2]);
			return getGridText();
		}else{
			if(parsedCommand.length == 1 && parsedCommand[0].toLowerCase().equals("clear")) {
		clear();
		return getGridText();
	}else{
		SpreadsheetLocation loc = new SpreadsheetLocation(parsedCommand[0]);
		return getCell(loc).fullCellText();
		}
			}
		
	}
	@Override
	public int getRows() {
		return numRow;
	}

	@Override
	public int getCols()
	{
		return numCol;
	}

	@Override
	public Cell getCell(Location loc) {
		
		return grid[loc.getRow()][loc.getCol()];
	}

	@Override
	public String getGridText()
	{
		String colLetter = "   |";
		for(char c = 'A'; c <= 'L'; c++) {
			colLetter += c + "         |";
		}

		String rowNumbers = "\n";
		for(int i = 0; i < 20; i++) {
			if(i < 9) {															//adds extra space for numbers 1-9 
				rowNumbers += (i+1);
				rowNumbers += "  |";
				for(int j = 0; j < 12; j++) {
					rowNumbers += grid[i][j].abbreviatedCellText();
					rowNumbers += "|";
					}
					rowNumbers += "\n";
				}else {
					rowNumbers += (i+1);
					rowNumbers += " |";
					for(int j = 0; j < 12; j++) {
						rowNumbers += grid[i][j].abbreviatedCellText();
						rowNumbers += "|";
					}
					rowNumbers += "\n";
				}
			}
		return colLetter + rowNumbers;

	}
	//returns value of cell using abbreviatedCellText()
	public String inspectCell(String cell) {
		SpreadsheetLocation loc = new SpreadsheetLocation(cell);
		return getCell(loc).fullCellText();
	}
	
	//assigns value to given
	public String assignValue(String cell, String input) {
		SpreadsheetLocation loc = new SpreadsheetLocation(cell);
		if(input.substring(0, 1).equals("\"")) {
		grid[loc.getRow()][loc.getCol()] = new TextCell(input);
		}
		else if(input.substring(input.length()-1).equals("%")) {
			grid[loc.getRow()][loc.getCol()] = new PercentCell(input);
		}
		else if(input.charAt(0) == ('(')) {
			grid[loc.getRow()][loc.getCol()] = new FormulaCell(input);
		}
		else {
			grid[loc.getRow()][loc.getCol()] = new ValueCell(input);
		}
			return getGridText();
	}
	
	//clears the entire sheet
	public String clear() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 12; j++) {
			grid[i][j] = new EmptyCell();
			}
		}
		return getGridText();
	}
	
	//clears one cell
	public String clearCell(String cell) {
		SpreadsheetLocation loc = new SpreadsheetLocation(cell);
		grid[loc.getRow()][loc.getCol()] = new EmptyCell();
		return getGridText();
	}
}