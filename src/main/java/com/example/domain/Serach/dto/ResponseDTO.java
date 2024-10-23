//검색에 응답하는 DTO

package com.example.domain.Search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

  
public class ResponseDTO<T> {
    private String error;
    private T data;
}
  
