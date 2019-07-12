package com.example.es_demo1.repository;

import com.example.es_demo1.domain.Article;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: mac
 * @Date: 2019-07-10 22:44
 * @Description: 沈泽鹏写点注释吧
 */
@Repository
public interface ArticleRepository extends ElasticsearchCrudRepository <Article,Long>{
    List<Article> findByTitleLike(String titile);
}
