package jp.springboot.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.springboot.example.to.User;

@Repository
public interface LoginRepository extends JpaRepository<User, String> {
 
	public User findById(String id);
}
