package jp.springboot.example.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import jp.springboot.example.to.Sup;

@Repository
public class SupDaoImpl implements SupDao<Sup> {

	private static final long serialVersionUID = 1L;
	
	private EntityManager entityManager;
	
	public SupDaoImpl() {
		super();
	}
	
	public SupDaoImpl(EntityManager manager)  {
		entityManager = manager;
	}

	@Override
	public List<Sup> getAll() {
		Query query = entityManager.createQuery("from Supplier");
		List<Sup> list = query.getResultList();
		entityManager.close();
		return list;
	}
}
