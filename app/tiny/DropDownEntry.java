package tiny;

public interface DropDownEntry {
	/**
	 * @return The label that will be shown in Tiny
	 */
	String getLabel();
	/**
	 * @return The verbatim string that will be inserted in tine. This will typically (if not always) be markup
	 */
	String getValue();
}
