package jp.springboot.example.dao;

import java.io.Serializable;
import java.util.List;

public interface SupDao <T> extends Serializable {
	
	public List<T> getAll();
	
}
