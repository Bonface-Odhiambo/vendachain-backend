package com.zosh.dto;

import com.zosh.model.Category;
import jakarta.validation.constraints.Min;
import com.zosh.model.Review;
import com.zosh.model.Seller;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class ProductDto {

   private Long id;

   private String title;

   private String description;

   private int mrpPrice;

   @Min(value = 5000, message = "Minimum selling price must be Ksh 5000 or above")
   private int sellingPrice;

   private int discountPercent;

   private int quantity;

   private String color;

   private List<String> images = new ArrayList<>();

   private int numRatings;

   private LocalDateTime createdAt;

   private String Sizes;

}