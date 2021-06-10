package com.mindtree.test.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Author {

	@Inject
	private String name;
	@Inject
	private String email;
	@Inject
	private boolean isadmin;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public boolean isIsadmin() {
		return isadmin;
	}

}
