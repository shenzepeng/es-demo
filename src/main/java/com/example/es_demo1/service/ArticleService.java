package com.example.es_demo1.service;

import com.example.es_demo1.domain.Article;

import java.util.List;

/**
 * @Auther: mac
 * @Date: 2019-07-10 23:00
 * @Description: 沈泽鹏写点注释吧
 */
public interface ArticleService {
    void saveArticle(Article article);
    List<Article> findArticleByTitle(String title);
    List<Article> findAllArticle();
}
