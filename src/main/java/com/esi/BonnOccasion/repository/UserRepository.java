package com.esi.BonnOccasion.repository;


import com.esi.BonnOccasion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
    User findByEmail(String email);
    User findByFirebaseUserId(String firebaseUserId);
}
