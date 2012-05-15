package tiny;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import play.db.jpa.Model;

/**
 * @author jaw
 * 
 * 
 *
 */
public class TinyPluginReflectionAttributeExposerImpl implements
		TinyPluginAttributeExposer {

	private Class<? extends Model> modelClass;
	List<DropDownEntry> entries = new ArrayList<DropDownEntry>();

	public TinyPluginReflectionAttributeExposerImpl(Class<? extends Model> modelClass) {
		this.modelClass = modelClass;
	}

	@Override
	public List<DropDownEntry> getExposerDropDownEntries() {

		Method m[] = modelClass.getDeclaredMethods();
		for (Method method : m) {
			// Expose methods without arguments that return String
			if (method.getReturnType() == String.class
					&& method.getParameterTypes().length == 0) {
				// [("name","<modelobject type="User.class" method="getName"/>),
				DropDownEntry entry = new DropDownEntryImpl(method.getName(),
						"<modelobject type=\"" + modelClass.getName()
								+ "\" method=\"" + method.getName() + "\">" + 
								modelClass.getName() + "." + method.getName()
								+ "</modelobject>");
				entries.add(entry);
			}
		}
		return entries;
	}

	@Override
	public String getExposerName() {
		return modelClass.getName().toLowerCase();
	}

	@Override
	public String getExposerTypeName() {
		return modelClass.getName().toUpperCase();
	}

}
