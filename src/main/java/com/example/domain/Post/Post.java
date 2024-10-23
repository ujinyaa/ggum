package com.example.ggum.domain.post.entity;

import com.example.ggum.domain.user.entity.User;

public class Post {
    private User user;        // private 필드
    private String title;     // private 필드
    private String content;   // private 필드
    private String postCategory;
    private Long price;

    // 생성자
    public Post(User user, String title, String content, String postCategory, Long price) {
        this.user = user;
        this.title = title;
        this.content = content;
        this.postCategory = postCategory;
        this.price= price;
    }

    // Getter 메서드
    public User getUser() {
        return user;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    public String getpostCategory(){
        return postCategory;
    }
    public Long price(){
        return  price;
    }
    
}

/*
package com.example.ggum.domain.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
//import com.example.ggum.domain.user.entity.User;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
public class Post{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_id")
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String postCategory;

    @Column(nullable = false)
    private Long price;
}


*/

    /*
    @Column(name="participant_limit", nullable = false)
    private Long participantLimit;

    @Column(name="participant_count", nullable = false)
    private Long participantCount;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    @Column(name="end_date", nullable = false)
    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PostStatus poststatus;}
    
    */
