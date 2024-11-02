package com.esi.BonnOccasion.service;

import com.esi.BonnOccasion.model.Item;
import com.esi.BonnOccasion.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    public List<Item> getItemsByFirebaseUserId(String firebaseUserId) {
        return itemRepository.findBySellerFirebaseUserId(firebaseUserId);
    }
}
