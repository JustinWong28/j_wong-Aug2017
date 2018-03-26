package textExcel;

public abstract class RealCell {
	
	public RealCell(String input) {
		super();
	}
	
	public String abbreviatedCellText() {
		String cellText = Double.toString(getDoubleValue());
		if(cellText.length() <10) {
			if(!cellText.contains(" . ")) {
				cellText += ".0";
			}
			return addspaces(cellText);
		}else { 
			return cellText.substring(0, 10);
		}
	}
	
	public String fullCellText() {
		return getRealCell();
	}
	
	public String getDoubleCell() {
		return Double.parseDouble(getRealCell());
	}
}
