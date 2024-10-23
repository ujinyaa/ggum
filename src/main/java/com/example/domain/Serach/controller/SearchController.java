// 검색 과정 처리, 결과 반환 controller

package com.example.domain.Search.controller;

import com.example.domain.Search.dto.ResponseDTO;
import com.example.domain.Search.dto.SearchDTO;
import com.example.domain.Search.entity.Search;
import com.example.domain.Search.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/search")
@RequiredArgsConstructor
public class SearchController {
    private final SearchService searchService;

    @PostMapping
    public ResponseDTO<List<Search>> search(@RequestBody SearchDTO searchDTO) {
        List<Search> searchResults = searchService.searchPosts(searchDTO);
        return ResponseDTO.<List<Search>>builder().data(searchResults).build();
    }
}
