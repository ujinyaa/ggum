//테스트용으로 간단하게 구현
package com.example.ggum.domain.User.entity;

public class User {
    private Long id;          // private 필드
    private String password;  // private 필드
    private String username;  // private 필드

    // 생성자
    public User(Long id, String password, String username) {
        this.id = id;
        this.password = password;
        this.username = username;
    }

    // Getter 메서드
    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
