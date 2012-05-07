package controllers;

import models.CMS;
import models.CMSSite;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Bootstrap extends Job {
	public void doJob() {
		if (CMS.count() == 0) {
			CMS n = new CMS();
			CMSSite s = new CMSSite();
			s.name = "default";
			s.save();
			n.add(s);

			n.save();
		}
	}
}
