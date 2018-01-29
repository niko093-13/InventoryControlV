package jp.springboot.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.springboot.example.to.Sup;

@Repository
public interface SupRepository extends JpaRepository<Sup, Long> {

//	public Sup findById(Long sup_code);
//	public List<Sup> findBySup_nameLike(String sup_name);
//	public List<Sup> findByIdIsNotNullOrderByIdDesc();
}
