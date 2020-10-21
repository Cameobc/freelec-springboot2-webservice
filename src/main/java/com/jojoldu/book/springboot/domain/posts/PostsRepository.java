package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//myBatis에서 Dao 라고 불리는 DB Layer 접근자. JPA에서는 인터페이스로 생성후 JpaRepository<Entity 클래스, PK타입>을 상속하면 기본적인 CRUD메소드를 자동으로 생성
//@Repository 추가하지 않아도 되지만, Entity클래스와 기본 Entity Repository는 함께 위치해야 한다.
//Entity와 Repository는 함꼐 움직여야 하므로 도메인 패키지에서 함께 관리한다.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
