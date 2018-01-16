package com.coell.Coell.controller;

import com.coell.Coell.model.Article;
import com.coell.Coell.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
