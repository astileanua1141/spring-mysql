package com.example.demo.repository;

import com.example.demo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServices {
    public static final int ARTICLES_PER_PAGE = 10;
    public static final int SEARCH_RESULTS_PER_PAGE = 10;

    @Autowired
    private ArticleRepository repo;

    public List<Article> search(String keyword){
        return repo.search(keyword);
    }

}
