package com.jooq.crud.service;

import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jooq.crud.model.Tables;
import com.jooq.crud.model.tables.pojos.Book;
import com.jooq.crud.model.tables.records.BookRecord;

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
    	BookRecord book1 = context.newRecord(Tables.BOOK);
    	book1.setTitle(book.getTitle());
    	book1.setAuthor(book.getAuthor());
    	book1.store();
    }
//    public Result<Record> getBookById(Integer id) {
//    	return context.select()
//    			 .from(Tables.BOOK)
//    			 .where(Tables.BOOK.ID.eq(1))
//    			 .fetch();
//    }
    public void deleteById(Integer id) {
    	BookRecord book = context.fetchOne(Tables.BOOK, Tables.BOOK.ID.eq(id));
    	book.delete();
    }
    
    public void update(Book book) {
    	BookRecord book1 = context.fetchOne(Tables.BOOK, Tables.BOOK.ID.eq(book.getId()));
    	book1.setTitle(book.getTitle());
    	book1.setAuthor(book.getAuthor());
    	book1.store();
    }
    

}
