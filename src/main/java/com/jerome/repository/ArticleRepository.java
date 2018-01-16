package com.jerome.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jerome.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
	
	List<Article> findByTitre(String titre);

}
