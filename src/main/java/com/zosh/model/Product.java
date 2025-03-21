package com.zosh.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String title;

   private String description;

   private int mrpPrice;

   @Min(value = 5000, message = "Minimum selling price must be Ksh 5000 or above")
   private int sellingPrice;

   private int discountPercent;

   private int quantity;

   private String color;

   @ElementCollection
   private List<String> images = new ArrayList<>();

   private int numRatings;

   @ManyToOne
   private Category category;

   @ManyToOne 
   private Seller seller;
   
   private LocalDateTime createdAt;

   private String Sizes;

   @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<Review> reviews = new ArrayList<>();

   private boolean in_stock = true;
}
