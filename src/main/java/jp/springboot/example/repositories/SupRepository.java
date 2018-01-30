package jp.springboot.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.springboot.example.to.Sup;

@Repository
public interface SupRepository extends JpaRepository<Sup, Long> {
	
//	public Sup findByScode(String sup_code);
	public List<Sup> findBySname(String sup_name);
//	public List<Sup> findBySnameLike(String sup_name);
//	public List<Sup> findByIdIsNotNullOrderByIdDesc();
}
