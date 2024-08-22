package com.choi.commentservice.service

import com.choi.commentservice.dto.Comment
import com.choi.commentservice.repository.CommentRepository
import org.springframework.stereotype.Service

@Service
class CommentService(private val commentRepository: CommentRepository) {

    fun createComment(comment: Comment): Comment {
        return commentRepository.save(comment)
    }

    fun getCommentsByPostId(postId: Long): List<Comment> {
        return commentRepository.findByPostId(postId)
    }

    fun deleteComment(id: Long) {
        commentRepository.deleteById(id)
    }
}