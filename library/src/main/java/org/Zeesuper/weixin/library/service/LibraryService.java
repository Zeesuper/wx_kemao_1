package org.Zeesuper.weixin.library.service;

import org.Zeesuper.weixin.library.domain.Book;
import org.springframework.data.domain.Page;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

}
