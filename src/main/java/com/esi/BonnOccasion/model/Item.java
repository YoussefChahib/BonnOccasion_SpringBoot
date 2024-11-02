package com.esi.BonnOccasion.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    private String itemName;
    private Double itemPrice;
    private String itemPictureUrl;
    private String itemDescription;

    @ManyToOne
    @JoinColumn(name = "sellerId", nullable = false)
    private User seller;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}
