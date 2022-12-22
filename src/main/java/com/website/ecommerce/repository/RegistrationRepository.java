package com.website.ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.website.ecommerce.entity.RegistrationPojo;
import com.website.ecommerce.request.RegisterRequestPojo;

@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationPojo, Integer> {
	//RegistrationPojo findByEmailIdIgnoreCaseAndUserPassword(String emailId, String userPassword);
      RegistrationPojo findById(int UserId);

	  RegisterRequestPojo findByEmailId(String emailId);

}