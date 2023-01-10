package com.masai.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.UserDtl;

@Repository
public interface UserRepository extends JpaRepository<UserDtl, Integer>{

}
