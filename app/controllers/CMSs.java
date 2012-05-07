package controllers;

import models.CMSPage;
import models.CMSSite;

public class CMSs extends CRUD {
	public static void view(String template, String site, String page) {
		CMSSite cms = CMSSite.find("byName", site).first();
		CMSPage cmsPage = CMSPage.find("byName", page).first();
		
		renderTemplate("CMSs/" + template + ".html", cmsPage);
	}
}
