package com.esi.BonnOccasion.repository;

import com.esi.BonnOccasion.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findBySellerFirebaseUserId(String firebaseUserId);
}
