package com.alam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alamentity.User;



public interface UserRepo extends JpaRepository<User,Long>  {

}
