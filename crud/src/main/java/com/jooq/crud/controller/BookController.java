package com.jooq.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jooq.crud.model.tables.pojos.Book;
import com.jooq.crud.service.BookService;

@RestController
public class BookController {
	@Autowired
    BookService bookService;
	
	@GetMapping("/book")
    public List<Book> getBooks(){
        return this.bookService.getBooks();
    }

    @PostMapping("/addBook")
    public void postBook(@RequestBody Book book){
        this.bookService.insertBook(book);
    }
    
//    @GetMapping("/getBookById/{id}")
//    public Result<Record> getBookById(@PathVariable Integer id){
//        return this.bookService.getBookById(id);
//    }
    
    @DeleteMapping("/deleteBook/{id}")
    public void deleteById(@PathVariable Integer id) {
    	this.bookService.deleteById(id);
    }
    
    @PutMapping("/update")
    public void update(@RequestBody Book book){
    	this.bookService.update(book);
    }
	
}
