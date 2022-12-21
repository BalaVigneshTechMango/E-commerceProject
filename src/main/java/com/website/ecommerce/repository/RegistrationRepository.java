package com.website.ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.website.ecommerce.entity.RegistrationPojo;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationPojo, Integer> {
	//RegistrationPojo findByEmailIdIgnoreCaseAndUserPassword(String emailId, String userPassword);
      RegistrationPojo findById(int UserId);

	String findByEmailId(String emailId);
}
