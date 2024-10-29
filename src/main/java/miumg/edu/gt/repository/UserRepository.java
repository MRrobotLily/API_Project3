package miumg.edu.gt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import miumg.edu.gt.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
	Optional<Users> findByuserName(String userName);
}
