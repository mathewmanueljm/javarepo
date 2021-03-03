package edu.webservices.springboot.basics.springbootsservices;

import java.util.List;
import java.util.Arrays;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/book")
	public List<Book> getAllBooks(){		
		return Arrays.asList(new Book(1l, "High Output Management", "Andrew Grove"));		
	}

}
