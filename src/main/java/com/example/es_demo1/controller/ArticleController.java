package com.example.es_demo1.controller;

import com.example.es_demo1.domain.Article;
import com.example.es_demo1.service.ArticleService;
import com.example.es_demo1.utils.SzpJsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: mac
 * @Date: 2019-07-10 22:55
 * @Description: 沈泽鹏写点注释吧
 */
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @PostMapping("saveArticle")
    public SzpJsonResult saveArticle(Article article){
        articleService.saveArticle(article);
        return SzpJsonResult.ok();
    }
    @GetMapping("findArticleByTitle")
    public SzpJsonResult findArticleByTitle(String title){
        List<Article> articles=articleService.findArticleByTitle(title);
        return SzpJsonResult.ok(articles);
    }
    @GetMapping("findAllArticle")
    public SzpJsonResult findAllArticle(){
        List<Article> articles=articleService.findAllArticle();
        return SzpJsonResult.ok(articles);
    }
}
