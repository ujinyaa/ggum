
package com.example.ggum.domain.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.example.ggum.domain.user.entity.User;

@Entity
@NoArgsConstructor
@Getter
public class TESTPostData {
    public static void main(String[] args) {
        // 유저 데이터 생성 (아이디는 이름을 소문자로 설정)
        User alice = new User(1L, "alice", "1234*", "Alice");
        User bob = new User(2L, "bob", "1234*", "Bob");
        User charlie = new User(3L, "charlie", "1234*", "Charlie");
        User daisy = new User(4L, "daisy", "1234*", "Daisy");

        // 게시글 데이터 생성
        TESTPost post1 = new TESTPost(alice, "Fresh Apples", "Delicious red apples from farm", "apple", 599L);
        TESTPost post2 = new TESTPost(bob, "Organic Bananas", "Fresh and organic bananas", "banana", 349L);
        TESTPost post3 = new TESTPost(charlie, "Latest Smartphone", "New smartphone with 5G", "cell", 79999L);
        TESTPost post4 = new TESTPost(daisy, "Labrador Puppy", "6-month old Labrador puppy", "dog", 29999L);

