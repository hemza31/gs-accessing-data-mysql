package com.laribi.easycots.models;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Licence {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "licence_id", unique = true, nullable = false)
	private Integer licenceId;

	@Column(name="licence_name")
	private String licenceName;

	private String licenceDocumentUrl;

	public Licence(Integer licenceId, String licenceName, String licenceDocumentUrl) {
		this.licenceId = licenceId;
		this.licenceName = licenceName;
		this.licenceDocumentUrl = licenceDocumentUrl;
	}

	public Licence() {
	}

	public Integer getLicenceId() {
		return licenceId;
	}

	public String getLicenceName() {
		return licenceName;
	}

	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}

	public String getLicenceDocumentUrl() {
		return licenceDocumentUrl;
	}

	public void setLicenceDocumentUrl(String licenceDocumentUrl) {
		this.licenceDocumentUrl = licenceDocumentUrl;
	}

	@Override
	public String toString() {
		return "Licence{" +
				"licenceId=" + licenceId +
				", licenceName='" + licenceName + '\'' +
				", licenceDocumentUrl='" + licenceDocumentUrl + '\'' +
				'}';
	}
}
