package com.laribi.easycots.models;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Component {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer componentId;

	private String componentName;

	private String componentDownloadUrl;

	private Integer componentLastVersionId;
	
	private String componentEditor;

	@ManyToOne
	private Licence componentCurrentLicence;

	@ManyToMany
	private List<ComponentStatus> componentStatus;

	// Get&Set
	public Integer getComponentId() {
		return componentId;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentDownloadUrl() {
		return componentDownloadUrl;
	}

	public void setComponentDownloadUrl(String componentDownloadUrl) {
		this.componentDownloadUrl = componentDownloadUrl;
	}

	public Integer getComponentLastVersionId() {
		return componentLastVersionId;
	}

	public void setComponentLastVersionId(Integer componentLastVersionId) {
		this.componentLastVersionId = componentLastVersionId;
	}

	public String getComponentEditor() {
		return componentEditor;
	}

	public void setComponentEditor(String componentEditor) {
		this.componentEditor = componentEditor;
	}

	public Licence getComponentCurrentLicence() {
		return componentCurrentLicence;
	}

	public void setComponentCurrentLicence(Licence componentCurrentLicence) {
		this.componentCurrentLicence = componentCurrentLicence;
	}

	public List<ComponentStatus> getComponentStatus() {
		return componentStatus;
	}

	public void setComponentStatus(List<ComponentStatus> componentStatus) {
		this.componentStatus = componentStatus;
	}
}
