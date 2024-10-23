
package com.example.domain.Search.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.domain.Search.entity.Search;

public interface SearchRepository extends JpaRepository<Search, Long> {
    // 필요한 경우 커스텀 쿼리 메서드 추가
}
