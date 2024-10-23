
// 검색 로직 처리하는 service

package com.example.domain.Search.service;

import com.example.domain.Search.dto.SearchDTO;
import com.example.domain.Search.entity.Search;
import com.example.domain.Search.repository.SearchRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final SearchRepository searchRepository;

    public List<Search> searchPosts(SearchDTO searchDTO) {
        // 카테고리와 키워드를 기반으로 게시글 검색
        return searchRepository.findAll(); // 예시로 모든 게시글을 반환하도록 설정
    }
}
