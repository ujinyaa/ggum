
package com.example.ggum.domain.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.example.ggum.domain.user.entity.User;

@Entity
@NoArgsConstructor
@Getter
public class TESTPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

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

    public TESTPost(User user, String title, String content, String postCategory, Long price) {
        this.user = user;
        this.title = title;
        this.content = content;
        this.postCategory = postCategory;
        this.price = price;
    }
}
