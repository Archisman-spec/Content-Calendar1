package com.archi.content_calendar1.repository;

import com.archi.content_calendar1.model.Content;
import com.archi.content_calendar1.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);

    @Query("""
 SELECT * FROM Content
where status = :status
""")
    List<Content> listByStatus(@Param("status")Status status);

}
