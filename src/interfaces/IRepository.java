package interfaces;

import java.util.List;

public interface IRepository<T> {

	void save(T entity) throws Exception;

	void update(T entity) throws Exception;

	void delete(T entity) throws Exception;

	List<T> findAll() throws Exception;

	T findById(Integer id) throws Exception;
	
}
