package com.bera.questapp.repos;

import com.bera.questapp.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Long> {

    List<Like> findByUserIdAndPostId(Long userId, Long postId);

    List<Like> findByUserId(Long userId);

    List<Like> findByPostId(Long postId);

    @Query(value = "select * from p_like where post_id in :postIds limit 5", nativeQuery = true)
    List<Like> findUserLikesByPostId(@Param("postIds") List<Long> postIds);
}
