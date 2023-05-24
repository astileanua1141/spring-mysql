package com.example.demo.repository;

import com.example.demo.model.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ArticleRepository extends PagingAndSortingRepository<Article, Integer> {

    @Query(value = "SELECT * FROM articles WHERE "
    + "MATCH(name, short_description, alias) "
    + "AGAINST (?1)",
    nativeQuery = true)
    public List<Article> search(String keyword);


}
