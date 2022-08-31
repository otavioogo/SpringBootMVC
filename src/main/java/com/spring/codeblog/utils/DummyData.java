package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {
    @Autowired
    CodeBlogRepository codeBlogRepository;

    //Comentando esse codigo pois vai aumentando a quantidade a cada vez que
    //executar a aplicacao
    //@PostConstruct
        public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Otavio Ogo");
        post1.setData(LocalDate.now());
        post1.setTitulo("DOCKER");
        post1.setTexto("SOU O BIXAO");

        Post post2 = new Post();
        post2.setAutor("Otavio Eidi");
        post2.setData(LocalDate.now());
        post2.setTitulo("API REST");
        post2.setTexto("SOU O BIXAO2");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeBlogRepository.save(post);
            System.out.println(postSaved.getId());
        }

    }

}
