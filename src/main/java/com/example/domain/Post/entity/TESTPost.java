package com.example.ggum.domain.post.entity;

import com.example.ggum.domain.user.entity.TESTUser;
import com.example.ggum.domain.user.entity.User;

public class TESTPost {
    public static void main(String[] args) {
        // 유저 데이터 생성 (테스트용)
        User alice = new User(1L, "1234*", "alice");

        // 게시글 데이터 생성 (테스트용)
        Post post1 = new Post(alice, "Fresh Apples", "Delicious red apples from farm");

        // 게시글 출력 (테스트용)
        System.out.println("Post Title: " + post1.getTitle() + ", Posted by: " + post1.getUser().getUsername());
        System.out.println("Post Content: " + post1.getContent());
    }
}

/*
public class TESTPost{
    public static void main(String[] args){
        
        // TESTUser에서 생성한유저 객체를 사용하여 게시글 생성
        User alice = TESTUser.alice;
        User bob = TESTUser.bob;
        User charlie = TESTUser.charile;
        User daisy = TESTUser.daisy;
        
        // 게시글 데이터 생성
        Post post1 = new Post(alice, "Fresh Apples", "Delicious red apples from farm", "apple", 599L);
        Post post1 = new Post(bob, "Organic Bananas", "Fresh and organic bananas", "banana", 349L);
        Post post1 = new Post(charlie, "Latest Smartphone", "New smartphone with 5G", "cell", 79999L);
        Post post1 = new Post(daisy, "Latest Smartphone", "New smartphone with 5G", "cell", 79999L);

        // 게시글 출력 (테스트용)
        System.out.println("Post Title: " + post1.getTitle() + ", Posted by: " + post1.getUser().getUsername());
    }
}*/
