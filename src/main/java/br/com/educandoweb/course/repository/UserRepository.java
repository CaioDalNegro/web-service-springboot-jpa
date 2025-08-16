package br.com.educandoweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
