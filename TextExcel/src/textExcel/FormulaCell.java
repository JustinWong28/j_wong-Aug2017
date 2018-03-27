package textExcel;

public class FormulaCell extends RealCell{

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
		// TODO Auto-generated method stub
		return getDoubleValue() + "";
	}

	@Override
	public double getDoubleValue() {
		String[] formula = getRealCell().split(" ");
		double answer = 0.0;
		return 0;
	}

}
