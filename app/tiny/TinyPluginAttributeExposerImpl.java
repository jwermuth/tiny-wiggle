package tiny;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import play.db.jpa.Model;

public class TinyPluginAttributeExposerImpl
		implements
			TinyPluginAttributeExposer {

	private Class<? extends Model> modelClass;
	List<DropDownEntry> entries = new ArrayList<DropDownEntry>();

	public TinyPluginAttributeExposerImpl(Class<? extends Model> modelClass) {
		this.modelClass = modelClass;
	}

	@Override
	public List<DropDownEntry> getDropDownEntries() {
		Field[] fields = modelClass.getFields();
		for (Field f : fields) {
			DropDownEntry entry = new DropDownEntryImpl(f.getName(), f.getName());
			entries.add(entry);
		}
		return entries;
	}

	@Override
	public String getName() {
		return modelClass.getName();
	}

	@Override
	public String getTypeName() {
		return null;
	}

}
