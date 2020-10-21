package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //LOMBOK ->entity클래스에서는 절대 setter 메서드를 만들지 않는다. 왜냐하면 클래스 인스턴스 값들이 언제 어디서 변해야 하는지 코드상으로 명확하게 구분할 수 없어 차후 기능 변경 시 정말 복잡해지기 때문임.
@NoArgsConstructor //LOMBOK 기본 생성자 자동추가
@Entity //JPA 카멜케이스 클래스 이름을 언더스코어네이밍으로 테이블 이름과 매칭
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성 규칙을 나타냄. BOOT 2.0에서는 IDENTITY 옵션 추가해야만 auto_increment가 된다.
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //LOMBOK 해당 클래스의 빌더 패턴 클래스 생성. 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함. 빌더를 사용하면 어느 필드에 어느 값을 채워야하는지 명확하게 인지할 수 있다.
    public Posts(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }
}
