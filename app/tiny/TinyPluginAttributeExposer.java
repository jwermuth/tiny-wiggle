package tiny;

import java.util.List;


/**
 * @author jaw
 * 
 *         This is well explained with an example. Imagine you want to create a
 *         mail template, that will be used to send the same mail to many
 *         persons.
 * 
 *         Some of the information in the mail is personal, some is general,
 *         e.g.
 * 
 *         "Dear John. William (will12333@gmail.com) has invited you to join a group"
 * 
 *         Where John, William and will12333@gmail.com is the personal part, and
 *         the rest is general. This interface is used by classes to expose what
 *         methods/information can be inserted in mail templates.
 * 
 *         Implementations of the interface is given to an instance of TinyMCE.
 *         TinyMCE could use the information to populate a dropdown menu that
 *         would allow
 * 
 */
public interface TinyPluginAttributeExposer {
	/**
	 * @return a name that indicates with this particular element means. Imagine
	 *         someone wanting to create a mail template, and editor. The editor
	 *         types "Dear", then selects "User: from: name" from a dropdown,
	 *         then types ". " and selects "User: to: name" from the dropdown,
	 *         then types "(" and selects ... you get the picture I am sure.
	 * 
	 *         In the description above :
	 * 
	 *         getTypeName -> "User"
	 * 
	 *         getName -> "from"
	 * 
	 *         List<DropDownEntry> ->
	 * 
	 *         [("name","<modelobject type="User.class" method="getName"/>),
	 * 
	 *         ("email","<modelobject type="User.class" method="getEmail"/>")]
	 *         
	 */
	public String getName();

	/**
	 * @return a typename e.g. User, Deal or Project. The
	 */
	public String getTypeName();

	public List<DropDownEntry> getDropDownEntries();
}
