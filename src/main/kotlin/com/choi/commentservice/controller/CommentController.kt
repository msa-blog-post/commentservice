package com.choi.commentservice.controller

import com.choi.commentservice.dto.Comment
import com.choi.commentservice.service.CommentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/comments")
class CommentController(private val commentService: CommentService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createComment(@RequestBody comment: Comment): Comment {
        return commentService.createComment(comment)
    }

    @GetMapping("/post/{postId}")
    fun getCommentsByPostId(@PathVariable postId: Long): List<Comment> {
        return commentService.getCommentsByPostId(postId)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteComment(@PathVariable id: Long) {
        commentService.deleteComment(id)
    }
}