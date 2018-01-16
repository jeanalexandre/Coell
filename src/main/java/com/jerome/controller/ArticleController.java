package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.Article;
import com.jerome.repository.ArticleRepository;

@RestController
public class ArticleController {

	@Autowired
	ArticleRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/article")
    public Iterable<Article> findAll() {
    	Iterable<Article> articles= repo.findAll();
    	return articles;
    }
    

}
