package org.example.productcatalogservice_feb2025.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDto {
    Long id;
    String name;
    String description;
    String imageUrl;
    Double price;
    CategoryDto category;
}
