package dao;

import java.util.List;

import model.Emprunt;

public interface EmpruntDao {
	void findById(int id);

	List<Emprunt> findAll() throws Exception;

	void save(Emprunt emprunt);

	void update(Emprunt emprunt);

	void delete(Emprunt emprunt);
}
