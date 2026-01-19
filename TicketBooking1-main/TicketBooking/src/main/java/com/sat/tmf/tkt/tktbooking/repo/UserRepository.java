package com.sat.tmf.tkt.tktbooking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sat.tmf.tkt.tktbooking.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findByFirstName(String firstName);

	@Query(value = "SELECT * FROM users WHERE first_name like '%:name%'", nativeQuery = true)
	User findByNameNative(@Param("name") String name);
	
	@Query("SELECT u FROM User u WHERE u.firstName LIKE %:name% ")
    List<User> searchByFirstName(@Param("name") String name);
}
