package com.jooq.crud.service;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jooq.crud.model.Tables;
import com.jooq.crud.model.tables.pojos.Book;

@Service
public class BookService {

	@Autowired
    DSLContext context;

    public List<Book> getBooks(){
       return context
                .selectFrom(Tables.BOOK)
                .fetchInto(Book.class);
    }
    public void insertBook(Book book){
        context
                .insertInto(Tables.BOOK, Tables.BOOK.TITLE,
                            Tables.BOOK.AUTHOR)
                .values(book.getTitle(), book.getAuthor())
                .execute();
    }
    
    
    
}
