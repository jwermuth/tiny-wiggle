package models;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class CMSPage extends Model {
	@Unique
	@Required
	public String name;
	
	@ManyToOne
	public CMSSite site;
	
	@Required
	@Lob
	@MaxSize(10000)
	public String body;

}
