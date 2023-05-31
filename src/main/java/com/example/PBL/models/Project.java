/**
 * 
 */
package com.example.PBL.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Samyuktha Pandula
 *
 */
@Entity
public class Project {

	@Id
	private int projectID;
	private String projectTitle;
	private String projectDesc;
	private String projectType;
	/**
	 * @return the projectID
	 */
	public int getProjectID() {
		return projectID;
	}
	/**
	 * @param projectID the projectID to set
	 */
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	/**
	 * @return the projectTitle
	 */
	public String getProjectTitle() {
		return projectTitle;
	}
	/**
	 * @param projectTitle the projectTitle to set
	 */
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	/**
	 * @return the projectDesc
	 */
	public String getProjectDesc() {
		return projectDesc;
	}
	/**
	 * @param projectDesc the projectDesc to set
	 */
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	/**
	 * @return the projectType
	 */
	public String getProjectType() {
		return projectType;
	}
	/**
	 * @param projectType the projectType to set
	 */
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	
	
	
}
