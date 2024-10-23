package com.example.domain.Search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
    
public class SearchDTO {
    private String selectedCategory;
    private String keyword;
}
