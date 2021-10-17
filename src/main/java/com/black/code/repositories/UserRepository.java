package com.black.code.repositories;

//import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.black.code.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//Page<User> findBySalaryBetween(Double minSalary, Double maxSalary, Pageable pageable);

	//Page<User> findByNameContainingIgnoreCase(String name, Pageable pageable);

	//List<User> findOne();

	//Page<User> findBySalaryBetween(Double minSalary, Double maxSalary, Pageable pageable);

	Page<User> findByNameContainingIgnoreCase(String name, Pageable pageable);

	Page<User> findByCpfContainingIgnoreCase(String cpf, Pageable pageable);

	Page<User> findByEmailContainingIgnoreCase(String email, Pageable pageable);

	Page<User> findByEnderecoContainingIgnoreCase(String endereco, Pageable pageable);
	
	//Page<User> findById(Long id_, Pageable pageable)
}
