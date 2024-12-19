package com.archi.content_calendar1.repository;

import com.archi.content_calendar1.model.Content;
import org.springframework.data.relational.core.sql.In;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

}
