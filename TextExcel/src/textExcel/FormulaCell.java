package textExcel;

public class FormulaCell extends RealCell{
	
	private Spreadsheet grid;
	public FormulaCell(String input, Spreadsheet grid) {
		super(input);
		this.grid = grid;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String abbreviatedCellText() {
		String cellText = getDoubleValue() + "";
		if(cellText.length() < 10) {
			return addSpaces(cellText);
		}else {
			return cellText.substring(0,10);
		}
		
	}

	@Override
	public String fullCellText() {
		return getRealCell();
	}
	
	public double getDoubleValue() {
		String formula = getRealCell().substring(2, getRealCell().length()-2);		//removes ()
		String[] arr = formula.split(" ");											//split by spaces 
		double result;
		if(arr[0].toLowerCase().equals("sum")) {										//sum of numbers
			result = sum(arr[1].toLowerCase());
		}else if(arr[0].toLowerCase().equals("avg")) {								//averages numbers
			result = avg(arr[1].toLowerCase());
		}else{
			result = findCell(arr[0]);												//if there is only one cell reference, it will find the values in that cell.
		}

		if(arr.length != 1) {	
			for(int i = 1; i < arr.length; i+=2) {	
				if(arr[i].equals("+")){												//add
					result += findCell(arr[i+1]);
				}else if(arr[i].equals("-")) {										//subtract
					result -= findCell(arr[i+1]);
				}else if(arr[i].equals("*")){										//multiply
					result *= findCell(arr[i+1]);
				}else if(arr[i].equals("/")){										//divide
					result /= findCell(arr[i+1]);
				}
			}
		}
		return result;
	}
	
	public double findCell(String cell) {											//Find other cells' values
		if(!(Character.isDigit(cell.charAt(0))) && !(cell.charAt(0) == '-')){			//determines if a cell or an actual number.
			RealCell a = (RealCell) grid.getCell(new SpreadsheetLocation(cell));		//gets the cell from grid and cast into RealCell.
			return a.getDoubleValue();												//return cell's value		
		}else {
			return Double.parseDouble(cell);
		}	
	}

	public double sum(String formula) {
		String[] operands = formula.toLowerCase().split("-");							//separate the two ends
		char firstLetter = operands[0].charAt(0);
		char lastLetter = operands[1].charAt(0);
		int firsttNum = Integer.parseInt(operands[0].substring(1));
		int lastNum = Integer.parseInt(operands[1].substring(1));
		double sum = 0;
		for(char i = firstLetter; i <= lastLetter; i++) {
			for(int j = firsttNum; j <= lastNum; j++) {
				SpreadsheetLocation loc = new SpreadsheetLocation("" + i + j);		//since i and j are not strings, put "" to cast into string
				Cell cell = grid.getCell(loc);										//get cells from the original grid
				if(cell instanceof RealCell) {
					RealCell temp = (RealCell)(cell);								//casts Cell into RealCell.
					sum += temp.getDoubleValue();									//add values from each cell.
				}
			}
		}
		return sum;
	}

 double avg(String formula) {
		String[] operands = formula.split("-");	
		char firstLetter = operands[0].charAt(0);
		char lastLetter = operands[1].charAt(0);
		int firstNum = Integer.parseInt(operands[0].substring(1));
		int lastNum = Integer.parseInt(operands[1].substring(1));
		double sum1 = sum(formula);													//finds sum of group of cells
		int totalCol = (lastLetter - firstLetter) + 1;
		int totalRow = (lastNum - firstNum) + 1;
		return sum1/(totalCol * totalRow);											// divide by the total number of cells
	}

	


}

