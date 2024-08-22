package com.choi.commentservice.repository

import com.choi.commentservice.dto.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepository : JpaRepository<Comment, Long> {
    fun findByPostId(postId: Long): List<Comment>
}