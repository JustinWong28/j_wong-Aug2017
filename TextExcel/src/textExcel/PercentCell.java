package textExcel;

public class PercentCell extends RealCell{

	public PercentCell(String input) {
		super(input);
	}

	@Override
	public String abbreviatedCellText() {
		int decimal = getRealCell().indexOf(".");
		String wholeNumber = getRealCell().substring(0, decimal);
		if(wholeNumber.length() < 10) {
			wholeNumber += "%";
			return super.addSpaces(wholeNumber);
		}else {
			return (wholeNumber.substring(0, 8) + "%");
		}
	}

	@Override
	public String fullCellText() {
		return getDoubleValue() + "";
	}

	@Override
	public double getDoubleValue() {
		String percent = getRealCell().substring(0, getRealCell().length() - 1);
		Double realPercent = Double.parseDouble(percent) / 100.0;
		return realPercent;
	}

}
