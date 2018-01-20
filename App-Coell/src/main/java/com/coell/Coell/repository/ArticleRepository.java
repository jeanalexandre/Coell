package com.coell.Coell.repository;

import com.coell.Coell.model.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {
	
	List<Article> findByTitre(String titre);

}
