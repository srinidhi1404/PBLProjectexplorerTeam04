/**
 * 
 */
package com.example.PBL.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.PBL.models.Project;

/**
 * @author Samyuktha Pandula
 *
 */
public interface ProjectRepository extends CrudRepository<Project,Integer> {
	//List<Project> findByName(String name);

}

