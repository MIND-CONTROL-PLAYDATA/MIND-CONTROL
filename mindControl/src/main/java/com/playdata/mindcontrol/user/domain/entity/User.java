package com.playdata.mindcontrol.user.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "User")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자동 생성된 유저 ID

    @Column(nullable = false, unique = true)
    private String email; // 이메일

    @Column(nullable = false)
    private String username; // 유저 이름

    @Column(nullable = false)
    private String password; // 패스워드

    @Lob
    private byte[] profilePicture; // 프로필 사진 (이진 데이터)

    @Column(nullable = false)
    private String role; // 유저 권한 (그림 그리는 유저, 그림 안 그리는 유저)

    @Column(nullable = false)
    private LocalDateTime createdAt; // 생성 날짜

    // 생성자, getter/setter, 기타 메서드
}
