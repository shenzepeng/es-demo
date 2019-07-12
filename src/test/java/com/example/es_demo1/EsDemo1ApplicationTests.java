package com.example.es_demo1;

import com.example.es_demo1.domain.Article;
import com.example.es_demo1.repository.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsDemo1ApplicationTests {
    @Autowired
    private ArticleRepository articleRepository;
    @Test
    public void contextLoads() {
//        AtomicLong atomicLong=new AtomicLong(0);
//        while (true){
//            Article article=new Article();
//            article.setTitle(UUID.randomUUID().toString());
//            article.setId(atomicLong.get());
//            article.setContent(UUID.randomUUID().toString());
//            atomicLong.incrementAndGet();
//            Article article1=articleRepository.save(article);
//            System.out.println(article1);
//        }
        Iterable<Article> iterable=articleRepository.findAll();
        ArrayList<Article> articles=new ArrayList<>();
        iterable.forEach(s-> System.out.println(s));
       // sout
    }

}
