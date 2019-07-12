package com.example.es_demo1.service;

import com.example.es_demo1.domain.Article;
import com.example.es_demo1.repository.ArticleRepository;
import org.apache.lucene.util.QueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: mac
 * @Date: 2019-07-10 23:04
 * @Description: 沈泽鹏写点注释吧
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public void saveArticle(Article article) {
        Article save = articleRepository.save(article);
    }

    @Override
    public List<Article> findArticleByTitle(String title) {
        //CriteriaQuery criteriaQuery=new CriteriaQuery();
        MatchQueryBuilder queryBuilder= QueryBuilders.matchQuery("title",title);
        Iterable<Article> list=articleRepository.findAll();
        List<Article> articlesList=new ArrayList<>();
        list.forEach(s->articlesList.add(s));
        return articlesList;
    }

    @Override
    public List<Article> findAllArticle() {
        Iterable<Article> list=articleRepository.findAll();
        List<Article> articlesList=new ArrayList<>();
        list.forEach(s->articlesList.add(s));
        return articlesList;
    }
}
