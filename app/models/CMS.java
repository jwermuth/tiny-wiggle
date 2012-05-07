package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class CMS extends Model {
    // Contains information general to this particular CMS
	@OneToMany(mappedBy = "cms", cascade = CascadeType.ALL)
	List<CMSSite> sites = new ArrayList<CMSSite>();

	public void add(CMSSite s) {
		sites.add(s);
		s.cms = this;
	}
}
