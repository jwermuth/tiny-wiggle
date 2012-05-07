package tiny;

public class DropDownEntryImpl implements DropDownEntry {
	String label;
	String attribute; 
	
	public DropDownEntryImpl(String label, String attribute) {
		this.label = label;
		this.attribute = attribute;
	}
	
	/* (non-Javadoc)
	 * @see models.DropDownEntry#getLabel()
	 */
	@Override
	public String getLabel() {
		return label;
	}
	/* (non-Javadoc)
	 * @see models.DropDownEntry#setLabel(java.lang.String)
	 */
	
	public void setLabel(String label) {
		this.label = label;
	}
	/* (non-Javadoc)
	 * @see models.DropDownEntry#getValue()
	 */
	@Override
	public String getValue() {
		return attribute;
	}
	/* (non-Javadoc)
	 * @see models.DropDownEntry#setValue(java.lang.String)
	 */
	public void setValue(String value) {
		this.attribute = value;
	}
}
