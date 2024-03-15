package com.bera.questapp.responses;

import com.bera.questapp.entities.Like;
import com.bera.questapp.entities.Post;
import lombok.Data;

import java.util.List;

@Data
public class PostResponse {
    Long id;
    Long userId;
    String userName;
    String title;
    String text;
//    List<LikeResponse> postLikes;

    public PostResponse(Post entity){
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.userName = entity.getUser().getUserName();
        this.title = entity.getTitle();
        this.text = entity.getText();
//        this.postLikes = likes;
    }
}
