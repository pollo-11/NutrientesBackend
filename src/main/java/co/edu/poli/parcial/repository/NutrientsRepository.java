package co.edu.poli.parcial.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import co.edu.poli.parcial.model.Nutrients;

public interface NutrientsRepository extends MongoRepository<Nutrients, String> {
	@Query("{'rda': { $gte: ?0, $lte: ?1 }}")
	List<Nutrients> findNutssQ2(int a,int b);
}
