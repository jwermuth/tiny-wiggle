package tiny;

public class DropDownEntryImpl implements DropDownEntry {
	String label;
	String attribute;

	public DropDownEntryImpl(String label, String attribute) {
		this.label = label;
		this.attribute = attribute;
	}

	@Override
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String getValue() {
		return attribute;
	}

	public void setValue(String value) {
		this.attribute = value;
	}
}
