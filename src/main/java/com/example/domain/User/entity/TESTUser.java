package com.example.ggum.domain.user.entity;

public class TESTUser {
    public static User alice;  // 게시글 작성용 유저 데이터

    public static void main(String[] args) {
        // 유저 데이터 생성 (테스트용, 비밀번호는 모두 1234*)
        User alice = new User(null, "1234*", "alice");  // Alice 유저 생성
        User bob = new User(null, "1234*", "bob");
        User charlie = new User(null, "1234*", "charlie");
        User daisy = new User(null, "1234*", "daisy");

        // 유저 데이터 출력 (테스트용)
        System.out.println("User1 Username: " + alice.getUsername() + ", Password: " + alice.getPassword());
        System.out.println("User2 Username: " + bob.getUsername() + ", Password: " + bob.getPassword());
        System.out.println("User3 Username: " + charlie.getUsername() + ", Password: " + charlie.getPassword());
        System.out.println("User4 Username: " + daisy.getUsername() + ", Password: " + daisy.getPassword());
    }
}
