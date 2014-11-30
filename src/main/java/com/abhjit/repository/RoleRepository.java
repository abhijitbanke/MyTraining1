/**
 * 
 */
package com.abhjit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhjit.model.Role;

/**
 * @author abhijit
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
