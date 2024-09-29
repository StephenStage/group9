package org.group9.entity;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{
    
    public Book getByIsbn(long isbn);
}