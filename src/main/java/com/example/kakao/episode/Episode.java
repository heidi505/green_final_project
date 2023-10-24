package com.example.kakao.episode;

import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

import com.example.kakao.webtoon.Webtoon;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="episode_tb")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Webtoon webtoon;
    
    @Column(length = 100, nullable = false)
    private String detailTitle;

    private String thumbnail;

    String authorComment;

    private Integer cookieCost;
    
    @ColumnDefault("0")
    private Double starScore; // 별점 계산 분자값
    
    @ColumnDefault("0")
    private Double starCount; // 별점 계산 분모값

    private Timestamp createdAt;

    private Timestamp updatedAt;

    // 웹툰 내용 테이블 추가 필요
    

}
