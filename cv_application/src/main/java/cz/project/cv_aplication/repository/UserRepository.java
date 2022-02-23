package cz.project.cv_aplication.repository;

import cz.project.cv_aplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
}
