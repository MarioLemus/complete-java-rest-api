package com.restApi.librarium.repos;

import com.restApi.librarium.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<BookModel, Long> {
}
