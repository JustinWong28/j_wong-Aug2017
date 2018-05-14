package textExcel;

public class FormulaCell extends RealCell{
	
	private Spreadsheet grid;
	public FormulaCell(String input) {
		super(input);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String abbreviatedCellText() {
		String cellText = getDoubleValue() + "";
		if(cellText.length() < 10) {
			addSpaces(cellText);
		}else {
			cellText = cellText.substring(0,10);
		}
		return cellText;
	}

	@Override
	public String fullCellText() {
		return getRealCell();
	}
	
	public double getDoubleValue() {
		String formula = getRealCell().substring(2, getRealCell().length()-2);		//getting rid of ()
		String[] arr = formula.split(" ");											//splitting the formula by spaces 
		double result;
		if(arr[0].toLowerCase().equals("sum")) {										//sum
			result = sum(arr[1].toLowerCase());
		}else if(arr[0].toLowerCase().equals("avg")) {								//average
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
		if(!(Character.isDigit(cell.charAt(0))) && !(cell.charAt(0) == '-')){			//test whether the input could be a cell or an actual number.
			RealCell a = (RealCell) grid.getCell(new SpreadsheetLocation(cell));		//it gets the cell from this grid and cast it into RealCell.
			return a.getDoubleValue();												//return cell's value		
		}else {
			return Double.parseDouble(cell);
		}	
	}

	public double sum(String formula) {
		String[] operands = formula.toLowerCase().split("-");							//separate the two ends
		char startLetter = operands[0].charAt(0);
		char endLetter = operands[1].charAt(0);
		int startNum = Integer.parseInt(operands[0].substring(1));
		int endNum = Integer.parseInt(operands[1].substring(1));
		double sum = 0;
		for(char i = startLetter; i <= endLetter; i++) {
			for(int j = startNum; j <= endNum; j++) {
				SpreadsheetLocation loc = new SpreadsheetLocation("" + i + j);		//since i and j are not strings, I put "" in front of them in order to cast them into string first.
				Cell cell = grid.getCell(loc);										//get cells from the original grid
				if(cell instanceof RealCell) {
					RealCell temp = (RealCell)(cell);								//cast the Cell into RealCell.
					sum += temp.getDoubleValue();									//add up the values from each cell.
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
		double sum1 = sum(formula);													//finding the sum of a group of cells
		int totalCol = (lastLetter - firstLetter) + 1;
		int totalRow = (lastNum - firstNum) + 1;
		return sum1/(totalCol * totalRow);											// divided by the total number of cells
	}

	


}

