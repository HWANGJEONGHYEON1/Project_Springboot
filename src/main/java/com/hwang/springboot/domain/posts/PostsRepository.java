package com.hwang.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * JpaRepository을 상속하면 자동으로 CRUD 메소드가 생성
 * Entity 클래스와 위치가 같아야함.
 */
public interface PostsRepository extends JpaRepository<Posts, Long> { // <Entity 클래스, PK타입>

    @Query("SELECT p FROM Posts p order by p.id desc")
    List<Posts> findAllDesc();
}
