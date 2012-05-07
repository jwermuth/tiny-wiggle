package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.data.validation.Required;
import play.db.jpa.GenericModel;

@Entity
public class CMSSite extends GenericModel {
	@Required
	@Id
	public String name;
	
	@ManyToOne
	public CMS cms;

	@OneToMany(mappedBy = "site", cascade = CascadeType.ALL)
	public List<CMSPage> pages;
	
	
}
